## Course stage / unit
**Stage 2 — Multithreading**  
**Owner:** Member A (replace with real GitHub assignee)  
**Required reviewer:** Member B (different account)  
**Lead responsibility this stage:** Architecture & Integration  
**Suggested branch:** `stage/02-a-design-bounded-executor-api-and-lifecycle-metrics`

## Files to work on
`concurrent-processing/src/main/java/zm/edu/scasp/BoundedJobProcessor.java; docs/architecture/`

## Work to perform
**Design bounded executor API and lifecycle metrics**. Review and develop the implementation. If the supplied AI-assisted reference already contains some of this functionality, make a genuine change, verify it, explain your design and record the tested result. Never create empty or fake commits solely for attribution.

## Acceptance criteria
- [ ] Document task boundaries, configurable thread count and bounded queue; expose success/failure/latency counters; preserve orderly shutdown.
- [ ] Actual source, tests or documentation updated by assigned contributor.
- [ ] `mvn clean verify` passes, or explain exactly why and include appropriate Android/Payara/manual test evidence.
- [ ] Pull request links this issue, names a different reviewer, and updates `docs/contribution-log.csv`.
- [ ] Changes reviewed and merged to `main` only after meeting acceptance criteria.

## Example commit messages (use only when changes match)
- `refactor(concurrency): define bounded task API`
- `feat(concurrency): expose processing metrics`

## Assignment evidence
Attach meaningful screenshots, logs or code explanations and include their real timestamps, commit SHAs and PR links. Stage releases are tagged only when actually completed.
