# SCASP — 36 GitHub Issues and staged commit plan

There are **36 tasks (3 per stage, 12 per member)**, mapped to the actual source tree in the uploaded ZIP and to Stages 0–11 in the assignment. The tasks are a suggested division, not proof of completed work. Keep code author names and stage tags truthful.

## Mandatory leadership rotation

| Stages | Member A | Member B | Member C |
|---|---|---|---|
| 0–3 | Architecture & Integration | Backend & Data | Client, Quality & Documentation |
| 4–7 | Backend & Data | Client, Quality & Documentation | Architecture & Integration |
| 8–11 | Client, Quality & Documentation | Architecture & Integration | Backend & Data |

Suggested review cycle: A's PR reviewed by B; B's by C; C's by A. Change if a member cannot review, but the reviewer must be a different actual group member.

## Work sequencing

Within each stage, integrate interface/architecture tasks first, then implementation, then QA/client as applicable. Resolve dependencies before starting tasks that call unfinished classes. Use **one issue → one branch → one pull request**. Each PR may contain multiple *genuine*, logically grouped commits. After the whole stage is reviewed, demo and tag it (`stage-0`, `v1.0`, ..., `v11.0`); never predate releases.

## Issues by stage

### Stage 0: Inception — Prep / Repository & requirements
- **S00-A · Member A** (reviewed by B): Prepare Maven root, architecture baseline and Git repository — `stage/00-a-prepare-maven-root-architecture-baseline-and-git-reposi`  
  Scope: `pom.xml; */pom.xml; docs/architecture/README.md`.  
  Commits: `chore: configure multi-module Maven parent`; `docs: record SCASP architecture baseline`.
- **S00-B · Member B** (reviewed by C): Set up CI and unit-test conventions — `stage/00-b-set-up-ci-and-unit-test-conventions`  
  Scope: ` .github/workflows/java-ci.yml; core-domain/pom.xml; docs/testing/test-plan.md`.  
  Commits: `ci: run Maven verification for PRs`; `test: add baseline build smoke evidence`.
- **S00-C · Member C** (reviewed by A): Write charter, requirements, risk and student experience baseline — `stage/00-c-write-charter-requirements-risk-and-student-experience-`  
  Scope: `docs/requirements.md; docs/team-and-risk-plan.md; web-application/src/main/webapp/index.html`.  
  Commits: `docs: add prioritised requirements and risks`; `feat: add accessible baseline welcome page`.
### Stage 1: Collections — Unit 1: in-memory domain
- **S01-A · Member A** (reviewed by B): Build immutable domain entities, identifiers and contracts — `stage/01-a-build-immutable-domain-entities-identifiers-and-contrac`  
  Scope: `core-domain/src/main/java/zm/edu/scasp/{User,Student,Course,Registration,Role,DomainRules}.java`.  
  Commits: `feat(domain): model students courses and registrations`; `refactor(domain): enforce identity and status invariants`.
- **S01-B · Member B** (reviewed by C): Implement collections, capacity and waiting-list promotion — `stage/01-b-implement-collections-capacity-and-waiting-list-promoti`  
  Scope: `core-domain/src/main/java/zm/edu/scasp/InMemoryCampusPlatform.java`.  
  Commits: `feat(core): enforce registration capacity and uniqueness`; `feat(core): promote earliest eligible waitlisted student`.
- **S01-C · Member C** (reviewed by A): Create unit tests and collection-selection evidence — `stage/01-c-create-unit-tests-and-collection-selection-evidence`  
  Scope: `core-domain/src/test/java/zm/edu/scasp/InMemoryCampusPlatformTest.java; docs/testing/`.  
  Commits: `test(core): cover duplicate enrolments and waitlist`; `docs: justify collections and attach test results`.
### Stage 2: Multithreading — Unit 2: concurrent processing
- **S02-A · Member A** (reviewed by B): Design bounded executor API and lifecycle metrics — `stage/02-a-design-bounded-executor-api-and-lifecycle-metrics`  
  Scope: `concurrent-processing/src/main/java/zm/edu/scasp/BoundedJobProcessor.java; docs/architecture/`.  
  Commits: `refactor(concurrency): define bounded task API`; `feat(concurrency): expose processing metrics`.
