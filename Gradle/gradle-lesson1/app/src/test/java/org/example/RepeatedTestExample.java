package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTestExample {
    @RepeatedTest(5)
    void testAttendance() {
        App app = new App();
        boolean result = app.canTakeExam(80);
        assertTrue(result);
        System.out.println("Test Executed");
    }

}
