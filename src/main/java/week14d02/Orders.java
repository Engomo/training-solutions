package week14d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Orders {

    private Map<String, TreeSet<String>> ordersMap = new HashMap<>();

    public void readOrders(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                loadOrdersMap(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }

    private void loadOrdersMap(String line) {
        String[] splittedLine = line.split(" ");
        TreeSet<String> products = new TreeSet<>();
        Collections.addAll(products, splittedLine[1].trim().split(","));
        ordersMap.put(splittedLine[0], products);
    }

    public TreeSet<String> searchOrderById(String id) {
        return ordersMap.get(id);
    }

    public int sumOfOrderById(String id) {
        return ordersMap.get(id).size();
    }

    public Map<String, Integer> sumOfProducts() {
        Map<String, Integer> productsMap = new HashMap<>();
        makeProductsMap(productsMap);
        return productsMap;
    }

    private void makeProductsMap(Map<String, Integer> productsMap) {
        for (TreeSet<String> set : ordersMap.values()) {
            for (String title : set) {
                if (!productsMap.containsKey(title)) {
                    productsMap.put(title, 1);
                } else {
                    productsMap.put(title, productsMap.get(title) + 1);
                }
            }
        }
    }

    public int sumOfProductsByName(String name) {
        return sumOfProducts().get(name);
    }

    public static void main(String[] args) {
        Orders orders = new Orders();
        orders.readOrders(Path.of("orders.txt"));
        System.out.println(orders.ordersMap);
        System.out.println(orders.searchOrderById("C123")); //1
        System.out.println(orders.sumOfOrderById("C123")); //3
        System.out.println(orders.sumOfProducts()); //4
        System.out.println(orders.sumOfProductsByName("beer")); //2

    }
}