- **S02-B · Member B** (reviewed by C): Implement safe concurrent requests and virtual-thread comparison — `stage/02-b-implement-safe-concurrent-requests-and-virtual-thread-c`  
  Scope: `concurrent-processing/src/main/java/zm/edu/scasp/{BoundedJobProcessor,ThreadModeComparison}.java`.  
  Commits: `feat(concurrency): guard registration invariants under load`; `perf(concurrency): compare thread execution models`.
- **S02-C · Member C** (reviewed by A): Capture deliberate race, correction and deterministic tests — `stage/02-c-capture-deliberate-race-correction-and-deterministic-te`  
  Scope: `concurrent-processing/src/main/java/zm/edu/scasp/RaceConditionDemo.java; concurrent-processing/src/test/; docs/testing/`.  
  Commits: `test(concurrency): reproduce controlled race condition`; `fix(concurrency): assert atomic enrolment under contention`.
### Stage 3: Networking — Unit 3: campus TCP/UDP gateway
- **S03-A · Member A** (reviewed by B): Specify framed network protocol and request contracts — `stage/03-a-specify-framed-network-protocol-and-request-contracts`  
  Scope: `docs/protocols/tcp-protocol.md; network-gateway/src/main/java/zm/edu/scasp/GatewayClient.java`.  
  Commits: `docs(network): define gateway command protocol`; `feat(network): validate client command parsing`.
- **S03-B · Member B** (reviewed by C): Build concurrent TCP gateway and UDP notifications — `stage/03-b-build-concurrent-tcp-gateway-and-udp-notifications`  
  Scope: `network-gateway/src/main/java/zm/edu/scasp/{GatewayServer,CampusNotificationSender,UdpHeartbeat}.java`.  
  Commits: `feat(network): serve concurrent TCP clients`; `feat(network): send UDP heartbeat notifications`.
- **S03-C · Member C** (reviewed by A): Implement network client, URL reader and failure tests — `stage/03-c-implement-network-client-url-reader-and-failure-tests`  
  Scope: `network-gateway/src/main/java/zm/edu/scasp/{GatewayClient,AuthorisedUrlReader}.java; docs/testing/`.  
  Commits: `test(network): exercise invalid and disconnected clients`; `feat(network): handle authorised URL failures`.
### Stage 4: Enterprise Beans — Unit 4: container business services
- **S04-A · Member A** (reviewed by B): Implement stateless registration EJB with transaction boundary — `stage/04-a-implement-stateless-registration-ejb-with-transaction-b`  
  Scope: `enterprise-services/src/main/java/zm/edu/scasp/{RegistrationBean,RegistrationBusiness}.java`.  
  Commits: `feat(ejb): implement transactional registration service`; `fix(ejb): validate invalid registration requests`.
- **S04-B · Member B** (reviewed by C): Verify enterprise service lifecycle and container deployment — `stage/04-b-verify-enterprise-service-lifecycle-and-container-deplo`  
  Scope: `enterprise-services/README.md; web-application/; docs/testing/`.  
  Commits: `test(ejb): verify rollback on failed registration`; `docs(ejb): record Payara deployment evidence`.
- **S04-C · Member C** (reviewed by A): Build singleton metrics and enterprise architecture wiring — `stage/04-c-build-singleton-metrics-and-enterprise-architecture-wir`  
  Scope: `enterprise-services/src/main/java/zm/edu/scasp/RuntimeMetricsBean.java; docs/architecture/`.  
  Commits: `feat(ejb): implement singleton service metrics`; `docs(architecture): map EJB lifecycle and dependencies`.
### Stage 5: JDBC — Unit 5: persistence and transactions
- **S05-A · Member A** (reviewed by B): Implement normalised schema and atomic JDBC registration — `stage/05-a-implement-normalised-schema-and-atomic-jdbc-registratio`  
  Scope: `database/schema.sql; persistence-jdbc/src/main/java/zm/edu/scasp/JdbcCampusRepository.java`.  
  Commits: `feat(db): enforce schema keys and indexes`; `feat(jdbc): transact enrolment waitlist and audit`.
- **S05-B · Member B** (reviewed by C): Write JDBC tests, joins and failure/rollback evidence — `stage/05-b-write-jdbc-tests-joins-and-failure-rollback-evidence`  
  Scope: `persistence-jdbc/src/test/java/zm/edu/scasp/JdbcCampusRepositoryTest.java; docs/testing/`.  
  Commits: `test(jdbc): verify rollback and constraint handling`; `feat(reporting): add joined campus reports`.
