package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Adja meg a Felhasználónevét: ");
        String name = scanner.nextLine();
        System.out.println("Adja meg az e-mail címét: ");
        String email = scanner.nextLine();
        System.out.println("Adja meg kétszer a jelszót: ");
        String password1 = scanner.nextLine();
        String password2 = scanner.nextLine();

UserValidator userValidator = new UserValidator();

        System.out.println(userValidator.isValisUsername(name) ? "felhasználónév rendben" : "felhasználónév helytelen");
        System.out.println(userValidator.isValidPassword(password1, password2) ? "jelszó rendben" : "jelszó helytelen");
        System.out.println(userValidator.isValidEmail(email) ? "e-mail rendben" : "e-mail helytelen");

    }
}
