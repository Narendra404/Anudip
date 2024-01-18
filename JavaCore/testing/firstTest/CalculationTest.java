package testing.firstTest;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {

    @org.junit.jupiter.api.Test
    void findMax() {
        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));
        assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));
    }
}