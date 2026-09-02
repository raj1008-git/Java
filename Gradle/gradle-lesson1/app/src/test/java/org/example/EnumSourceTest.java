package org.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class EnumSourceTest {
    @ParameterizedTest
    @EnumSource(Role.class)
    void testCanDeleteUser(Role role) {
        App app = new App();
        boolean actual = app.canDeleteUser(role);
        if (role == Role.ADMIN) {
            assertTrue(actual);
        } else {
            assertFalse(actual);
        }
    }
}
