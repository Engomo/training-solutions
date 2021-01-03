package catalog;

import java.util.ArrayList;
import java.util.List;

public class PrintedFeatures implements Feature{

    private List<String> authors = new ArrayList<>();
    private int numberOfPages;
    private String title;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        if (title.isBlank()) {
            throw  new IllegalArgumentException("Empty title");
        }
        if (numberOfPages < 1) {
            throw new IllegalArgumentException("No pages!");
        }
        try {
            authors.isEmpty();
        }catch (Exception e) {
            throw new IllegalArgumentException("No authors!");
        }
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.authors = authors;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public List<String> getContributors() {
        return authors;
    }
}
