## Course stage / unit
**Stage 0 — Inception**  
**Owner:** Member A (replace with real GitHub assignee)  
**Required reviewer:** Member B (different account)  
**Lead responsibility this stage:** Architecture & Integration  
**Suggested branch:** `stage/00-a-prepare-maven-root-architecture-baseline-and-git-reposi`

## Files to work on
`pom.xml; */pom.xml; docs/architecture/README.md`

## Work to perform
**Prepare Maven root, architecture baseline and Git repository**. Review and develop the implementation. If the supplied AI-assisted reference already contains some of this functionality, make a genuine change, verify it, explain your design and record the tested result. Never create empty or fake commits solely for attribution.

## Acceptance criteria
- [ ] Parent and seven Maven modules open in NetBeans; context/component/domain diagrams; README and build baseline reviewed.
- [ ] Actual source, tests or documentation updated by assigned contributor.
- [ ] `mvn clean verify` passes, or explain exactly why and include appropriate Android/Payara/manual test evidence.
- [ ] Pull request links this issue, names a different reviewer, and updates `docs/contribution-log.csv`.
- [ ] Changes reviewed and merged to `main` only after meeting acceptance criteria.

## Example commit messages (use only when changes match)
- `chore: configure multi-module Maven parent`
- `docs: record SCASP architecture baseline`

## Assignment evidence
Attach meaningful screenshots, logs or code explanations and include their real timestamps, commit SHAs and PR links. Stage releases are tagged only when actually completed.
