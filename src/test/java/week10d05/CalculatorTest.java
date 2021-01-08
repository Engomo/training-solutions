package week10d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void findMindSum() {
        assertEquals(16, new Calculator().findMindSum(new int[]{1, 3, 5, 7, 9}));
        assertEquals(16, new Calculator().findMindSum(new int[]{1, 3, 9, 7, 5}));
        assertEquals(7, new Calculator().findMindSum(new int[]{1, 3, 5, 7, 9, -2}));
    }

    @Test
    void smallArray() {
        assertThrows(IllegalArgumentException.class, ()-> new Calculator().findMindSum(new int[]{1, 2}));
        assertThrows(IllegalArgumentException.class, ()-> new Calculator().findMindSum(new int[]{}));
    }
}