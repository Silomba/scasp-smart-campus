## Course stage / unit
**Stage 6 — Servlets**  
**Owner:** Member A (replace with real GitHub assignee)  
**Required reviewer:** Member B (different account)  
**Lead responsibility this stage:** Backend & Data  
**Suggested branch:** `stage/06-a-secure-login-logout-and-session-filters`

## Files to work on
`web-application/src/main/java/zm/edu/scasp/{LoginServlet,LogoutServlet,AuthFilter,WebSupport}.java`

## Work to perform
**Secure login, logout and session filters**. Review and develop the implementation. If the supplied AI-assisted reference already contains some of this functionality, make a genuine change, verify it, explain your design and record the tested result. Never create empty or fake commits solely for attribution.

## Acceptance criteria
- [ ] GET vs POST respected, session regeneration, input validation, role protection, error states and safe logout; test denial.
- [ ] Actual source, tests or documentation updated by assigned contributor.
- [ ] `mvn clean verify` passes, or explain exactly why and include appropriate Android/Payara/manual test evidence.
- [ ] Pull request links this issue, names a different reviewer, and updates `docs/contribution-log.csv`.
- [ ] Changes reviewed and merged to `main` only after meeting acceptance criteria.

## Example commit messages (use only when changes match)
- `feat(web): add role checked session routing`
- `test(web): deny unauthorised staff endpoints`

## Assignment evidence
Attach meaningful screenshots, logs or code explanations and include their real timestamps, commit SHAs and PR links. Stage releases are tagged only when actually completed.
