
package zm.edu.scasp;

import java.time.Instant;
import java.util.Objects;

/**
 * Represents a student's registration for a course.
 */
public record Registration(
        String registrationId,
        String studentId,
        String courseCode,
        RegistrationStatus status,
        Instant createdAt) {

    public Registration {
        registrationId =
                DomainRules.identifier(registrationId);

        studentId =
                DomainRules.identifier(studentId);

        courseCode =
                DomainRules.identifier(courseCode);

        Objects.requireNonNull(
                status, "Registration status is required");

        Objects.requireNonNull(
                createdAt, "Creation date is required");
    }
}
