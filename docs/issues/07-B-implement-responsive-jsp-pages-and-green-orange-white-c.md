## Course stage / unit
**Stage 7 — JSP/Jakarta Pages**  
**Owner:** Member B (replace with real GitHub assignee)  
**Required reviewer:** Member C (different account)  
**Lead responsibility this stage:** Client, Quality & Documentation  
**Suggested branch:** `stage/07-b-implement-responsive-jsp-pages-and-green-orange-white-c`

## Files to work on
`web-application/src/main/webapp/WEB-INF/views/{login,dashboard,courses,requests,reports}.jsp; web-application/src/main/webapp/static/{app.css,app.js}`

## Work to perform
**Implement responsive JSP pages and green/orange/white CSS**. Review and develop the implementation. If the supplied AI-assisted reference already contains some of this functionality, make a genuine change, verify it, explain your design and record the tested result. Never create empty or fake commits solely for attribution.

## Acceptance criteria
- [ ] Responsive student/staff UI, navigation, field-level errors, keyboard access, mobile layout and evidence from two outside-student usability tests.
- [ ] Actual source, tests or documentation updated by assigned contributor.
- [ ] `mvn clean verify` passes, or explain exactly why and include appropriate Android/Payara/manual test evidence.
- [ ] Pull request links this issue, names a different reviewer, and updates `docs/contribution-log.csv`.
- [ ] Changes reviewed and merged to `main` only after meeting acceptance criteria.

## Example commit messages (use only when changes match)
- `feat(ui): style login dashboard and course forms`
- `fix(ui): improve mobile and keyboard navigation`

## Assignment evidence
Attach meaningful screenshots, logs or code explanations and include their real timestamps, commit SHAs and PR links. Stage releases are tagged only when actually completed.
