package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.println("Adja meg a nevét: ");
        String nev = konzol.nextLine();
        System.out.println("Adja meg az e-mail címét: ");
        String mail = konzol.nextLine();
        System.out.println("az ön neve: "+nev+" Az ön e-mail címe: "+mail);
    }
}
