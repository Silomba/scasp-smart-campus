## Course stage / unit
**Stage 4 — Enterprise Beans**  
**Owner:** Member C (replace with real GitHub assignee)  
**Required reviewer:** Member A (different account)  
**Lead responsibility this stage:** Architecture & Integration  
**Suggested branch:** `stage/04-c-build-singleton-metrics-and-enterprise-architecture-wir`

## Files to work on
`enterprise-services/src/main/java/zm/edu/scasp/RuntimeMetricsBean.java; docs/architecture/`

## Work to perform
**Build singleton metrics and enterprise architecture wiring**. Review and develop the implementation. If the supplied AI-assisted reference already contains some of this functionality, make a genuine change, verify it, explain your design and record the tested result. Never create empty or fake commits solely for attribution.

## Acceptance criteria
- [ ] Singleton/metrics lifecycle callback, dependency graph, timer or documented supported alternative, and explanation of entity-bean replacement.
- [ ] Actual source, tests or documentation updated by assigned contributor.
- [ ] `mvn clean verify` passes, or explain exactly why and include appropriate Android/Payara/manual test evidence.
- [ ] Pull request links this issue, names a different reviewer, and updates `docs/contribution-log.csv`.
- [ ] Changes reviewed and merged to `main` only after meeting acceptance criteria.

## Example commit messages (use only when changes match)
- `feat(ejb): implement singleton service metrics`
- `docs(architecture): map EJB lifecycle and dependencies`

## Assignment evidence
Attach meaningful screenshots, logs or code explanations and include their real timestamps, commit SHAs and PR links. Stage releases are tagged only when actually completed.
