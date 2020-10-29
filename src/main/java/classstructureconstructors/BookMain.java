package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {
       Book book = new Book("J.K. Rowling","Harry Potter");
        System.out.println(book.getAuthor() + ": " + book.getTitle());

        book.register("1");
        System.out.println("Regisztrációs szám: " + book.getRegNumber());
    }
}
