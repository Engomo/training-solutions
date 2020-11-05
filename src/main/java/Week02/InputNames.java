package Week02;

import java.util.Scanner;

public class InputNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // String name = new String();
        String[] name = new String[5];
        for(int i = 0; i < 5; i++){

            System.out.println("Adja meg az " + (i + 1) + ". nevet: ");
            name[i] = scanner.nextLine();
            System.out.println(name[i] + ", ");
        }

    }
}
