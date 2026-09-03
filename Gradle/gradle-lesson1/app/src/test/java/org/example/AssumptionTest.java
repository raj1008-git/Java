package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionTest {
    @Test
    void testOnlywhenConditionIsTrue() {
        boolean isReady = true;
        Assumptions.assumeFalse(isReady);
        System.out.println("Test is running...");
        assertEquals(10, 5 + 5);
    }
}
