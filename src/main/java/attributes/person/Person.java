package attributes.person;

public class Person {
    private String name;
    private String identificationCard;
    private Adress adress;

    public void moveTo(Adress adress){
        this.adress = adress;
    }

    public Adress getAdress() {
        return adress;
    }

    public Person(String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentificationCard() {
        return identificationCard;
    }

    public void setIdentificationCard(String identificationCard) {
        this.identificationCard = identificationCard;
    }

    public String personToString() {
        return getName() + getIdentificationCard();
    }

    public void correctPersonData(String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;
    }
}
