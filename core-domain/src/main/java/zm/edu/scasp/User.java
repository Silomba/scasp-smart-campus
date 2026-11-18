package zm.edu.scasp;

import java.util.Objects;

public record User(
        String userId,
        String name,
        Role role,
        boolean active) {

    public User {
        userId = DomainRules.identifier(userId);

        name = DomainRules.required(
                name, "Name", 100);

        role = Objects.requireNonNull(
                role, "Role is required");
    }
}