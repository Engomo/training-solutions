package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg hány óra van (első): ");
        int hours1 = scanner.nextInt();
        System.out.println("Add meg hány perc van (első): ");
        int minutes1 = scanner.nextInt();
        System.out.println("Add meg hány másodperc van (első): ");
        int seconds1 = scanner.nextInt();

        System.out.println("Add meg hány óra van (második): ");
        int hours2 = scanner.nextInt();
        System.out.println("Add meg hány perc van (második): ");
        int minutes2 = scanner.nextInt();
        System.out.println("Add meg hány másodperc van (második): ");
        int seconds2 = scanner.nextInt();

        Time time1 = new Time(hours1,minutes1,seconds1);
        Time time2 = new Time(hours2,minutes2,seconds2);

        System.out.println("Az első időpont " + time1.toString() + " = " + time1.getInMinutes() + "(Perc)");
        System.out.println("A második időpont " + time2.toString() + " = " + time2.getInSeconds() + "(Másodperc)");
        System.out.println("Az első korábbi, mint a második: " + time1.earlierThan(time2));


    }
}
