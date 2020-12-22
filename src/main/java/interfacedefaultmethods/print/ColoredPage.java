package interfacedefaultmethods.print;

public class ColoredPage {

    private String page;

    private String color;

    public ColoredPage(String page, String color) {
        this.page = page;
        this.color = color;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
