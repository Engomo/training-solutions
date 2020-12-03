package week05d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {

    @Test
    public void emailTest(){
        assertThrows(IllegalArgumentException.class, ()-> new User("Kőszegi", "László", "laszlo@vadkert"));
        assertThrows(IllegalArgumentException.class, ()-> new User("Kőszegi", "László", "laszlo.vadkert"));
        assertThrows(IllegalArgumentException.class, ()-> new User("Kőszegi", "László", "laszlovadkert"));
    }

    @Test
    public void getFullNameTest() {
        assertEquals("Kőszegi László", new User("Kőszegi", "László", "laszlo@vadkert.net").getFullName());
    }
}
