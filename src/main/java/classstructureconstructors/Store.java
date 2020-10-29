package classstructureconstructors;

public class Store {
    private String product;
    private int stock;

    public String getProduct() {
        return product;
    }

    public int getStock() {
        return stock;
    }

    public Store(String product) {
        this.product = product;
    }

    public void store(int store){
        this.stock = stock + store;
    }
    public void dispatch(int dispatch){
        this.stock = stock - dispatch;
    }

    }

