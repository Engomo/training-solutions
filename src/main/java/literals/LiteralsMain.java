package literals;

public class LiteralsMain {
    public static void main(String[] args) {

        System.out.println(1 + "" + 2);
        System.out.println(Integer.toString(1) + Integer.toString(2));

        double quotient = (3 / 4);
        double quotient2 = (3.0 / 4.0);
        double quotient3 = (3D / 4D);

        System.out.println(quotient);
        System.out.println(quotient2);
        System.out.println(quotient3);

        long big = 3_244_444_444L;

        String s = "árvíztűrőtükörfúrógép";

        String word = "title".toUpperCase();

        System.out.println(word);

        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));
            }
}
