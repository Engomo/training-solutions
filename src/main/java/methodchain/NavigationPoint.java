package methodchain;

public class NavigationPoint {

    private int naviDistance;

    private int naviAzimut;

    public NavigationPoint(int naviDistance, int naviAzimut) {
        this.naviDistance = naviDistance;
        this.naviAzimut = naviAzimut;
    }

    public int getNaviDistance() {
        return naviDistance;
    }

    public int getNaviAzimut() {
        return naviAzimut;
    }

    @Override
    public String toString() {
        return "distance: " + naviDistance + " azimut: " +naviAzimut;
    }
}
