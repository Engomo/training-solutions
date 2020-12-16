package week08d03;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringListsTest {

    @Test
    public void unioTest() {
        assertEquals(List.of("a", "d", "b", "c"), new StringLists().stringListsUnion(List.of("a", "b", "c"), List.of("a", "d")));
    }
}
