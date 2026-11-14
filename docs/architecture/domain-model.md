

\# SCASP — Domain Model Design



\## 1. Introduction



The Smart Campus Academic Services Platform (SCASP) uses a domain model to represent academic information and the relationships between different entities.



The domain model provides a foundation for Java classes, collections, business rules, JDBC database tables and enterprise services.



This document describes the proposed domain structure for the SCASP system.



\## 2. Core Domain Entities



\### 2.1 User



Represents a person who can access the system.



Attributes:

\- userId — unique user identifier

\- name — user's full name

\- role — STUDENT or STAFF

\- status — ACTIVE or INACTIVE



The User entity supports authentication and role-based access control.



\### 2.2 Student



Represents a student registered at the institution.



Attributes:

\- studentId — unique student number

\- userId — reference to the User entity

\- programme — academic programme

\- yearOfStudy — student's current year



Each Student is linked to one User account.



\### 2.3 Course



Represents an academic course.



Attributes:

\- courseCode — unique course identifier

\- title — course name

\- capacity — maximum permitted enrolment

\- status — ACTIVE or CLOSED



Courses must have valid identifiers and non-negative capacities.



\### 2.4 Registration



Represents a student's enrolment in a course.



Attributes:

\- registrationId — unique registration record

\- studentId — reference to Student

\- courseCode — reference to Course

\- status — ENROLLED or WITHDRAWN

\- createdAt — registration date and time



The system must prevent duplicate active registrations.



\### 2.5 WaitlistEntry



Represents a student waiting for space in a full course.



Attributes:

\- studentId — reference to Student

\- courseCode — reference to Course

\- position — waiting-list position

\- priority — optional justified priority

\- createdAt — date and time added



The system should promote the next eligible student when a course space becomes available.



\### 2.6 ServiceRequest



Represents an academic service enquiry.



Attributes:

\- requestId — unique request identifier

\- studentId — requesting student

\- category — transcript, clearance, appeal or another category

\- priority — request urgency

\- status — OPEN, IN\_PROGRESS or RESOLVED

\- assignedTo — responsible staff member

\- createdAt — creation time

\- updatedAt — most recent update



\### 2.7 Announcement



Represents information published by the institution.



Attributes:

\- announcementId — unique identifier

\- title — announcement heading

\- body — announcement content

\- audience — intended recipients

\- publishedAt — publication time



Students should only receive announcements intended for their audience.



\### 2.8 AuditEvent



Records important changes performed in the system.



Attributes:

\- eventId — unique identifier

\- actor — user performing the action

\- action — operation performed

\- entityType — affected entity type

\- entityId — identifier of affected record

\- occurredAt — date and time



Audit events support accountability and troubleshooting.



\### 2.9 CampusService



Represents a campus location or facility.



Attributes:

\- serviceId — unique identifier

\- name — facility name

\- description — facility information

\- latitude — geographic coordinate

\- longitude — geographic coordinate



Campus service information can be displayed by the Android client.



\## 3. Entity Relationship Diagram



```mermaid

erDiagram

&#x20;   USER ||--o| STUDENT : has\_profile

&#x20;   STUDENT ||--o{ REGISTRATION : makes

&#x20;   COURSE ||--o{ REGISTRATION : receives

&#x20;   STUDENT ||--o{ WAITLIST\_ENTRY : joins

&#x20;   COURSE ||--o{ WAITLIST\_ENTRY : maintains

&#x20;   STUDENT ||--o{ SERVICE\_REQUEST : submits

&#x20;   USER o|--o{ SERVICE\_REQUEST : assigned\_to

&#x20;   USER ||--o{ ANNOUNCEMENT : publishes

&#x20;   USER ||--o{ AUDIT\_EVENT : performs



&#x20;   USER {

&#x20;       string userId PK

&#x20;       string name

&#x20;       string role

&#x20;       string status

&#x20;   }



&#x20;   STUDENT {

&#x20;       string studentId PK

&#x20;       string userId FK

&#x20;       string programme

&#x20;       int yearOfStudy

&#x20;   }



&#x20;   COURSE {

&#x20;       string courseCode PK

&#x20;       string title

&#x20;       int capacity

&#x20;       string status

&#x20;   }



&#x20;   REGISTRATION {

&#x20;       string registrationId PK

&#x20;       string studentId FK

&#x20;       string courseCode FK

&#x20;       string status

&#x20;       datetime createdAt

&#x20;   }



&#x20;   WAITLIST\_ENTRY {

&#x20;       string studentId FK

&#x20;       string courseCode FK

&#x20;       int position

&#x20;       int priority

&#x20;       datetime createdAt

&#x20;   }



&#x20;   SERVICE\_REQUEST {

&#x20;       string requestId PK

&#x20;       string studentId FK

&#x20;       string category

&#x20;       string priority

&#x20;       string status

&#x20;       string assignedTo FK

&#x20;       datetime createdAt

&#x20;       datetime updatedAt

&#x20;   }



&#x20;   ANNOUNCEMENT {

&#x20;       string announcementId PK

&#x20;       string title

&#x20;       string body

&#x20;       string audience

&#x20;       datetime publishedAt

&#x20;   }



&#x20;   AUDIT\_EVENT {

&#x20;       string eventId PK

&#x20;       string actor FK

&#x20;       string action

&#x20;       string entityType

&#x20;       string entityId

&#x20;       datetime occurredAt

&#x20;   }



&#x20;   CAMPUS\_SERVICE {

&#x20;       string serviceId PK

&#x20;       string name

&#x20;       string description

&#x20;       double latitude

&#x20;       double longitude

&#x20;   }

```



