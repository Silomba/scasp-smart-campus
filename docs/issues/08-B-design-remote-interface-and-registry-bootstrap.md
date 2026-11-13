## Course stage / unit
**Stage 8 — RMI**  
**Owner:** Member B (replace with real GitHub assignee)  
**Required reviewer:** Member C (different account)  
**Lead responsibility this stage:** Architecture & Integration  
**Suggested branch:** `stage/08-b-design-remote-interface-and-registry-bootstrap`

## Files to work on
`rmi-administration/src/main/java/zm/edu/scasp/{RemoteAdmin,AdminServer}.java; docs/protocols/rmi.md`

## Work to perform
**Design Remote interface and registry bootstrap**. Review and develop the implementation. If the supplied AI-assisted reference already contains some of this functionality, make a genuine change, verify it, explain your design and record the tested result. Never create empty or fake commits solely for attribution.

## Acceptance criteria
- [ ] At least four read/admin operations, serializable DTOs and stable registry naming; explain pass-by-value/reference.
- [ ] Actual source, tests or documentation updated by assigned contributor.
- [ ] `mvn clean verify` passes, or explain exactly why and include appropriate Android/Payara/manual test evidence.
- [ ] Pull request links this issue, names a different reviewer, and updates `docs/contribution-log.csv`.
- [ ] Changes reviewed and merged to `main` only after meeting acceptance criteria.

## Example commit messages (use only when changes match)
- `feat(rmi): define remote reporting contract`
- `feat(rmi): register administration endpoint`

## Assignment evidence
Attach meaningful screenshots, logs or code explanations and include their real timestamps, commit SHAs and PR links. Stage releases are tagged only when actually completed.
