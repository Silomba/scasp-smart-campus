## Course stage / unit
**Stage 10 — Android**  
**Owner:** Member C (replace with real GitHub assignee)  
**Required reviewer:** Member A (different account)  
**Lead responsibility this stage:** Backend & Data  
**Suggested branch:** `stage/10-c-implement-api-synchronisation-and-offline-behaviour`

## Files to work on
`android-client/app/src/main/java/zm/edu/scasp/android/{ApiClient,RequestActivity,AnnouncementActivity}.java; docs/testing/`

## Work to perform
**Implement API synchronisation and offline behaviour**. Review and develop the implementation. If the supplied AI-assisted reference already contains some of this functionality, make a genuine change, verify it, explain your design and record the tested result. Never create empty or fake commits solely for attribution.

## Acceptance criteria
- [ ] Network off main thread, safe timeouts, cache/preferences, denied-permission and offline test evidence.
- [ ] Actual source, tests or documentation updated by assigned contributor.
- [ ] `mvn clean verify` passes, or explain exactly why and include appropriate Android/Payara/manual test evidence.
- [ ] Pull request links this issue, names a different reviewer, and updates `docs/contribution-log.csv`.
- [ ] Changes reviewed and merged to `main` only after meeting acceptance criteria.

## Example commit messages (use only when changes match)
- `feat(android): handle offline API requests gracefully`
- `test(android): cover permissions and empty data`

## Assignment evidence
Attach meaningful screenshots, logs or code explanations and include their real timestamps, commit SHAs and PR links. Stage releases are tagged only when actually completed.
