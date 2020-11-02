package statements;

import java.util.Scanner;

public class InvestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A befektetés összege: ");
        int amount = scanner.nextInt();
        System.out.println("Kamatláb: ");
        int intrestRate = scanner.nextInt();

        Investment investment = new Investment(amount, intrestRate);
        System.out.println("Tőke: " + investment.getFund());
        System.out.println("Hozam 50 napra: " + investment.getYield(50));
        System.out.println("Kivett összeg 80 nap után: " + investment.close(80));
        System.out.println("Kivett összeg 90 nap után: " + investment.close(90));
    }
}
