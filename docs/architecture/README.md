

\# SCASP — Architecture Documentation



\## 1. Project Overview



The Smart Campus Academic Services Platform (SCASP) is a modular academic management system developed as part of the BoCS3100 Advanced Java group project.



The platform is designed to manage students, courses, registrations, waiting lists, academic requests, announcements, campus services and administrative reports.



The architecture supports progressive development through the eleven implementation stages following project inception.



\## 2. Architecture Objectives



The architecture has the following objectives:



1\. Separate user interfaces from business logic.

2\. Provide reusable Java domain classes.

3\. Support concurrent academic operations.

4\. Enable network communication.

5\. Maintain consistent database records.

6\. Support secure student and staff access.

7\. Allow web, desktop and mobile integration.

8\. Simplify testing, maintenance and future development.



\## 3. Architecture Documents



The documentation is divided into three main files:



\### System Context



\[context.md](context.md)



Describes the users, system boundaries, external services and interactions with SCASP.



\### Component Architecture



\[components.md](components.md)



Explains the architectural layers, Maven modules and proposed communication between components.



\### Domain Model



\[domain-model.md](domain-model.md)



Describes the nine core entities, their relationships, identifiers and business rules.



\## 4. Project Module Structure



The main project contains seven Maven modules:



| Module | Responsibility |

|---|---|

| core-domain | Entities, validation and collections |

| concurrent-processing | Threading, task queues and execution |

| network-gateway | TCP and UDP communication |

| enterprise-services | Jakarta Enterprise Beans |

| persistence-jdbc | Database access and transactions |

| web-application | Servlets, JSP and web interfaces |

| rmi-administration | Remote administration and reporting |



Additional components:



\- android-client: Android Studio mobile project.

\- database: Database schema and sample data.

\- docs: Architecture, testing and user documentation.



The Android application uses a separate Gradle build.



\## 5. Architectural Decisions



\### Decision 1: Modular Architecture



SCASP uses separate modules to make components easier to maintain, test and integrate.



\### Decision 2: Java 21 and Maven



Java 21 is the baseline Java version, and Maven manages dependencies and builds for the server-side project.



\### Decision 3: Jakarta EE and Payara



The web application targets Jakarta EE and Payara Server 6 for Servlet, JSP and enterprise-service functionality.



\### Decision 4: Database Persistence



JDBC is used for relational database access. Prepared statements and transactions will protect data integrity.



\### Decision 5: Concurrent Processing



ExecutorService, bounded queues and synchronisation will be used to process multiple academic operations safely.



\### Decision 6: MVC Architecture



Servlets will act as controllers, Java services will manage business logic, and JSP pages will present information to users.



\### Decision 7: Separate Mobile Client



The Android application will communicate with approved backend interfaces rather than directly accessing database tables.



\### Decision 8: Version Control and Reviews



All three contributors will use GitHub issues, separate branches, meaningful commits and peer-reviewed pull requests.



\## 6. Key Domain Rules



The system must:



\- Prevent duplicate active course registrations.

\- Enforce course capacity limits.

\- Maintain consistent waiting-list ordering.

\- Promote eligible students after withdrawals.

\- Restrict operations according to user roles.

\- Validate identifiers and status changes.

\- Record important operations in the audit trail.



These rules will be implemented and tested in subsequent stages.



\## 7. Implementation Stages



\- Stage 0: Requirements and architecture baseline

\- Stage 1: Java Collections

\- Stage 2: Multithreading

\- Stage 3: Networking

\- Stage 4: Enterprise Beans

\- Stage 5: JDBC

\- Stage 6: Servlets

\- Stage 7: JSP

\- Stage 8: RMI

\- Stage 9: CORBA interoperability analysis

\- Stage 10: Android

\- Stage 11: Final integration and testing



Each completed stage must have documented implementation evidence and appropriate testing.



\## 8. Current Development Status



The project begins with a Maven scaffold and architectural documentation.



The full system features must be implemented, tested and integrated progressively by the group members.



This README describes the intended architecture, not confirmation that every feature is already complete.



\## 9. Collaboration Responsibilities



Member A initially leads architecture and integration.



Member B initially leads backend and data implementation.



Member C initially leads client interfaces, quality and documentation.



Leadership roles rotate after Stages 3 and 7, as required by the assignment.



All members are expected to contribute code and review the work of other members.



\## 10. Conclusion



This architecture baseline provides the foundation for developing SCASP as a multi-tier Advanced Java application.



The documents will be updated as implementation decisions evolve throughout the project.



