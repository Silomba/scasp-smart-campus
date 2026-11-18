package zm.edu.scasp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DomainRulesTest {
    @Test
    void identifiersAreTrimmed() {
        assertEquals("STU_42", DomainRules.identifier(" STU_42 "));
    }

    @Test
    void invalidIdentifierIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> DomainRules.identifier("bad id!"));
        assertThrows(IllegalArgumentException.class, () -> DomainRules.identifier(""));
        assertThrows(IllegalArgumentException.class, () -> DomainRules.identifier(null));
    }

    @Test
    void requiredTextHasMaximumLength() {
        assertEquals("Computing", DomainRules.required(" Computing ", "Programme", 20));
        assertThrows(IllegalArgumentException.class,
                () -> DomainRules.required("", "Programme", 20));
        assertThrows(IllegalArgumentException.class,
                () -> DomainRules.required("ABCDE", "Code", 4));
    }
}
