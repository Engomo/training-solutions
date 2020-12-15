package week02;

import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    private Office office;

    public void readOffice() {
        office = new Office();
        System.out.println("Hány darab tárgyalót szeretne létrehozni? ");
        int db = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < db; i++) {

            System.out.println("Adja meg a(z)" + (i + 1) + ". tárgyaló nevét: ");
            String name = (scanner.nextLine());

            System.out.println("Adja meg a(z)" + (i + 1) + ". tárgyaló hosszúságát: ");
            int lenght = (Integer.parseInt(scanner.nextLine()));

            System.out.println("Adja meg a(z)" + (i + 1) + ". tárgyaló szélességét: ");
            int widht = (Integer.parseInt(scanner.nextLine()));

            office.addMeetingRoom(new MeetingRoom(name, lenght, widht));
        }
    }

    public void printMenu() {
        System.out.println("1. Tárgyalók sorrendben\n" +
                "2. Tárgyalók visszafele sorrendben\n" +
                "3. Minden második tárgyaló\n" +
                "4. Területek\n" +
                "5. Keresés pontos név alapján\n" +
                "6. Keresés névtöredék alapján\n" +
                "7. Keresés terület alapján");
    }

    public void runMenu() {
        int selector = 1;

        do {
            System.out.println("Válassz egy menüpontot: ");
            selector = Integer.parseInt(scanner.nextLine());
        }
        while (selector > 0 && selector < 8);
        {
        }

        switch (selector) {
            case 1:
                office.printNames();
                break;
            case 2:
                office.printNamesReverse();
                break;
            case 3:
                office.printEventNames();
                break;
            case 4:
                office.printAreas();
                break;
            case 5:
                System.out.println("Adja meg a tárgyaló nevét: ");
                office.printMeetingRoomsWithName(scanner.nextLine());
                break;
            case 6:
                System.out.println("Adja meg a keresendő kifejezést: ");
                office.printMeetingRoomsContains(scanner.nextLine());
                break;
            case 7:
                System.out.println("Adja meg a tárgyaló minimum területét: ");
                office.printAreasLargerThan(Integer.parseInt(scanner.nextLine()));
                break;
            default:

                break;
        }

    }


    public static void main(String[] args) {

        Controller controller = new Controller();

        controller.readOffice();
        controller.printMenu();
        controller.runMenu();
    }
}



