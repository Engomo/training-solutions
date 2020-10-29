package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Song song = new Song();
        System.out.println("Adja meg kedvenc száma Szerzőjét: ");
        song.band = scanner.nextLine();
        System.out.println("Adja meg kedvenc száma címét: ");
        song.title = scanner.nextLine();
        System.out.println("Adja meg kedvenc száma hosszát(mp): ");
        song.lenght = scanner.nextInt();
        System.out.println(song.band + "-" + song.title + "-" + song.lenght + "mp");
    }
}
