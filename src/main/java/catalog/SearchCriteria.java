package catalog;

public class SearchCriteria {

    public String contributor;
    public String title;

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }

    public boolean hasContributor() {
        return contributor != "";
    }

    public boolean hasTitle() {
        return title != "";
    }

    private SearchCriteria(String contributor, String title) {
        this.contributor = contributor;
        this.title = title;
    }

    public static SearchCriteria createByBoth(String contributor, String title) {
        if (contributor == null || title == null) {
            throw new IllegalArgumentException("Invalid parameters!");
        }
        return new SearchCriteria(contributor, title);
    }

    public static SearchCriteria createByContributor(String contributor) {
        return createByBoth(contributor, "");
    }

    public static SearchCriteria createByTitle(String title) {
        return createByBoth("", title);
    }
}
