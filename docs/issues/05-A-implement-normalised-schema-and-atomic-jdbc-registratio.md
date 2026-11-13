## Course stage / unit
**Stage 5 — JDBC**  
**Owner:** Member A (replace with real GitHub assignee)  
**Required reviewer:** Member B (different account)  
**Lead responsibility this stage:** Backend & Data  
**Suggested branch:** `stage/05-a-implement-normalised-schema-and-atomic-jdbc-registratio`

## Files to work on
`database/schema.sql; persistence-jdbc/src/main/java/zm/edu/scasp/JdbcCampusRepository.java`

## Work to perform
**Implement normalised schema and atomic JDBC registration**. Review and develop the implementation. If the supplied AI-assisted reference already contains some of this functionality, make a genuine change, verify it, explain your design and record the tested result. Never create empty or fake commits solely for attribution.

## Acceptance criteria
- [ ] Keys, constraints, indexed queries, PreparedStatement; one transaction updates registration/waitlist/audit atomically.
- [ ] Actual source, tests or documentation updated by assigned contributor.
- [ ] `mvn clean verify` passes, or explain exactly why and include appropriate Android/Payara/manual test evidence.
- [ ] Pull request links this issue, names a different reviewer, and updates `docs/contribution-log.csv`.
- [ ] Changes reviewed and merged to `main` only after meeting acceptance criteria.

## Example commit messages (use only when changes match)
- `feat(db): enforce schema keys and indexes`
- `feat(jdbc): transact enrolment waitlist and audit`

## Assignment evidence
Attach meaningful screenshots, logs or code explanations and include their real timestamps, commit SHAs and PR links. Stage releases are tagged only when actually completed.
