package week11d02;

public class Ride {

    private int day;
    private int witchRide;
    private int km;

    public Ride(int day, int witchRide, int km) {
        this.day = day;
        this.witchRide = witchRide;
        this.km = km;
    }

    public int getDay() {
        return day;
    }

    public int getWitchRide() {
        return witchRide;
    }

    public int getKm() {
        return km;
    }
}
