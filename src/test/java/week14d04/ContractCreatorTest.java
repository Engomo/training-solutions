package week14d04;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContractCreatorTest {

    ContractCreator contractCreator = new ContractCreator("Béla", List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));

    Contract contract1 = contractCreator.create("Józsi");
    Contract contract2 = contractCreator.create("Guszti");


    @Test
    void create() {
       assertEquals("Juci", contractCreator.create("Juci").getClient());
    }

    @Test
    void getContract() {
        assertEquals("Józsi", contract1.getClient());
    }

    @Test
    void changeMonthlyPrice() {
        contract2.getMonthlyPrices().set(11, 15);
        assertEquals(12, contractCreator.getContract().getMonthlyPrices().indexOf(11));
        assertEquals(15, contract2.getMonthlyPrices().indexOf(11));
    }
}