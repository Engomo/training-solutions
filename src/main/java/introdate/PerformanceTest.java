package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {
    public static void main(String[] args) {
        Performance performance = new Performance("Queen", LocalDate.of(2020,12,24), LocalTime.of(18,00),LocalTime.of(22,00));
        System.out.println(performance.getInfo());
    }
}
