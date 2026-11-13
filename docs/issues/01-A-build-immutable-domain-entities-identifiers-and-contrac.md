## Course stage / unit
**Stage 1 — Collections**  
**Owner:** Member A (replace with real GitHub assignee)  
**Required reviewer:** Member B (different account)  
**Lead responsibility this stage:** Architecture & Integration  
**Suggested branch:** `stage/01-a-build-immutable-domain-entities-identifiers-and-contrac`

## Files to work on
`core-domain/src/main/java/zm/edu/scasp/{User,Student,Course,Registration,Role,DomainRules}.java`

## Work to perform
**Build immutable domain entities, identifiers and contracts**. Review and develop the implementation. If the supplied AI-assisted reference already contains some of this functionality, make a genuine change, verify it, explain your design and record the tested result. Never create empty or fake commits solely for attribution.

## Acceptance criteria
- [ ] Unique identifiers, validation, equals/hashCode where applicable, controlled mutable state; explain domain rules.
- [ ] Actual source, tests or documentation updated by assigned contributor.
- [ ] `mvn clean verify` passes, or explain exactly why and include appropriate Android/Payara/manual test evidence.
- [ ] Pull request links this issue, names a different reviewer, and updates `docs/contribution-log.csv`.
- [ ] Changes reviewed and merged to `main` only after meeting acceptance criteria.

## Example commit messages (use only when changes match)
- `feat(domain): model students courses and registrations`
- `refactor(domain): enforce identity and status invariants`

## Assignment evidence
Attach meaningful screenshots, logs or code explanations and include their real timestamps, commit SHAs and PR links. Stage releases are tagged only when actually completed.
