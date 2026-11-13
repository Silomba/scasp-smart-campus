## Course stage / unit
**Stage 9 — CORBA**  
**Owner:** Member B (replace with real GitHub assignee)  
**Required reviewer:** Member C (different account)  
**Lead responsibility this stage:** Architecture & Integration  
**Suggested branch:** `stage/09-b-write-corba-idl-and-migration-architecture`

## Files to work on
`docs/corba-migration/scasp.idl; docs/architecture/`

## Work to perform
**Write CORBA IDL and migration architecture**. Review and develop the implementation. If the supplied AI-assisted reference already contains some of this functionality, make a genuine change, verify it, explain your design and record the tested result. Never create empty or fake commits solely for attribution.

## Acceptance criteria
- [ ] IDL defines two operations equivalent to RMI, datatype mapping, ORB/naming interaction flow and adapter plan.
- [ ] Actual source, tests or documentation updated by assigned contributor.
- [ ] `mvn clean verify` passes, or explain exactly why and include appropriate Android/Payara/manual test evidence.
- [ ] Pull request links this issue, names a different reviewer, and updates `docs/contribution-log.csv`.
- [ ] Changes reviewed and merged to `main` only after meeting acceptance criteria.

## Example commit messages (use only when changes match)
- `docs(corba): define legacy reporting IDL`
- `docs(architecture): plan CORBA adapter migration`

## Assignment evidence
Attach meaningful screenshots, logs or code explanations and include their real timestamps, commit SHAs and PR links. Stage releases are tagged only when actually completed.
