
package zm.edu.scasp;

/**
 * Represents a student registered at the institution.
 */
public record Student(
        String studentId,
        String userId,
        String programme,
        int yearOfStudy) {

    public Student {
        studentId = DomainRules.identifier(studentId);
        userId = DomainRules.identifier(userId);

        programme = DomainRules.required(
                programme, "Programme", 100);

        if (yearOfStudy < 1) {
            throw new IllegalArgumentException(
                "Year of study must be at least 1");
        }
    }
}
