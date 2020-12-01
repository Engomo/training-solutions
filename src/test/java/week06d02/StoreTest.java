package week06d02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {

   Store store = new Store(Arrays.asList(
           new Product("alma", Category.OTHER, 100),
           new Product("körte", Category.OTHER, 150),
           new Product("kifli", Category.BAKEDGOODS, 20)
   ));

   @Test
           void getProductByCategoryNameTest() {
       assertEquals(2, store.getProductByCategoryName(Category.OTHER));
   }

}
