## Course stage / unit
**Stage 2 — Multithreading**  
**Owner:** Member B (replace with real GitHub assignee)  
**Required reviewer:** Member C (different account)  
**Lead responsibility this stage:** Backend & Data  
**Suggested branch:** `stage/02-b-implement-safe-concurrent-requests-and-virtual-thread-c`

## Files to work on
`concurrent-processing/src/main/java/zm/edu/scasp/{BoundedJobProcessor,ThreadModeComparison}.java`

## Work to perform
**Implement safe concurrent requests and virtual-thread comparison**. Review and develop the implementation. If the supplied AI-assisted reference already contains some of this functionality, make a genuine change, verify it, explain your design and record the tested result. Never create empty or fake commits solely for attribution.

## Acceptance criteria
- [ ] Prevent over-enrolment under contention; implement timeouts/rejection/interruption; compare platform and virtual threads with a measured workload.
- [ ] Actual source, tests or documentation updated by assigned contributor.
- [ ] `mvn clean verify` passes, or explain exactly why and include appropriate Android/Payara/manual test evidence.
- [ ] Pull request links this issue, names a different reviewer, and updates `docs/contribution-log.csv`.
- [ ] Changes reviewed and merged to `main` only after meeting acceptance criteria.

## Example commit messages (use only when changes match)
- `feat(concurrency): guard registration invariants under load`
- `perf(concurrency): compare thread execution models`

## Assignment evidence
Attach meaningful screenshots, logs or code explanations and include their real timestamps, commit SHAs and PR links. Stage releases are tagged only when actually completed.
