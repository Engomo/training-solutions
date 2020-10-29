package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();
        System.out.println("Add meg a neved: ");
        client.name = scanner.nextLine();
        System.out.println("Add meg a születési éved: ");
        client.year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Add meg a címed: ");
        client.adress = scanner.nextLine();
        System.out.println(client.name + "\n" + client.year + "\n" + client.adress);
    }
}
