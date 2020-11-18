package week04;

import java.util.Random;
import java.util.Scanner;

public class GetTheNumber {

    Random rnd = new Random();

    Scanner scanner = new Scanner(System.in);

    public void getTheNumber() {
        int randomNumber = rnd.nextInt(100) + 1;
        int myNumber = 0;

        for (int i = 0; i < 6 && myNumber != randomNumber; i++) {
            System.out.println("Adja meg a számot amire gondol: ");
            myNumber = Integer.parseInt(scanner.nextLine());
            if (myNumber < randomNumber) {
                System.out.println("Nagyobb");
            }
            if (myNumber > randomNumber) {
                System.out.println("Kisebb");
            }
            if (myNumber == randomNumber) {
                System.out.println("kitaláltad!");
            }
        }
        if (myNumber == randomNumber){
            System.out.println("Ügyes vagy!");
        }
        else{
            System.out.println("Nem Sikerült!");
        }

    }

    public static void main(String[] args) {
        GetTheNumber getTheNumber = new GetTheNumber();
        getTheNumber.getTheNumber();
    }
}
