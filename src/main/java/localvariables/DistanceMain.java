package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(66.6,true);
        System.out.println(distance.getDistanceInKm() + " " + distance.isExact());

        int d = (int)distance.getDistanceInKm();

        System.out.println(d);
    }
}
