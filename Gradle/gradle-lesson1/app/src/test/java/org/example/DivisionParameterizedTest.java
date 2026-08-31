package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionParameterizedTest {
    @ParameterizedTest
    @CsvSource({
            "10,2,5",
            "20,4,5",
            "100,10,10",
            "50,5,10",
            "99,9,11"
    })
    void divideTwoNumber(int num1, int num2, int expected) {
        App app = new App();
        int actual = app.divide(num1, num2);
        assertEquals(expected, actual);
    }
}
