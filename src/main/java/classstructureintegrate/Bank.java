package classstructureintegrate;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Első Számlaszám: ");
        String accountNumber = scanner.nextLine();
        System.out.println("Első Név: ");
        String owner = scanner.nextLine();
        System.out.println("Első Egyenleg: ");
        int balance = scanner.nextInt();
        scanner.nextLine();

        BankAccount account1 = new BankAccount(accountNumber, owner, balance);


        System.out.println("Második Számlaszám: ");
        String accountNumber1 = scanner.nextLine();
        System.out.println("Második Név: ");
        String owner1 = scanner.nextLine();
        System.out.println("Második Egyenleg: ");
        int balance1 = scanner.nextInt();
        scanner.nextLine();

        BankAccount account2 = new BankAccount(accountNumber1, owner1, balance1);

        System.out.println(account1.getinfo() + "\n" + account2.getinfo());

        System.out.println("Mennyit szeretne befizetni az első számlára? ");
        int depositAmount = scanner.nextInt();
        account1.deposit(depositAmount);

        System.out.println(account1.getinfo());

        System.out.println("Mennyit szeretne felvenni a második számláról? ");
        int withdrawAmount = scanner.nextInt();
        account2.withdraw(withdrawAmount);
        System.out.println(account2.getinfo());

        System.out.println("Mennyit szeretne utalni az első számláról a másodikra? ");
        int transferAmount = scanner.nextInt();
        account1.transfer(account2, transferAmount);
        System.out.println(account1.getinfo() + "\n" + account2.getinfo());


    }
}
