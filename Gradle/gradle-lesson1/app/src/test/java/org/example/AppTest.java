package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void appHasGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting());
    }

    @Test
    void studentsWithEnoughAttendanceCanTakeExam() {
        // Arrange
        App app = new App();

        // Act
        boolean actualResult = app.canTakeExam(76);

        // Assert
        assertTrue(actualResult);

    }

    @Test
    void isEligibleForDiscount() {
        // Arrange
        App app = new App();

        // Act
        boolean hasDiscount = app.isEligibleForDiscount(20);

        // Assert
        assertTrue(hasDiscount);
    }

}
