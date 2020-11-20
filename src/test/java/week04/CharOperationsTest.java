package week04;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharOperationsTest {

    @Test
    public void charOperationsTest() {
        CharOperations charOperations = new CharOperations();
        List<Integer> result = Arrays.asList(0,3);
        assertEquals(result, charOperations.getPositionOfChar("alma", "a"));
    }
}
