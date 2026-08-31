package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DatabaseTest {
    static DatabaseConnection database;

    @BeforeAll
    static void startDatabase() {
        database = new DatabaseConnection();
        database.open();
    }

    @Test
    void testUserQuery() {
        System.out.println("Running User Querry");
    }

    @Test
    void testProductQuerry() {
        System.out.println("Running Product Querry");
    }

    @Test
    void testOrderQuerry() {
        System.out.println("Running Order Querry");
    }

    @AfterAll
    static void stopDatabase() {
        database.close();
    }
}
