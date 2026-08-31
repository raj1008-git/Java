package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class AttendanceParameterizedTest {

    @ParameterizedTest
    @ValueSource(ints = { 75, 80, 90, 100 })
    void studentsWithEnoughAttendanceCanTakeExam(int attendance) {

        App app = new App();

        assertTrue(app.canTakeExam(attendance));
    }

    @ParameterizedTest
    @ValueSource(ints = { 0, 20, 50, 74 })
    void studentsWithLowAttendanceCannotTakeExam(int attendance) {

        App app = new App();

        assertFalse(app.canTakeExam(attendance));
    }
}