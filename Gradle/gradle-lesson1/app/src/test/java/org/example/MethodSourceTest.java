package org.example;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.MethodSource;

class MethodSourceTest {
    @ParameterizedTest
    @MethodSource("attendanceData")
    void testAttendance(int attendance, boolean expected) {
        App app = new App();
        boolean actual = app.canTakeExam(attendance);
        assertEquals(expected, actual);
    }

    static Stream<Object[]> attendanceData() {
        return Stream.of(
                new Object[] { 75, true },
                new Object[] { 80, true },
                new Object[] { 74, false },
                new Object[] { 50, false });
    }
}