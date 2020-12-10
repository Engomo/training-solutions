package week07d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MathAlgorithmsTest {

    @Test
    public void isPrimeTest(){


        assertTrue(new MathAlgorithms().isPrime(97));
        assertTrue(new MathAlgorithms().isPrime(7));
        assertTrue(new MathAlgorithms().isPrime(47));
        assertTrue(new MathAlgorithms().isPrime(23));
        assertTrue(new MathAlgorithms().isPrime(83));
        assertTrue(new MathAlgorithms().isPrime(2));
    }

    @Test
    public void isNotPrimeTest(){
        assertFalse(new MathAlgorithms().isPrime(8));
        assertFalse(new MathAlgorithms().isPrime(16));
        assertFalse(new MathAlgorithms().isPrime(27));
        assertFalse(new MathAlgorithms().isPrime(33));
        assertFalse(MathAlgorithms.isPrime(22));
    }
}
