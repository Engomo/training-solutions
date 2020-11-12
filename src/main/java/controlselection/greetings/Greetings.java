package controlselection.greetings;

import java.time.LocalTime;

public class Greetings {

    private LocalTime time0500 = LocalTime.of(5,00);
    private LocalTime time0900 = LocalTime.of(9,00);
    private LocalTime time1830 = LocalTime.of(18,30);
    private LocalTime time2000 = LocalTime.of(20,00);


    public String greetings(LocalTime time){
        if(time.isAfter(time0500) && time.isBefore(time0900)){
            return "Jó reggelt!";
        }
        if(time.isAfter(time0900) && time.isBefore(time1830)){
            return "Jó napot!";
        }
        if(time.isAfter(time1830) && time.isBefore(time2000)){
            return "jó estét!";
        }
        if(time.isAfter(time2000) || time.isBefore(time0500)){
            return "Jó éjt!";
        }
        return null;
    }

    public static void main(String[] args) {
       Greetings greetings = new Greetings();

        System.out.println(greetings.greetings(LocalTime.of(04,55)));
    }
}
