package week09d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void overFourTeen(){
        Person p = new Person("Józsi", 35);
        p.setPresent();

        assertNotEquals(Present.TOY, p.getPresent());
        assertNotEquals(null, p.getPresent());

    }


    @Test
    public void underHourTeen() {
        Person p = new Person("Józsika", 8);
        p.setPresent();

        assertNotEquals(null, p.getPresent());
    }

}