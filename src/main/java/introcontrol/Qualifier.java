package introcontrol;

import java.util.Scanner;

public class Qualifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adjon meg egy számot: ");
        int number = scanner.nextInt();
        if (number > 100) {
            System.out.println("Nagyobb mint 100!");
        } else {
            System.out.println("Kisebb mint 100");
        }
    }
}