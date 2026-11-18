package zm.edu.scasp;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    @Test
    void zeroCapacityIsValidButNegativeCapacityIsRejected() {
        Course noSeats = new Course("CS101", "Programming", 0, CourseStatus.ACTIVE);
        assertEquals(0, noSeats.capacity());
        assertThrows(IllegalArgumentException.class,
                () -> new Course("CS101", "Programming", -1, CourseStatus.ACTIVE));
    }

    @Test
    void missingValuesAreRejected() {
        assertThrows(IllegalArgumentException.class,
                () -> new Course("bad code", "Programming", 20, CourseStatus.ACTIVE));
        assertThrows(IllegalArgumentException.class,
                () -> new Course("CS101", " ", 20, CourseStatus.ACTIVE));
        assertThrows(NullPointerException.class,
                () -> new Course("CS101", "Programming", 20, null));
    }

    @Test
    void sortsByCodeAndHasValueEquality() {
        Course second = new Course("CS202", "Databases", 30, CourseStatus.ACTIVE);
        Course first = new Course("CS101", "Programming", 30, CourseStatus.ACTIVE);
        List<Course> courses = new ArrayList<>(List.of(second, first));
        courses.sort(null);
        assertEquals(List.of(first, second), courses);
        assertEquals(first, new Course("CS101", "Programming", 30, CourseStatus.ACTIVE));
        assertEquals(0, first.compareTo(new Course("CS101", "Programming", 30, CourseStatus.ACTIVE)));
    }
}
