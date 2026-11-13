## Course stage / unit
**Stage 4 — Enterprise Beans**  
**Owner:** Member A (replace with real GitHub assignee)  
**Required reviewer:** Member B (different account)  
**Lead responsibility this stage:** Backend & Data  
**Suggested branch:** `stage/04-a-implement-stateless-registration-ejb-with-transaction-b`

## Files to work on
`enterprise-services/src/main/java/zm/edu/scasp/{RegistrationBean,RegistrationBusiness}.java`

## Work to perform
**Implement stateless registration EJB with transaction boundary**. Review and develop the implementation. If the supplied AI-assisted reference already contains some of this functionality, make a genuine change, verify it, explain your design and record the tested result. Never create empty or fake commits solely for attribution.

## Acceptance criteria
- [ ] Use @Stateless, @Local, injection, transaction boundary and user-safe domain failure; compare JavaBean vs EJB.
- [ ] Actual source, tests or documentation updated by assigned contributor.
- [ ] `mvn clean verify` passes, or explain exactly why and include appropriate Android/Payara/manual test evidence.
- [ ] Pull request links this issue, names a different reviewer, and updates `docs/contribution-log.csv`.
- [ ] Changes reviewed and merged to `main` only after meeting acceptance criteria.

## Example commit messages (use only when changes match)
- `feat(ejb): implement transactional registration service`
- `fix(ejb): validate invalid registration requests`

## Assignment evidence
Attach meaningful screenshots, logs or code explanations and include their real timestamps, commit SHAs and PR links. Stage releases are tagged only when actually completed.