- **S05-C · Member C** (reviewed by A): Integrate DataSource/pooling and document data dictionary — `stage/05-c-integrate-datasource-pooling-and-document-data-dictiona`  
  Scope: `persistence-jdbc/src/main/java/zm/edu/scasp/DatabaseConfig.java; docs/architecture/; database/README.md`.  
  Commits: `refactor(jdbc): configure pooled DataSource integration`; `docs(db): document schema and persistence flow`.
### Stage 6: Servlets — Unit 6: HTTP application controllers
- **S06-A · Member A** (reviewed by B): Secure login, logout and session filters — `stage/06-a-secure-login-logout-and-session-filters`  
  Scope: `web-application/src/main/java/zm/edu/scasp/{LoginServlet,LogoutServlet,AuthFilter,WebSupport}.java`.  
  Commits: `feat(web): add role checked session routing`; `test(web): deny unauthorised staff endpoints`.
- **S06-B · Member B** (reviewed by C): Test HTTP endpoints and response handling — `stage/06-b-test-http-endpoints-and-response-handling`  
  Scope: `web-application/src/main/java/zm/edu/scasp/{JsonApiServlet,JsonUtil}.java; docs/testing/; docs/protocols/http-api.md`.  
  Commits: `test(api): cover invalid and unauthorised responses`; `docs(api): record mobile endpoint contracts`.
- **S06-C · Member C** (reviewed by A): Connect Servlet routes to application services — `stage/06-c-connect-servlet-routes-to-application-services`  
  Scope: `web-application/src/main/java/zm/edu/scasp/{CoursesServlet,RegistrationServlet,RequestsServlet,ReportsServlet}.java`.  
  Commits: `feat(servlet): wire registration and waitlists`; `feat(servlet): route staff reports and requests`.
### Stage 7: JSP/Jakarta Pages — Unit 7: responsive MVC views
- **S07-A · Member A** (reviewed by B): Integrate JSP view-model and escaped output — `stage/07-a-integrate-jsp-view-model-and-escaped-output`  
  Scope: `web-application/src/main/java/zm/edu/scasp/{DashboardServlet,AnnouncementsServlet,CampusServlet}.java; web-application/src/main/webapp/WEB-INF/views/`.  
  Commits: `feat(mvc): supply safe dashboard view models`; `fix(jsp): escape user-controlled output`.
- **S07-B · Member B** (reviewed by C): Implement responsive JSP pages and green/orange/white CSS — `stage/07-b-implement-responsive-jsp-pages-and-green-orange-white-c`  
  Scope: `web-application/src/main/webapp/WEB-INF/views/{login,dashboard,courses,requests,reports}.jsp; web-application/src/main/webapp/static/{app.css,app.js}`.  
  Commits: `feat(ui): style login dashboard and course forms`; `fix(ui): improve mobile and keyboard navigation`.
- **S07-C · Member C** (reviewed by A): Refactor JSP fragments and verify full MVC workflow — `stage/07-c-refactor-jsp-fragments-and-verify-full-mvc-workflow`  
  Scope: `web-application/src/main/webapp/WEB-INF/views/fragments/; docs/user-guide/; docs/testing/`.  
  Commits: `refactor(jsp): reuse safe shared layout fragments`; `test(ui): document end-to-end registration flow`.
### Stage 8: RMI — Unit 8: remote administration
- **S08-A · Member A** (reviewed by B): Test remote admin CLI and failure handling — `stage/08-a-test-remote-admin-cli-and-failure-handling`  
  Scope: `rmi-administration/src/main/java/zm/edu/scasp/AdminClient.java; docs/testing/`.  
  Commits: `test(rmi): handle unavailable registry and server`; `feat(rmi-client): present read-only admin reports`.
- **S08-B · Member B** (reviewed by C): Design Remote interface and registry bootstrap — `stage/08-b-design-remote-interface-and-registry-bootstrap`  
  Scope: `rmi-administration/src/main/java/zm/edu/scasp/{RemoteAdmin,AdminServer}.java; docs/protocols/rmi.md`.  
  Commits: `feat(rmi): define remote reporting contract`; `feat(rmi): register administration endpoint`.
- **S08-C · Member C** (reviewed by A): Implement secured remote reporting and DTO mapping — `stage/08-c-implement-secured-remote-reporting-and-dto-mapping`  
  Scope: `rmi-administration/src/main/java/zm/edu/scasp/RemoteAdminImpl.java; docs/architecture/`.  
  Commits: `feat(rmi): implement read-only reporting functions`; `fix(rmi): mask sensitive remote state`.
