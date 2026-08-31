package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class DiscountParameterizedTest {
    @ParameterizedTest
    @CsvSource({
            "20,true",
            "24,true",
            "25,false",
            "30,false"
    })
    void checkDiscountEligibility(int age, boolean expected) {
        App app = new App();
        boolean actual = app.isEligibleForDiscount(age);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "Raj,true",
            "John,true"
    })
    void validateUsername(String username, boolean expected) {
        App app = new App();
        boolean actual = app.isValidUsername(username);
        assertEquals(expected, actual);
    }
}
