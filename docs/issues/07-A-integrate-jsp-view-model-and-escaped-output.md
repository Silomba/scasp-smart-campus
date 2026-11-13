## Course stage / unit
**Stage 7 — JSP/Jakarta Pages**  
**Owner:** Member A (replace with real GitHub assignee)  
**Required reviewer:** Member B (different account)  
**Lead responsibility this stage:** Backend & Data  
**Suggested branch:** `stage/07-a-integrate-jsp-view-model-and-escaped-output`

## Files to work on
`web-application/src/main/java/zm/edu/scasp/{DashboardServlet,AnnouncementsServlet,CampusServlet}.java; web-application/src/main/webapp/WEB-INF/views/`

## Work to perform
**Integrate JSP view-model and escaped output**. Review and develop the implementation. If the supplied AI-assisted reference already contains some of this functionality, make a genuine change, verify it, explain your design and record the tested result. Never create empty or fake commits solely for attribution.

## Acceptance criteria
- [ ] Provide scoped attributes, EL, escape user strings and no Java scriptlets; ensure JSP pages compile in Payara.
- [ ] Actual source, tests or documentation updated by assigned contributor.
- [ ] `mvn clean verify` passes, or explain exactly why and include appropriate Android/Payara/manual test evidence.
- [ ] Pull request links this issue, names a different reviewer, and updates `docs/contribution-log.csv`.
- [ ] Changes reviewed and merged to `main` only after meeting acceptance criteria.

## Example commit messages (use only when changes match)
- `feat(mvc): supply safe dashboard view models`
- `fix(jsp): escape user-controlled output`

## Assignment evidence
Attach meaningful screenshots, logs or code explanations and include their real timestamps, commit SHAs and PR links. Stage releases are tagged only when actually completed.
