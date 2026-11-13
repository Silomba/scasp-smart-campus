## Course stage / unit
**Stage 5 — JDBC**  
**Owner:** Member B (replace with real GitHub assignee)  
**Required reviewer:** Member C (different account)  
**Lead responsibility this stage:** Client, Quality & Documentation  
**Suggested branch:** `stage/05-b-write-jdbc-tests-joins-and-failure-rollback-evidence`

## Files to work on
`persistence-jdbc/src/test/java/zm/edu/scasp/JdbcCampusRepositoryTest.java; docs/testing/`

## Work to perform
**Write JDBC tests, joins and failure/rollback evidence**. Review and develop the implementation. If the supplied AI-assisted reference already contains some of this functionality, make a genuine change, verify it, explain your design and record the tested result. Never create empty or fake commits solely for attribution.

## Acceptance criteria
- [ ] Test commit/rollback, failed constraints, data retrieval and at least three joined reports with reproducible evidence.
- [ ] Actual source, tests or documentation updated by assigned contributor.
- [ ] `mvn clean verify` passes, or explain exactly why and include appropriate Android/Payara/manual test evidence.
- [ ] Pull request links this issue, names a different reviewer, and updates `docs/contribution-log.csv`.
- [ ] Changes reviewed and merged to `main` only after meeting acceptance criteria.

## Example commit messages (use only when changes match)
- `test(jdbc): verify rollback and constraint handling`
- `feat(reporting): add joined campus reports`

## Assignment evidence
Attach meaningful screenshots, logs or code explanations and include their real timestamps, commit SHAs and PR links. Stage releases are tagged only when actually completed.
