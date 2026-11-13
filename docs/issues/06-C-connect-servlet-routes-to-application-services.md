## Course stage / unit
**Stage 6 — Servlets**  
**Owner:** Member C (replace with real GitHub assignee)  
**Required reviewer:** Member A (different account)  
**Lead responsibility this stage:** Architecture & Integration  
**Suggested branch:** `stage/06-c-connect-servlet-routes-to-application-services`

## Files to work on
`web-application/src/main/java/zm/edu/scasp/{CoursesServlet,RegistrationServlet,RequestsServlet,ReportsServlet}.java`

## Work to perform
**Connect Servlet routes to application services**. Review and develop the implementation. If the supplied AI-assisted reference already contains some of this functionality, make a genuine change, verify it, explain your design and record the tested result. Never create empty or fake commits solely for attribution.

## Acceptance criteria
- [ ] Controllers delegate business logic, redirect after POST, set request attributes for JSP and preserve database consistency.
- [ ] Actual source, tests or documentation updated by assigned contributor.
- [ ] `mvn clean verify` passes, or explain exactly why and include appropriate Android/Payara/manual test evidence.
- [ ] Pull request links this issue, names a different reviewer, and updates `docs/contribution-log.csv`.
- [ ] Changes reviewed and merged to `main` only after meeting acceptance criteria.

## Example commit messages (use only when changes match)
- `feat(servlet): wire registration and waitlists`
- `feat(servlet): route staff reports and requests`

## Assignment evidence
Attach meaningful screenshots, logs or code explanations and include their real timestamps, commit SHAs and PR links. Stage releases are tagged only when actually completed.
