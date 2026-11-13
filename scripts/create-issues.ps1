# Requires GitHub CLI: https://cli.github.com/
# Run ONLY after creating your repository and inviting the other two members.
param(
  [Parameter(Mandatory=$true)][string]$Repo,
  [Parameter(Mandatory=$true)][string]$MemberA,
  [Parameter(Mandatory=$true)][string]$MemberB,
  [Parameter(Mandatory=$true)][string]$MemberC
)
$ErrorActionPreference = "Stop"
$root = (Resolve-Path (Join-Path $PSScriptRoot "..")).Path
$csv = Join-Path $root "docs\TEAM-ISSUE-BACKLOG.csv"
if (!(Get-Command gh -ErrorAction SilentlyContinue)) { throw "Install GitHub CLI and run gh auth login first: https://cli.github.com/" }
& gh auth status
if ($LASTEXITCODE -ne 0) { throw "Sign in first with: gh auth login" }
$members=@{ A=$MemberA; B=$MemberB; C=$MemberC }
if (@($MemberA, $MemberB, $MemberC | Select-Object -Unique).Count -ne 3) { Write-Warning "Verify that all three member usernames are different." }
for ($i=0; $i -le 11; $i++) {
  & gh label create ("stage-{0}" -f $i) --repo $Repo --color "c8e6c9" --description "BoCS3100 stage $i" --force | Out-Null
}
foreach($m in @('A','B','C')) {
  & gh label create ("member-{0}" -f $m.ToLower()) --repo $Repo --color "ffbd80" --description "Assigned to Member $m" --force | Out-Null
}
$existingTitles = @(& gh issue list --repo $Repo --state all --limit 500 --json title --jq '.[].title')
foreach ($issue in (Import-Csv $csv)) {
  $title = "[{0}] {1}" -f $issue.ID, $issue.Title
  if ($existingTitles -contains $title) { Write-Host "Skipping existing issue: $title"; continue }
  $path = Join-Path $root ($issue.Issue_Body_File -replace '/','\')
  $user = $members[$issue.Owner]
  $args = @('issue','create','--repo',$Repo,'--title',$title,'--body-file',$path,'--label',("stage-{0}" -f $issue.Stage),'--label',("member-{0}" -f $issue.Owner.ToLower()))
  if ($user) { $args += @('--assignee',$user) }
  & gh @args
  if ($LASTEXITCODE -ne 0) { throw "Unable to create $title. Check repo permissions and assignee account." }
  Write-Host "Created $title (reviewer Member $($issue.Reviewer))"
}
Write-Host "Issues processed. Set different-member reviewers on each pull request."
