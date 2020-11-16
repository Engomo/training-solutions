package week04;

import java.util.Scanner;

public class NameChanger {

    private String fullName;

    public NameChanger(String fullName) {
        if (fullName == null || fullName.isBlank()){
            throw new IllegalArgumentException("Invalid Name!");
        }
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

   public void changeFirstName(String firstName) {
        String str = firstName.trim();
        fullName = fullName.replace(fullName.substring(fullName.indexOf(" ") + 1),str);
   }
}
