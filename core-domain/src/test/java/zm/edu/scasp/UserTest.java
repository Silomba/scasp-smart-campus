package zm.edu.scasp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void recordValidatesAndNormalizesInputs() {
        User user = new User(" U100 ", " Jane Zulu ", Role.STUDENT, true);
        assertEquals("U100", user.userId());
        assertEquals("Jane Zulu", user.name());
        assertEquals(Role.STUDENT, user.role());
        assertTrue(user.active());
    }

    @Test
    void missingValuesAreRejected() {
        assertThrows(IllegalArgumentException.class,
                () -> new User(" ", "Jane", Role.STUDENT, true));
        assertThrows(IllegalArgumentException.class,
                () -> new User("U100", "", Role.STUDENT, true));
        assertThrows(NullPointerException.class,
                () -> new User("U100", "Jane", null, true));
    }

    @Test
    void recordEqualityUsesAllFields() {
        User a = new User("U100", "Jane", Role.STUDENT, true);
        User b = new User("U100", "Jane", Role.STUDENT, true);
        User changed = new User("U100", "Jane", Role.STUDENT, false);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
        assertNotEquals(a, changed);
    }
}
