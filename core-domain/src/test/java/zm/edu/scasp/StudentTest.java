package zm.edu.scasp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void validStudentLinksToUserId() {
        Student s = new Student("S001", "U100", " Computer Science ", 2);
        assertEquals("S001", s.studentId());
        assertEquals("U100", s.userId());
        assertEquals("Computer Science", s.programme());
        assertEquals(2, s.yearOfStudy());
    }

    @Test
    void invalidStudentIsRejected() {
        assertThrows(IllegalArgumentException.class,
                () -> new Student("S001", "", "Computer Science", 2));
        assertThrows(IllegalArgumentException.class,
                () -> new Student("S001", "U100", " ", 2));
        assertThrows(IllegalArgumentException.class,
                () -> new Student("S001", "U100", "Computer Science", 0));
    }

    @Test
    void identicalStudentRecordsAreEqual() {
        Student first = new Student("S001", "U100", "IT", 1);
        Student second = new Student("S001", "U100", "IT", 1);
        assertEquals(first, second);
        assertEquals(first.hashCode(), second.hashCode());
    }
}
