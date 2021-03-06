package week06d04;

import java.time.LocalDate;

public class Item {
    private int price;
    private LocalDate date;
    private String name;

    public Item(int price, LocalDate date, String name) {
        this.price = price;
        this.date = date;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "price=" + price +
                ", date=" + date +
                ", name='" + name + '\'' +
                '}';
    }
}
