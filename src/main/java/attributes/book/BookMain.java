package attributes.book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Java");

        System.out.println(book.getTitle());

        book.setTitle("java2");

        System.out.println(book.getTitle());
    }
}
