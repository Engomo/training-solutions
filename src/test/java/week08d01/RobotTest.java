package week08d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RobotTest {

    @Test
    public void moveTest(){

        Robot robot = new Robot(0,0);
        assertEquals("2,-2", robot.move("FLBJJJLL").toString());


    }

@Test
    public void exeptionTest(){
        Robot robot = new Robot(1,1);

        assertThrows(IllegalArgumentException.class, ()-> robot.move("LFBJFLG"));
}
}
