
package zm.edu.scasp;

import java.util.Comparator;
import java.util.Objects;

/**
 * Represents an academic course.
 */
public record Course(
        String courseCode,
        String title,
        int capacity,
        CourseStatus status)
        implements Comparable<Course> {

    private static final Comparator<Course> ORDER =
            Comparator.comparing(Course::courseCode)
                    .thenComparing(Course::title)
                    .thenComparingInt(Course::capacity)
                    .thenComparing(Course::status);

    public Course {
        courseCode = DomainRules.identifier(courseCode);
        title = DomainRules.required(title, "Course title", 150);

        if (capacity < 0) {
            throw new IllegalArgumentException(
                "Course capacity cannot be negative");
        }

        Objects.requireNonNull(
                status, "Course status is required");
    }

    @Override
    public int compareTo(Course other) {
        Objects.requireNonNull(other, "Other course is required");
        return ORDER.compare(this, other);
    }
}
