package week07d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberListTest {

    @Test
    public void numberListTest() {
        assertTrue(new NumberList().isIncreasing(List.of(1, 2, 3, 3, 3, 5)));
    }
}
