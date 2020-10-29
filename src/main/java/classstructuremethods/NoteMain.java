package classstructuremethods;

import java.util.Scanner;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a nevét: ");
        note.setName(scanner.nextLine());
        System.out.println("Adja meg a témát: ");
        note.setTopic(scanner.nextLine());
        System.out.println("Írja le a jegyzetet: ");
        note.setText(scanner.nextLine());
        System.out.println(note.getNoteText());
    }
}
