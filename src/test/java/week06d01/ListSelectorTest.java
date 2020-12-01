package week06d01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ListSelectorTest {

    ListSelector ls = new ListSelector();


    @Test
    void listSelectorTest() {
        assertEquals("[almaszilva]", ls.listSelector(Arrays.asList("alma", "körte", "szilva")));

    }

//    @Test
//    void listNullTest() {
//        assertThrows("list should be not null!", ls.listSelector(Arrays.asList()));
//    }
}