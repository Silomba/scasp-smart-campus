## Course stage / unit
**Stage 6 — Servlets**  
**Owner:** Member B (replace with real GitHub assignee)  
**Required reviewer:** Member C (different account)  
**Lead responsibility this stage:** Client, Quality & Documentation  
**Suggested branch:** `stage/06-b-test-http-endpoints-and-response-handling`

## Files to work on
`web-application/src/main/java/zm/edu/scasp/{JsonApiServlet,JsonUtil}.java; docs/testing/; docs/protocols/http-api.md`

## Work to perform
**Test HTTP endpoints and response handling**. Review and develop the implementation. If the supplied AI-assisted reference already contains some of this functionality, make a genuine change, verify it, explain your design and record the tested result. Never create empty or fake commits solely for attribution.

## Acceptance criteria
- [ ] Record status codes for GET/POST, missing inputs, direct access and CSRF; document HTTP/mobile API contract.
- [ ] Actual source, tests or documentation updated by assigned contributor.
- [ ] `mvn clean verify` passes, or explain exactly why and include appropriate Android/Payara/manual test evidence.
- [ ] Pull request links this issue, names a different reviewer, and updates `docs/contribution-log.csv`.
- [ ] Changes reviewed and merged to `main` only after meeting acceptance criteria.

## Example commit messages (use only when changes match)
- `test(api): cover invalid and unauthorised responses`
- `docs(api): record mobile endpoint contracts`

## Assignment evidence
Attach meaningful screenshots, logs or code explanations and include their real timestamps, commit SHAs and PR links. Stage releases are tagged only when actually completed.
