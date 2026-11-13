## Course stage / unit
**Stage 3 — Networking**  
**Owner:** Member C (replace with real GitHub assignee)  
**Required reviewer:** Member A (different account)  
**Lead responsibility this stage:** Client, Quality & Documentation  
**Suggested branch:** `stage/03-c-implement-network-client-url-reader-and-failure-tests`

## Files to work on
`network-gateway/src/main/java/zm/edu/scasp/{GatewayClient,AuthorisedUrlReader}.java; docs/testing/`

## Work to perform
**Implement network client, URL reader and failure tests**. Review and develop the implementation. If the supplied AI-assisted reference already contains some of this functionality, make a genuine change, verify it, explain your design and record the tested result. Never create empty or fake commits solely for attribution.

## Acceptance criteria
- [ ] Run protocol demo; verify malformed, disconnected and timed-out clients; HTTP client safe failure; save packet/message trace.
- [ ] Actual source, tests or documentation updated by assigned contributor.
- [ ] `mvn clean verify` passes, or explain exactly why and include appropriate Android/Payara/manual test evidence.
- [ ] Pull request links this issue, names a different reviewer, and updates `docs/contribution-log.csv`.
- [ ] Changes reviewed and merged to `main` only after meeting acceptance criteria.

## Example commit messages (use only when changes match)
- `test(network): exercise invalid and disconnected clients`
- `feat(network): handle authorised URL failures`

## Assignment evidence
Attach meaningful screenshots, logs or code explanations and include their real timestamps, commit SHAs and PR links. Stage releases are tagged only when actually completed.
