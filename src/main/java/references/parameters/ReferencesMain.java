package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {


        Person p1 = new Person("Béla", 66);
        Person p2 = new Person("Józsi", 45);

        Person p3 = p1;

        p3.setName("Karesz");

        System.out.println(p1.getName());
        System.out.println(p3.getName());

    int number = 24;
    int number1 = number;

    number1 = number1 + 1;

        System.out.println(number);
        System.out.println(number1);

        Person p4 = p2;

        System.out.println(p4.toString());
        System.out.println(p2.toString());

    }
}
