## Course stage / unit
**Stage 7 — JSP/Jakarta Pages**  
**Owner:** Member C (replace with real GitHub assignee)  
**Required reviewer:** Member A (different account)  
**Lead responsibility this stage:** Architecture & Integration  
**Suggested branch:** `stage/07-c-refactor-jsp-fragments-and-verify-full-mvc-workflow`

## Files to work on
`web-application/src/main/webapp/WEB-INF/views/fragments/; docs/user-guide/; docs/testing/`

## Work to perform
**Refactor JSP fragments and verify full MVC workflow**. Review and develop the implementation. If the supplied AI-assisted reference already contains some of this functionality, make a genuine change, verify it, explain your design and record the tested result. Never create empty or fake commits solely for attribution.

## Acceptance criteria
- [ ] Reusable head/navbar/footer, correct JSTL taglib declarations, role-aware menu, screenshots and MVC flow recorded.
- [ ] Actual source, tests or documentation updated by assigned contributor.
- [ ] `mvn clean verify` passes, or explain exactly why and include appropriate Android/Payara/manual test evidence.
- [ ] Pull request links this issue, names a different reviewer, and updates `docs/contribution-log.csv`.
- [ ] Changes reviewed and merged to `main` only after meeting acceptance criteria.

## Example commit messages (use only when changes match)
- `refactor(jsp): reuse safe shared layout fragments`
- `test(ui): document end-to-end registration flow`

## Assignment evidence
Attach meaningful screenshots, logs or code explanations and include their real timestamps, commit SHAs and PR links. Stage releases are tagged only when actually completed.
