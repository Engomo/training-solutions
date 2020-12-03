package week05d04;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products = new ArrayList<>();

    public boolean addProduct(Product product) {
        products.add(product);
        return true;
    }


}
