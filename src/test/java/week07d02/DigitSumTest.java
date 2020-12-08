package week07d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitSumTest {

    @Test
    public void digitSumTest2(){
        assertEquals(6,new DigitSum().sumOfDigits2(1,2,3));
    }

    @Test
    public void digitSumTest(){
        assertEquals(6,new DigitSum().sumOfDigits(123));
    }

}
