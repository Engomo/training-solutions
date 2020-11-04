package Week02;

public class Product {
    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean areTheyEqual(Product p){
       boolean n = name.equals(p.name);
       boolean codeDiff = Math.abs(code.length()-p.code.length()) <= 1;
       return n && codeDiff;
    }


    public static void main(String[] args) {
        Product product1 =new Product("Kenyér","111");
        Product product2 =new Product("Kenyér","121");
        Product product3 =new Product("Pogácsa","333");

        System.out.println(product1.areTheyEqual(product2));
        System.out.println(product1.areTheyEqual(product3));

    }
}
