package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    App app;

    @BeforeEach
    void setup() {
        app = new App();
    }

    @Test
    void appHasGreeting() {

        assertNotNull(app.getGreeting());
    }

    @Test
    void studentsWithEnoughAttendanceCanTakeExam() {
        // Arrange
        // App app = new App();

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

    @Test
    void divideTwoNumbers() {

        int actual = app.divide(10, 2);

        assertEquals(5, actual);
    }

    @Test
    void divideByZeroThrowsException() {

        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> app.divide(10, 0));
        System.out.println(exception.getMessage());

        double actual = app.divide(10, 2);
        assertEquals(5, actual);

    }

    @Test
    void divideTenByTwoReturnsFive() {

        int actual = app.divide(10, 2);
        assertEquals(5, actual);
    }

}
