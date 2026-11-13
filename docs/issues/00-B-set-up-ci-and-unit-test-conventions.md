## Course stage / unit
**Stage 0 — Inception**  
**Owner:** Member B (replace with real GitHub assignee)  
**Required reviewer:** Member C (different account)  
**Lead responsibility this stage:** Backend & Data  
**Suggested branch:** `stage/00-b-set-up-ci-and-unit-test-conventions`

## Files to work on
` .github/workflows/java-ci.yml; core-domain/pom.xml; docs/testing/test-plan.md`

## Work to perform
**Set up CI and unit-test conventions**. Review and develop the implementation. If the supplied AI-assisted reference already contains some of this functionality, make a genuine change, verify it, explain your design and record the tested result. Never create empty or fake commits solely for attribution.

## Acceptance criteria
- [ ] JDK 21 CI workflow, JUnit convention and local clean build captured; add check script or smoke test that really runs.
- [ ] Actual source, tests or documentation updated by assigned contributor.
- [ ] `mvn clean verify` passes, or explain exactly why and include appropriate Android/Payara/manual test evidence.
- [ ] Pull request links this issue, names a different reviewer, and updates `docs/contribution-log.csv`.
- [ ] Changes reviewed and merged to `main` only after meeting acceptance criteria.

## Example commit messages (use only when changes match)
- `ci: run Maven verification for PRs`
- `test: add baseline build smoke evidence`

## Assignment evidence
Attach meaningful screenshots, logs or code explanations and include their real timestamps, commit SHAs and PR links. Stage releases are tagged only when actually completed.
