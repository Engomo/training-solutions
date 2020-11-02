package statements;

import java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Adjon meg egy egész számot: ");
        int number = scanner.nextInt();

        boolean divThree = !(number%3 == 1 || number%3 == 2);
        System.out.println("A szám osztható 3-al: " + divThree);
    }
}
