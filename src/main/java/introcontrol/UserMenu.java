package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Felhasználók listázása\n" +
                "2. Felhasználó felvétele\n" +
                "Többi: Kilépés");
        int szam = scanner.nextInt();
        if(szam == 1){
            System.out.println("Felhasználók listázása");
        }
        else if(szam==2){
            System.out.println("Felhasználó felvétele");
        }
        else{
            System.out.println("");
        }
    }
}
