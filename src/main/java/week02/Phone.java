package week02;

import java.util.Scanner;

public class Phone {
    private String type;
    private int mem;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMem() {
        return mem;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }


    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Phone phone1 = new Phone("S",8);
        Phone phone2 = new Phone("S",8);

        System.out.println("Adja meg az első telefon tipusát: ");
        phone1.setType(scanner.nextLine());
        System.out.println("Adja meg az első telefon memória mennyiségét: ");
        phone1.setMem(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Adja meg az második telefon tipusát: ");
        phone2.setType(scanner.nextLine());
        System.out.println("Adja meg az második telefon memória mennyiségét: ");
        phone2.setMem(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Az első telefon tipusa: " + phone1.type + "Memóriája: " + phone1.mem);
        System.out.println("Az második telefon tipusa: " + phone2.type + "Memóriája: " + phone2.mem);


    }
}
