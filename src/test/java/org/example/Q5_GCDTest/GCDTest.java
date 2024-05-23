package org.example.Q5_GCDTest;

import org.example.Q5_GCD.CSVReader;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GCDTest {
    @Test
    public void testGCD() {
        CSVReader csvReader = new CSVReader();

        int[][] tests = {
                {2, 3, 1},
                {1, 3, 1},
                {2, 8, 2},
                {100000, 30000, 10000},
                {0, 5, 5},
                {5, 0, 5},
                {0, 0, 0},
                {-5, 10, 5},
                {5, -10, 5},
                {-5, -10, 5},
        };

        for (int[] test : tests) {
            int int1 = test[0];
            int int2 = test[1];
            int expected = test[2];
            int result = csvReader.gcd(int1, int2);
            assertEquals(expected, result);
        }
    }
}