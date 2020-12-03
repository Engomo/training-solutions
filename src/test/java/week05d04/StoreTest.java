package week05d04;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StoreTest {


    @Test
    public void addProductTest() {
        Store store = new Store();
        assertTrue(store.addProduct(new Product("tej", 2020, 12, 24)));
    }
}