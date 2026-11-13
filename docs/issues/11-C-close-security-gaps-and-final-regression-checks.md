## Course stage / unit
**Stage 11 — Integration**  
**Owner:** Member C (replace with real GitHub assignee)  
**Required reviewer:** Member A (different account)  
**Lead responsibility this stage:** Backend & Data  
**Suggested branch:** `stage/11-c-close-security-gaps-and-final-regression-checks`

## Files to work on
`web-application/src/main/java/zm/edu/scasp/; persistence-jdbc/; docs/testing/`

## Work to perform
**Close security gaps and final regression checks**. Review and develop the implementation. If the supplied AI-assisted reference already contains some of this functionality, make a genuine change, verify it, explain your design and record the tested result. Never create empty or fake commits solely for attribution.

## Acceptance criteria
- [ ] Test role checks, CSRF, PreparedStatement, audit trail, cleanup and no secrets; review unresolved high-risk defects.
- [ ] Actual source, tests or documentation updated by assigned contributor.
- [ ] `mvn clean verify` passes, or explain exactly why and include appropriate Android/Payara/manual test evidence.
- [ ] Pull request links this issue, names a different reviewer, and updates `docs/contribution-log.csv`.
- [ ] Changes reviewed and merged to `main` only after meeting acceptance criteria.

## Example commit messages (use only when changes match)
- `fix(security): enforce authorization and validation`
- `test(security): verify audit and injection protection`

## Assignment evidence
Attach meaningful screenshots, logs or code explanations and include their real timestamps, commit SHAs and PR links. Stage releases are tagged only when actually completed.
