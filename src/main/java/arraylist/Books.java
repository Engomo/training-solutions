package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<String> titles = new ArrayList<>();

    public void add(String title){
        titles.add(title);
    }

    public List<String> getTitles() {
        return titles;
    }

    public List<String> findAllByPrefix(String prefix){
        List<String> filteredTitles = new ArrayList();
        for (String title: titles){
            if (title.indexOf(prefix) == 0){
                filteredTitles.add(title);
            }
        }
        return filteredTitles;
    }

    public static void main(String[] args) {

        Books books = new Books();

        books.add("Java alapok");
        books.add("Java alapok2");
        books.add("Phyton alapok2");
        System.out.println(books.getTitles());

        List<String> titlesStartWhitJava = books.findAllByPrefix("Java");
        System.out.println(titlesStartWhitJava);

        System.out.println(books.getTitles().get(1));
    }
}
