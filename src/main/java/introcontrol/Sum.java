package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i < 6; i++) {
            System.out.println("Adja meg a(z) " + i + ". számot: ");

            int szam = scanner.nextInt();
            sum += szam;
        }
        System.out.println(sum);

    }
}
