package week04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NameChangerTest {

    @Test
    public void crateNameChangerTest() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()-> new NameChanger(""));
        assertEquals("Invalid Name!", iae.getMessage());
    }

    @Test
    public void changeNameTest() {
        NameChanger nameChanger = new NameChanger("Doe John");

        nameChanger.changeFirstName("Jack");
        assertEquals("Doe Jack", nameChanger.getFullName());
    }

    private void nameChanger(String s) {
    }
}
