package week09d03;

import java.util.Random;

public class Person {

    Random random = new Random();

    private String name;
    private int age;
    private Present present;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Present getPresent() {
        return present;
    }

    public void setPresent() {
       int num = random.nextInt(4);
       switch (num) {

           case 1:
               this.present = Present.DECORATION;
               break;
           case 2:
               this.present = Present.ELECTRONIC;
               break;
           case 3:
               this.present = Present.HOUSEKEEPING;
               break;

           case 0:
               if (getAge() > 14) {
                   setPresent();
                   break;
               }
               this.present = Present.TOY;
               break;
       }
    }
}
