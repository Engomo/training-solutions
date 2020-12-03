package week06d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BudgetTest {

   Budget budget = new Budget(Arrays.asList(
           new Item(300, LocalDate.of(2020,12,15),"kenyér"),
           new Item(30, LocalDate.of(2020,11,15),"kifli"),
           new Item(40, LocalDate.of(2020,8,15),"zsömle"),
           new Item(40, LocalDate.of(2020,3,15),"zsömle"),
           new Item(200, LocalDate.of(2020,12,15),"kakaós csiga")));

    @Test
    public void budgetTest(){
        assertEquals(2, budget.getItemsByMonth(12).size());
    }
}
