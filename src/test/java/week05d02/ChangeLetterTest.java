package week05d02;

import org.junit.jupiter.api.Test;
import week05d07.ChangeLetter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeLetterTest {

    @Test
    void testChangeletters(){
        assertEquals("*rv*zt*r*", new ChangeLetter().changeVowels("arvizturo"));
    }
}
