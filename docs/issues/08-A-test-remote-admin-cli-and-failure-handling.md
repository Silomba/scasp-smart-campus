## Course stage / unit
**Stage 8 — RMI**  
**Owner:** Member A (replace with real GitHub assignee)  
**Required reviewer:** Member B (different account)  
**Lead responsibility this stage:** Client, Quality & Documentation  
**Suggested branch:** `stage/08-a-test-remote-admin-cli-and-failure-handling`

## Files to work on
`rmi-administration/src/main/java/zm/edu/scasp/AdminClient.java; docs/testing/`

## Work to perform
**Test remote admin CLI and failure handling**. Review and develop the implementation. If the supplied AI-assisted reference already contains some of this functionality, make a genuine change, verify it, explain your design and record the tested result. Never create empty or fake commits solely for attribution.

## Acceptance criteria
- [ ] Run separate-process lookup/metrics, simulate registry-down failure and document output; client never sees internals.
- [ ] Actual source, tests or documentation updated by assigned contributor.
- [ ] `mvn clean verify` passes, or explain exactly why and include appropriate Android/Payara/manual test evidence.
- [ ] Pull request links this issue, names a different reviewer, and updates `docs/contribution-log.csv`.
- [ ] Changes reviewed and merged to `main` only after meeting acceptance criteria.

## Example commit messages (use only when changes match)
- `test(rmi): handle unavailable registry and server`
- `feat(rmi-client): present read-only admin reports`

## Assignment evidence
Attach meaningful screenshots, logs or code explanations and include their real timestamps, commit SHAs and PR links. Stage releases are tagged only when actually completed.