CampusService is an independent catalogue entity in this initial model. Its location information is accessed through the campus services feature.



The diagram is a conceptual model; the final database design may add identifiers, foreign keys, constraints and supporting fields.



\## 4. Domain Business Rules



\### Rule 1: Unique Registration



A student cannot have more than one active registration for the same course.



\### Rule 2: Course Capacity



The number of actively enrolled students must not exceed the course capacity.



\### Rule 3: Waiting List



If a course is full, an eligible student may be added to its waiting list rather than enrolled immediately.



\### Rule 4: Automatic Promotion



When a student withdraws, the system should offer the available place to the next eligible waiting-list student.



\### Rule 5: Valid User Roles



Only authorised users may perform operations such as creating courses, publishing announcements and assigning service requests.



\### Rule 6: Stable Identifiers



Each entity must use reliable identifiers. Identifiers should not change merely because a record is updated.



\### Rule 7: Valid Status Transitions



Registration and request statuses must change through permitted operations rather than arbitrary updates.



For example:

\- Registration: ENROLLED to WITHDRAWN

\- Service request: OPEN to IN\_PROGRESS to RESOLVED



\### Rule 8: Audit Recording



Important changes, including registrations, withdrawals and request updates, must generate audit events.



\### Rule 9: Consistent Data



Registration, waiting-list promotion and related audit changes should remain consistent even when multiple operations happen concurrently.



\## 5. Planned Java Implementation



The domain entities will be implemented in the core-domain Maven module.



Suggested structure:



core-domain/

&#x20; src/

&#x20;   main/

&#x20;     java/

&#x20;       zm/

&#x20;         edu/

&#x20;           scasp/

&#x20;             domain/

&#x20;               User.java

&#x20;               Student.java

&#x20;               Course.java

&#x20;               Registration.java

&#x20;               WaitlistEntry.java

&#x20;               ServiceRequest.java

&#x20;               Announcement.java

&#x20;               AuditEvent.java

&#x20;               CampusService.java



The exact package structure will be confirmed during implementation.



Java collections will be selected according to the requirements:

\- Map for locating students and courses

\- Set for enforcing registration uniqueness

\- Queue or Deque for waiting lists

\- PriorityQueue for prioritised service requests



Services should return defensive copies or unmodifiable results where appropriate.



\## 6. Design and Testing Considerations



The implementation must test:

\- Duplicate registrations

\- Capacity limits

\- Invalid identifiers and statuses

\- Waiting-list ordering

\- Automatic promotion after withdrawal

\- User authorisation

\- Thread-safe registration operations



The core-domain module will establish the business rules before later stages add networking, persistence and web access.



\## 7. Implementation Status



This document describes the proposed domain model for Stage 0.



Entity implementations, collection repositories and automated unit tests will be developed during Stage 1.



Changes to the model should be documented and reviewed by another team member.



\## 8. Conclusion



The SCASP domain model establishes the academic entities, relationships and business rules that guide the system's development.



It provides a foundation for integrating collections, concurrent processing, database persistence, enterprise services and user interfaces.



