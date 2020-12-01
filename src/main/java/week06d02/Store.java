package week06d02;

import java.util.ArrayList;
import java.util.List;

public class Store {

   private List<Product> products = new ArrayList<>();

    public Store(List<Product> products) {
        this.products = products;
    }

    public int getProductByCategoryName(Category category) {
        int count = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getCategory() == category) {
                count++;
            }
        }
        return count;
    }
}
