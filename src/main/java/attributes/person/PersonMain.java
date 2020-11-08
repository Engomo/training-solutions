package attributes.person;

public class PersonMain {
    public static void main(String[] args) {

        Adress adress = new Adress("Magyarország", "Kecskemét", "Petőfi Sándor u. 8", "6000");
        Person person = new Person("Gipsz Jakab", "666666666");

        person.correctPersonData("Gipsz János", "666666");
        System.out.println(person.personToString());

      //  adress.correctAdressData("Románia", "Sepsiszentgyörgy", "Zöld u. 15", "1234");
       // System.out.println(adress.adressToString());


        person.moveTo(adress);
        System.out.println(person.getAdress().adressToString());
    }
}
