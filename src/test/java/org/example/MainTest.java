package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testCalDistance() {
        // Test case 1: Normal values
        assertEquals(10.0, Main.calDistance(100, 10), 0.001);

        // Test case 2: Zero time should return positive or negative infinity
        assertTrue(Double.isInfinite(Main.calDistance(100, 0)));

        // Test case 3: Negative values
        assertEquals(-10.0, Main.calDistance(-100, 10), 0.001);
        assertEquals(-10.0, Main.calDistance(100, -10), 0.001);
        assertEquals(10.0, Main.calDistance(-100, -10), 0.001);
    }
}
