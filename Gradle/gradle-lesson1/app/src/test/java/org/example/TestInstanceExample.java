package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestInstanceExample {
    int count = 0;

    @Test
    void testOne() {
        count++;
        System.out.println("Test One" + count);
    }

    @Test
    void testTwo() {
        count++;
        System.out.println("Test Two" + count);
    }
}
