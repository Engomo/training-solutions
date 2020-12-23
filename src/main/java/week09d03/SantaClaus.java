package week09d03;

import java.util.ArrayList;
import java.util.List;

public class SantaClaus {

    private List<Person> people = new ArrayList<>();

    public void getThroghChimneys(List<Person> people) {
        for (Person person : people) {
            person.setPresent();
        }
    }
}