### Stage 9: CORBA — Unit 9: interoperability/migration dossier
- **S09-A · Member A** (reviewed by B): Validate CORBA dossier and cross-protocol comparison — `stage/09-a-validate-corba-dossier-and-cross-protocol-comparison`  
  Scope: `docs/corba-migration/README.md; docs/testing/`.  
  Commits: `docs(corba): compare transport and deployment choices`; `test(docs): review legacy risk coverage`.
- **S09-B · Member B** (reviewed by C): Write CORBA IDL and migration architecture — `stage/09-b-write-corba-idl-and-migration-architecture`  
  Scope: `docs/corba-migration/scasp.idl; docs/architecture/`.  
  Commits: `docs(corba): define legacy reporting IDL`; `docs(architecture): plan CORBA adapter migration`.
- **S09-C · Member C** (reviewed by A): Build migration adapter proof and compatibility risks — `stage/09-c-build-migration-adapter-proof-and-compatibility-risks`  
  Scope: `docs/corba-migration/; rmi-administration/ (optional adapter test)`.  
  Commits: `docs(corba): specify compatibility and rollback risks`; `test(corba): validate IDL mapping examples`.
### Stage 10: Android — Unit 10: student mobile client
- **S10-A · Member A** (reviewed by B): Implement Android screens and runtime location intent — `stage/10-a-implement-android-screens-and-runtime-location-intent`  
  Scope: `android-client/app/src/main/java/zm/edu/scasp/android/{LoginActivity,CourseActivity,CampusActivity}.java`.  
  Commits: `feat(android): implement student navigation screens`; `feat(android): open map for campus services`.
- **S10-B · Member B** (reviewed by C): Document Android navigation, lifecycle and API contracts — `stage/10-b-document-android-navigation-lifecycle-and-api-contracts`  
  Scope: `android-client/app/src/main/AndroidManifest.xml; android-client/README.md; docs/architecture/`.  
  Commits: `feat(android): preserve important activity state`; `docs(android): document navigation and API use`.
- **S10-C · Member C** (reviewed by A): Implement API synchronisation and offline behaviour — `stage/10-c-implement-api-synchronisation-and-offline-behaviour`  
  Scope: `android-client/app/src/main/java/zm/edu/scasp/android/{ApiClient,RequestActivity,AnnouncementActivity}.java; docs/testing/`.  
  Commits: `feat(android): handle offline API requests gracefully`; `test(android): cover permissions and empty data`.
### Stage 11: Integration — All units: quality, deployment, handover
- **S11-A · Member A** (reviewed by B): Complete integrated QA, usability and demonstration evidence — `stage/11-a-complete-integrated-qa-usability-and-demonstration-evid`  
  Scope: `docs/testing/; docs/demo-script.md; web-application/`.  
  Commits: `test(integration): cover complete enrolment workflow`; `docs: prepare three-person demonstration script`.
- **S11-B · Member B** (reviewed by C): Finish release build, CI, traceability and deployment — `stage/11-b-finish-release-build-ci-traceability-and-deployment`  
  Scope: `pom.xml; .github/workflows/java-ci.yml; README.md; docs/traceability.md`.  
  Commits: `ci: verify final multi-module release build`; `docs: complete stage evidence traceability`.
- **S11-C · Member C** (reviewed by A): Close security gaps and final regression checks — `stage/11-c-close-security-gaps-and-final-regression-checks`  
  Scope: `web-application/src/main/java/zm/edu/scasp/; persistence-jdbc/; docs/testing/`.  
  Commits: `fix(security): enforce authorization and validation`; `test(security): verify audit and injection protection`.

## Deliverable expectations

Keep the assignment's additional proof alongside code: requirements & risks (0), collection-selection table and unit tests (1), race/thread dump (2), network trace (3), Payara EJB evidence (4), transactions and data dictionary (5), security HTTP tests (6), two-person usability record (7), separate RMI process evidence (8), CORBA IDL + migration dossier (9), Android permissions/offline/map proof (10), final clean-machine build and demonstration (11).

See `docs/TEAM-GITHUB-WORKFLOW.md`, `docs/TEAM-ISSUE-BACKLOG.csv`, and `docs/issues/` for GitHub-ready issue bodies.
