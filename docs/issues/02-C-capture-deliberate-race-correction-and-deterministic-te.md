## Course stage / unit
**Stage 2 — Multithreading**  
**Owner:** Member C (replace with real GitHub assignee)  
**Required reviewer:** Member A (different account)  
**Lead responsibility this stage:** Client, Quality & Documentation  
**Suggested branch:** `stage/02-c-capture-deliberate-race-correction-and-deterministic-te`

## Files to work on
`concurrent-processing/src/main/java/zm/edu/scasp/RaceConditionDemo.java; concurrent-processing/src/test/; docs/testing/`

## Work to perform
**Capture deliberate race, correction and deterministic tests**. Review and develop the implementation. If the supplied AI-assisted reference already contains some of this functionality, make a genuine change, verify it, explain your design and record the tested result. Never create empty or fake commits solely for attribution.

## Acceptance criteria
- [ ] Show a failing unsafe example then a corrected safe version; use latches/barriers, collect a thread dump and test evidence.
- [ ] Actual source, tests or documentation updated by assigned contributor.
- [ ] `mvn clean verify` passes, or explain exactly why and include appropriate Android/Payara/manual test evidence.
- [ ] Pull request links this issue, names a different reviewer, and updates `docs/contribution-log.csv`.
- [ ] Changes reviewed and merged to `main` only after meeting acceptance criteria.

## Example commit messages (use only when changes match)
- `test(concurrency): reproduce controlled race condition`
- `fix(concurrency): assert atomic enrolment under contention`

## Assignment evidence
Attach meaningful screenshots, logs or code explanations and include their real timestamps, commit SHAs and PR links. Stage releases are tagged only when actually completed.
