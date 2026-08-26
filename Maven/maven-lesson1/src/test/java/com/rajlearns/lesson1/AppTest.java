package com.rajlearns.lesson1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testDivide() {
        App app = new App();

        int actualResult = app.divide(10, 5);
        int expectedResult = 2;

        assertEquals(expectedResult, actualResult);
    }
}