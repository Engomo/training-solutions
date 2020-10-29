package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.println("Az első egész szám: ");
        int szam1 = konzol.nextInt();
        System.out.println("A második egész szám: ");
        int szam2 = konzol.nextInt();
        System.out.println(szam1" + " szam2 "=");
        System.out.println(szam1+szam2);
    }
}
