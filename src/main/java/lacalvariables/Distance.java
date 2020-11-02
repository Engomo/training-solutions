package lacalvariables;

public class Distance {
    private double distanceInKm;
    private boolean exact;

    public double getDistanceInKm() {
        return distanceInKm;
    }

    public boolean isExact() {
        return exact;
    }
    public Distance(double distanceInKm, boolean exact){
        this.distanceInKm = distanceInKm;
        this.exact = exact;
    }

}
