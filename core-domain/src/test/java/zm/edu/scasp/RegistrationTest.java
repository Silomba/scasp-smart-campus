package zm.edu.scasp;

import java.time.Instant;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RegistrationTest {
    private static final Instant NOW = Instant.parse("2026-11-16T10:00:00Z");

    @Test
    void registrationRetainsLinkAndTimestamp() {
        Registration r = new Registration("R001", "S001", "CS101",
                RegistrationStatus.ENROLLED, NOW);
        assertEquals("S001", r.studentId());
        assertEquals("CS101", r.courseCode());
        assertEquals(NOW, r.createdAt());
    }

    @Test
    void invalidRegistrationIsRejected() {
        assertThrows(IllegalArgumentException.class,
                () -> new Registration("bad id", "S001", "CS101", RegistrationStatus.ENROLLED, NOW));
        assertThrows(NullPointerException.class,
                () -> new Registration("R001", "S001", "CS101", null, NOW));
        assertThrows(NullPointerException.class,
                () -> new Registration("R001", "S001", "CS101", RegistrationStatus.ENROLLED, null));
    }

    @Test
    void identicalRegistrationRecordsAreEqual() {
        Registration a = new Registration("R001", "S001", "CS101", RegistrationStatus.ENROLLED, NOW);
        Registration b = new Registration("R001", "S001", "CS101", RegistrationStatus.ENROLLED, NOW);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }
}
