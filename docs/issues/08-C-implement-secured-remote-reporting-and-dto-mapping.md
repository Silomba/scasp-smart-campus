## Course stage / unit
**Stage 8 — RMI**  
**Owner:** Member C (replace with real GitHub assignee)  
**Required reviewer:** Member A (different account)  
**Lead responsibility this stage:** Backend & Data  
**Suggested branch:** `stage/08-c-implement-secured-remote-reporting-and-dto-mapping`

## Files to work on
`rmi-administration/src/main/java/zm/edu/scasp/RemoteAdminImpl.java; docs/architecture/`

## Work to perform
**Implement secured remote reporting and DTO mapping**. Review and develop the implementation. If the supplied AI-assisted reference already contains some of this functionality, make a genuine change, verify it, explain your design and record the tested result. Never create empty or fake commits solely for attribution.

## Acceptance criteria
- [ ] Implement four remote operations with restricted scope, RemoteException handling, no direct exposure of database objects.
- [ ] Actual source, tests or documentation updated by assigned contributor.
- [ ] `mvn clean verify` passes, or explain exactly why and include appropriate Android/Payara/manual test evidence.
- [ ] Pull request links this issue, names a different reviewer, and updates `docs/contribution-log.csv`.
- [ ] Changes reviewed and merged to `main` only after meeting acceptance criteria.

## Example commit messages (use only when changes match)
- `feat(rmi): implement read-only reporting functions`
- `fix(rmi): mask sensitive remote state`

## Assignment evidence
Attach meaningful screenshots, logs or code explanations and include their real timestamps, commit SHAs and PR links. Stage releases are tagged only when actually completed.
