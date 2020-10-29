package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adja meg az áru nevét: ");
        String name = scanner.nextLine();
        System.out.println("Adja meg az áru árát: ");
        int price = scanner.nextInt();

        Product product =new Product(name, price);
        System.out.println(product.getName() + ": " + product.getPrice() + ".-");

        System.out.println("Ennyivel csökkenti az árat: ");
        product.decreasePrice(scanner.nextInt());
        System.out.println(product.getName() + ": " + product.getPrice() + ".-");
        System.out.println("Ennyivel növeli az árat: ");
        product.increasePrice(scanner.nextInt());
        System.out.println(product.getName() + ": " + product.getPrice() + ".-");
    }
}
