package immutable.satellite;

import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {

    private List<Satellite> satellites = new ArrayList<>();


    public void registerSatellite(Satellite satellite) {
        satellites.add(satellite);
    }

    public Satellite findSatelliteByRegisterIdent(String registerIdent) {
        for (Satellite s : satellites) {
            if (s.getRegisterIdent().equals(registerIdent)) {
                return s;
            }
        }
        throw new IllegalArgumentException("Satellite with the given registration cannot be found!" + registerIdent);
    }

    @Override
    public String toString() {
        return satellites.toString();
    }
}
