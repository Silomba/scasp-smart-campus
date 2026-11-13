# SCASP — real three-account GitHub workflow (Windows / NetBeans)

This guide assumes a repository named `Silomba/scasp-smart-campus`, **which you must actually create** before using the URL. If your repository is named differently, replace the URL. The uploaded NetBeans ZIP has seven Maven modules at the root; the Android client is a separate Android Studio Gradle project.

## Choose the truthful starting point

**Option 1 — FULL SOURCE BASELINE:** Extract `SCASP_GitHub_Ready_Source.zip`. Push one initial baseline commit from the contributor who imports it, noting it is an existing AI-assisted reference project; then each student genuinely fixes, extends, tests and reviews issues. Do not falsely present later commits as the original creation of imported code.

**Option 2 — STAGE 0 SCAFFOLD (recommended for rebuilding together):** Extract `SCASP_Stage0_Team_Scaffold.zip`. This contains Maven config, test workflow, tasks and a lightweight static web page, but deliberately omits most Java implementation. Three contributors progressively implement modules based on the assignment, using the provided full-source version as an acknowledged reference if allowed. The scaffold is **not** a complete working SCASP application until the issues are completed.

## 1. GitHub website

1. Sign into the **actual owner account** at https://github.com/new.
2. Create `scasp-smart-campus`, choosing appropriate visibility. Do **not** create README/.gitignore/license on GitHub, because those are already in the ZIP.
3. Once pushed, open repository **Settings → Collaborators** (or Collaborators and teams) and invite the other two real usernames; they accept from their accounts.
4. If branch protection is supported for your repository visibility/plan, create a rule for `main`: require PRs, one *different* approving reviewer, passing `build` check, and disable force pushes. On GitHub Free, branch protection for private repositories may be unavailable; if so follow the same review process voluntarily or use a supported plan/org.
5. Enable **Issues** and create milestone names `Stage 0` to `Stage 11` (optional), plus a Project board with `Backlog → In progress → In review → Done`.

## 2. Member A creates repository history

Run this from PowerShell in the extracted project **folder containing the root `pom.xml`**:

```powershell
cd "C:\Users\ELI\Desktop\SCASP_GitHub_Ready"
git init -b main
git config user.name "MEMBER_A_REAL_NAME"
git config user.email "MEMBER_A_VERIFIED_GITHUB_EMAIL"
git add .
git status --short
git commit -m "chore: import acknowledged SCASP reference baseline"
git remote add origin https://github.com/Silomba/scasp-smart-campus.git
git push -u origin main
```

For Stage0 scaffold, use its extracted folder instead and change commit text to `chore: initialise Maven team scaffold`. `git config` is local to this repository and email must be associated with the user's GitHub account. If `origin` already exists, inspect `git remote -v` before changing it. Never save access tokens in project files.

To see whether the project accidentally contains build output, run `git status --short` and confirm no `target/`, `build/`, `.class`, `.mv.db`, `.env` or secrets are being committed. The GitHub-ready ZIP has these removed.

## 3. Members B and C clone using their own GitHub accounts

Each member uses **their own computer or separate Git credentials/session**:

```powershell
cd "$HOME\Desktop"
git clone https://github.com/Silomba/scasp-smart-campus.git
cd scasp-smart-campus
git config user.name "YOUR_REAL_NAME"
git config user.email "YOUR_GITHUB_VERIFIED_EMAIL"
git remote -v
git switch main
git pull --ff-only origin main
```

Then each contributor chooses an issue assigned to them and creates a short-lived branch **from current main**:

```powershell
git switch -c stage/01-b-registration-waitlist
# Open project in NetBeans, implement ONLY the task, save/test it
git status
git add core-domain/src/main/java
# Stage only files you really changed
git commit -m "feat(core): enforce registration capacity and waitlist"
mvn clean verify
git push -u origin stage/01-b-registration-waitlist
```

Open the repository → **Compare & pull request** → target `main`, reference issue (e.g. `Closes #12`), request review from the assigned different member, record actual tests. After approval and green CI, **merge** the PR into `main`; use normal merge (not squashing) if retaining all authored commits is important. Different PR reviewers must not self-approve.

Before taking the next issue:

```powershell
git switch main
git pull --ff-only origin main
git switch -c stage/02-b-safe-executor
```

If two people need to edit the same file, coordinate via issues and review the first PR before starting the next. Avoid editing root POM and shared JSP fragments concurrently.

## 4. Create all 36 issues quickly (optional GitHub CLI)

Install GitHub CLI `gh` (https://cli.github.com/) on Windows, sign in once using `gh auth login`, and then from the extracted repo root run:

```powershell
.\scripts\create-issues.ps1 -Repo "Silomba/scasp-smart-campus" -MemberA "Silomba" -MemberB "ACTUAL_B_USERNAME" -MemberC "ACTUAL_C_USERNAME"
```

The script reads `docs/TEAM-ISSUE-BACKLOG.csv`, creates Stage and Member labels, skips exact issue titles that already exist, creates GitHub Issues from `docs/issues/*.md`, and assigns each to the given real account. It **does not** create fake commits. If you do not install `gh`, copy the title and body from each issue file and create issues manually at `https://github.com/Silomba/scasp-smart-campus/issues/new`.

## 5. Role rotation and release tags

- Stages 0–3: A architecture, B backend, C client/QA.
- Stages 4–7: A backend, B client/QA, C architecture.
- Stages 8–11: A client/QA, B architecture, C backend.
- At the end of each *actually completed* stage, merge all related PRs, collect proof, tag from `main`, e.g. for Stage 1:

```powershell
git switch main
git pull --ff-only origin main
git tag -a v1.0 -m "Stage 1 collections acceptance passed"
git push origin v1.0
```

Use stage tags `stage-0`, `v1.0`, `v2.0`... only for corresponding actual achievements. Existing source does not prove earlier stage demonstrations took place.

## 6. Prove three distinct, genuine contributors

```powershell
git switch main
git pull --ff-only origin main
git shortlog -sne HEAD
git log --format="%h | %an | %ae | %s" -30
```

Check `Insights → Contributors` in GitHub (may update with a delay), PR authored-by/reviewed-by history, issue owner and `docs/contribution-log.csv`. Commits need verified/associated GitHub account email to link to the correct person, and changes must merge into the default branch. A shared computer is okay only if everyone commits and authenticates as themselves; **never make up names, impersonate authors, or backdate history**.

## 7. Validate in NetBeans and Payara

NetBeans → File → Open Project → select root `pom.xml` in the extracted/cloned project. Use JDK 21; right-click parent → Clean and Build or from shell `mvn clean verify`. For full source only, configure Payara 6 for `web-application`, deploy the WAR and open http://localhost:8080/scasp/login. Android is a separate project opened in Android Studio.

The Stage0 scaffold intentionally has an `index.html` baseline at http://localhost:8080/scasp/ and no login until team PRs implement the backend. Record actual Payara, database, network and mobile demos rather than asserting success from source inspection.

## 8. Individual evidence checklist

For each issue: real owner + reviewer + timestamp, actual changed source and tests, commit SHA, PR URL, test/screenshot evidence, and which stage requirement is satisfied. Use `docs/contribution-log.csv`, `docs/peer-review-log.csv`, and the `.github/PULL_REQUEST_TEMPLATE.md` included in your project.

## Academic integrity

The provided full-source files contain externally generated assistance. The coursework explicitly requires acknowledging assistance and explaining your own code. Use the prepared starter code as a disclosed reference, verify it, and make substantive individual contributions. Do not pretend that existing imported code was independently created by three students.
