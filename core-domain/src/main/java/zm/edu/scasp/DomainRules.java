
package zm.edu.scasp;

import java.util.regex.Pattern;

/**
 * Provides shared validation rules for SCASP
 * domain entities.
 *
 * @author ELI
 */
public final class DomainRules {

    private static final Pattern ID_PATTERN =
            Pattern.compile(
                "[A-Za-z0-9][A-Za-z0-9_-]{0,49}"
            );

    private DomainRules() {
        // Prevent creating utility class objects.
    }

    /**
     * Validates a required text value.
     */
    public static String required(
            String value,
            String fieldName,
            int maxLength) {

        if (maxLength < 1) {
            throw new IllegalArgumentException(
                "Maximum length must be positive"
            );
        }

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                fieldName + " is required"
            );
        }

        String cleaned = value.trim();

        if (cleaned.length() > maxLength) {
            throw new IllegalArgumentException(
                fieldName + " cannot exceed "
                + maxLength + " characters"
            );
        }

        return cleaned;
    }

    /**
     * Validates a unique identifier's format.
     */
    public static String identifier(String value) {

        String id = required(
                value, "Identifier", 50
        );

        if (!ID_PATTERN.matcher(id).matches()) {
            throw new IllegalArgumentException(
                "Identifier must contain letters, "
                + "numbers, underscores or hyphens "
                + "and must start with a letter or number"
            );
        }

        return id;
    }
}
