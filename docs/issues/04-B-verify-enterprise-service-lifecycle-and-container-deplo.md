## Course stage / unit
**Stage 4 — Enterprise Beans**  
**Owner:** Member B (replace with real GitHub assignee)  
**Required reviewer:** Member C (different account)  
**Lead responsibility this stage:** Client, Quality & Documentation  
**Suggested branch:** `stage/04-b-verify-enterprise-service-lifecycle-and-container-deplo`

## Files to work on
`enterprise-services/README.md; web-application/; docs/testing/`

## Work to perform
**Verify enterprise service lifecycle and container deployment**. Review and develop the implementation. If the supplied AI-assisted reference already contains some of this functionality, make a genuine change, verify it, explain your design and record the tested result. Never create empty or fake commits solely for attribution.

## Acceptance criteria
- [ ] Deploy to Payara, inspect @EJB injection and transaction rollback, record evidence and documented test cases.
- [ ] Actual source, tests or documentation updated by assigned contributor.
- [ ] `mvn clean verify` passes, or explain exactly why and include appropriate Android/Payara/manual test evidence.
- [ ] Pull request links this issue, names a different reviewer, and updates `docs/contribution-log.csv`.
- [ ] Changes reviewed and merged to `main` only after meeting acceptance criteria.

## Example commit messages (use only when changes match)
- `test(ejb): verify rollback on failed registration`
- `docs(ejb): record Payara deployment evidence`

## Assignment evidence
Attach meaningful screenshots, logs or code explanations and include their real timestamps, commit SHAs and PR links. Stage releases are tagged only when actually completed.
