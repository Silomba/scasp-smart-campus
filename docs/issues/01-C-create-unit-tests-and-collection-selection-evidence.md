## Course stage / unit
**Stage 1 — Collections**  
**Owner:** Member C (replace with real GitHub assignee)  
**Required reviewer:** Member A (different account)  
**Lead responsibility this stage:** Client, Quality & Documentation  
**Suggested branch:** `stage/01-c-create-unit-tests-and-collection-selection-evidence`

## Files to work on
`core-domain/src/test/java/zm/edu/scasp/InMemoryCampusPlatformTest.java; docs/testing/`

## Work to perform
**Create unit tests and collection-selection evidence**. Review and develop the implementation. If the supplied AI-assisted reference already contains some of this functionality, make a genuine change, verify it, explain your design and record the tested result. Never create empty or fake commits solely for attribution.

## Acceptance criteria
- [ ] Tests for duplicate, full course, invalid marks/status, priority, promotion and copy safety; explain chosen collections.
- [ ] Actual source, tests or documentation updated by assigned contributor.
- [ ] `mvn clean verify` passes, or explain exactly why and include appropriate Android/Payara/manual test evidence.
- [ ] Pull request links this issue, names a different reviewer, and updates `docs/contribution-log.csv`.
- [ ] Changes reviewed and merged to `main` only after meeting acceptance criteria.

## Example commit messages (use only when changes match)
- `test(core): cover duplicate enrolments and waitlist`
- `docs: justify collections and attach test results`

## Assignment evidence
Attach meaningful screenshots, logs or code explanations and include their real timestamps, commit SHAs and PR links. Stage releases are tagged only when actually completed.
