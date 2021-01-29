package week13d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataEditingTest {

    @Test
    void sumOfLetters() {
        assertEquals(4, new DataEditing().sumOfLetters("ABCabc  ,.-12/%áőüöíóúűi=+"));
    }
}