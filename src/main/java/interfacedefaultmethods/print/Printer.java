package interfacedefaultmethods.print;

public class Printer {

    public String print(Printable printable){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < printable.getLength(); i++) {
            if ("#000000".equals(printable.getColor(i))) {
                sb.append(printable.getPage(i)).append("\n");
            }else {
                sb.append("[" + printable.getColor(i) + "]" + printable.getPage(i) + "\n");
            }
        }
        return sb.toString();
    }
}
