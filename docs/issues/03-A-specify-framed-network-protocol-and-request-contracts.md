## Course stage / unit
**Stage 3 — Networking**  
**Owner:** Member A (replace with real GitHub assignee)  
**Required reviewer:** Member B (different account)  
**Lead responsibility this stage:** Architecture & Integration  
**Suggested branch:** `stage/03-a-specify-framed-network-protocol-and-request-contracts`

## Files to work on
`docs/protocols/tcp-protocol.md; network-gateway/src/main/java/zm/edu/scasp/GatewayClient.java`

## Work to perform
**Specify framed network protocol and request contracts**. Review and develop the implementation. If the supplied AI-assisted reference already contains some of this functionality, make a genuine change, verify it, explain your design and record the tested result. Never create empty or fake commits solely for attribution.

## Acceptance criteria
- [ ] Document at least four commands, UTF-8 framing, malformed commands, timeouts, error responses, authentication constraints.
- [ ] Actual source, tests or documentation updated by assigned contributor.
- [ ] `mvn clean verify` passes, or explain exactly why and include appropriate Android/Payara/manual test evidence.
- [ ] Pull request links this issue, names a different reviewer, and updates `docs/contribution-log.csv`.
- [ ] Changes reviewed and merged to `main` only after meeting acceptance criteria.

## Example commit messages (use only when changes match)
- `docs(network): define gateway command protocol`
- `feat(network): validate client command parsing`

## Assignment evidence
Attach meaningful screenshots, logs or code explanations and include their real timestamps, commit SHAs and PR links. Stage releases are tagged only when actually completed.
