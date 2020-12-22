package interfacedefaultmethods.print;

public interface Printable {

    int getLength();

    String BLACK = "#000000";

    String getPage(int pageNumber);

   default String getColor(int pageNumber) {
       return BLACK;
   }
}
