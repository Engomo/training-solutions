package finalmodifier;

public class TaxCalculator {
    public static final double AFA = 27;

    public double tax(double price){
        return price * (AFA/100);
    }

    public double priceWhitTax(double price){
        return price * (1 + (AFA /100));
    }

    public static void main(String[] args) {
        System.out.println(new TaxCalculator().tax(10000));
        System.out.println(new TaxCalculator().priceWhitTax(10000));
    }
}
