

\# SCASP — System Context and Scope



\## 1. Introduction



The Smart Campus Academic Services Platform (SCASP) is a multi-tier academic management system designed to improve how students and institutional staff access and manage academic services.



The platform integrates course registration, waiting lists, academic service requests, announcements, reporting, and campus service information.



SCASP is developed as part of the BoCS3100 Advanced Java group project.



\## 2. Purpose of the System



The purpose of SCASP is to provide a centralised system for managing academic activities while reducing manual administrative work.



The platform will allow students to access academic information and services, while staff members manage registrations, requests, announcements, and reports.



\## 3. System Users



\### Students



Students will be able to:

\- Log in to the platform.

\- View available courses.

\- Register for courses and withdraw.

\- Join waiting lists for full courses.

\- Submit academic service requests.

\- Read announcements.

\- View campus services.



\### Academic and Administrative Staff



Staff will be able to:

\- Manage course information.

\- View student registrations.

\- Process service requests.

\- Publish announcements.

\- Generate academic reports.

\- Review audit records.



\## 4. System Context Diagram



```mermaid

flowchart TD

&#x20;   Student\[Student]

&#x20;   Staff\[Academic / Administrative Staff]

&#x20;   SCASP\[Smart Campus Academic Services Platform]

&#x20;   DB\[(Relational Database)]

&#x20;   Network\[Notification / Network Clients]

&#x20;   Maps\[External Maps Application]



&#x20;   Student -->|Registration, requests, enquiries| SCASP

&#x20;   Staff -->|Manage courses, requests, reports| SCASP

&#x20;   SCASP -->|Course information and responses| Student

&#x20;   SCASP -->|Reports and notifications| Staff

&#x20;   SCASP <-->|Read and store records| DB

&#x20;   SCASP -->|Notifications and events| Network

&#x20;   SCASP -->|Campus location information| Maps

```



\## 5. System Boundaries



SCASP includes:

\- Java domain objects and business rules.

\- Concurrent processing services.

\- TCP/UDP networking functionality.

\- Enterprise Java business services.

\- JDBC database persistence.

\- Servlet and JSP web interfaces.

\- RMI administration functionality.

\- An Android student client.



The system depends on a compatible Java application server and database runtime. External mapping applications may be used by the Android client.



\## 6. Expected Benefits



SCASP aims to:

\- Reduce manual course registration.

\- Prevent duplicate registrations.

\- Manage course capacity and waiting lists.

\- Improve the processing of academic requests.

\- Provide reliable access to announcements.

\- Support academic reporting and accountability.



\## 7. Architecture Status



This document describes the proposed system architecture. The team will implement, test and integrate these components progressively through Stages 0–11.



Implementation status and testing evidence will be recorded separately as development progresses.



\## 8. Conclusion



SCASP provides a structured approach to developing an integrated academic services system using Advanced Java technologies. Its modular architecture supports progressive implementation, testing, and collaboration among three group members.



