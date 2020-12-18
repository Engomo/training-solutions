package week08d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathAlgorithmsTest {

    @Test
    public void mathTest(){
        assertEquals(6, new MathAlgorithms().greatestCommonDivisor(84,18));
        assertEquals(6, new MathAlgorithms().greatestCommonDivisor(18,84));
    }
}
