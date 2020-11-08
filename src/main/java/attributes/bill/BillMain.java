package attributes.bill;

public class BillMain {
    public static void main(String[] args) {
        Bill bill = new Bill();

        bill.addItem(new Item("füzet", 2, 250));
        bill.addItem(new Item("ceruza", 10, 600));
        bill.addItem(new Item("radír", 3, 440));

        System.out.println(bill.calculateTotalPrice());
    }
}
