package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store store = new Store("Tej");
        store.store(15);
        System.out.println(store.getProduct() + ": " + store.getStock());
        Store anotherstore = new Store("Kenyér");
        anotherstore.store(10);
        System.out.println(anotherstore.getProduct() + ": " + anotherstore.getStock());

        store.dispatch(5);
        anotherstore.dispatch(10);
        System.out.println(store.getProduct() + ": " + store.getStock());
        System.out.println(anotherstore.getProduct() + ": " + anotherstore.getStock());

    }
}
