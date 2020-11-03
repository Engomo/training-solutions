package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();

        System.out.println(introControl.substractTenIfGreaterThanTen(2));
        System.out.println(introControl.substractTenIfGreaterThanTen(10));
        System.out.println(introControl.substractTenIfGreaterThanTen(36));

        System.out.println(introControl.greetingToJoe("Joe"));
        System.out.println(introControl.greetingToJoe("Laci"));

        System.out.println(introControl.calculateBonus(1500000));
        System.out.println(introControl.calculateBonus(500000));

        System.out.println(introControl.calculateConsumption(23,30));

        System.out.println("printNumbers");
        introControl.printNumbers(15);

        System.out.println("printNumberBetween");
        introControl.printNumbersBetween(10,20);

        System.out.println("printNumberBetweenAnyDirection");
        introControl.printNumbersBetweenAnyDirection(10,20);
        introControl.printNumbersBetweenAnyDirection(20,10);

        System.out.println("PrintOddNumber");
        introControl.printOddNumbers(9);
    }
}
