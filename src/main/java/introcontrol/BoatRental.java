package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int csonak1 = 5;
        int csonak2 = 3;
        int csonak3 =2;

        System.out.println("Hány fő szeretne csónakázni?");
        int letszam = scanner.nextInt();

        int helyek = 10;
        int csonakok = 3;

        if (letszam > 3){
            System.out.println("5-ös csónak");
            letszam = letszam - 5;
            csonakok--;
            helyek = helyek -5;
        }
        if (letszam > 2){
            System.out.println("3-As csónak");
            letszam = letszam - 3;
            csonakok--;
            helyek = helyek -3;
        }
        if (letszam > 0){
            System.out.println("2-e csónak");
            letszam = letszam - 2;
            csonakok--;
            helyek = helyek -2;
        }
        if (letszam > 0){
            System.out.println("Nem fér el mindenki.");
        }
        else{
            System.out.println("üres helyek: " + helyek);
            System.out.println("Üres csónakok: " + csonakok);
        }

    }
}
