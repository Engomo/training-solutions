package week11d02;

import java.util.ArrayList;
import java.util.List;

public class Courier {

    private List<Ride> rides = new ArrayList<>();

    public void addRide(Ride rideToAdd) {

        if (rides.size() == 0 && rideToAdd.getWitchRide() == 1) {
            rides.add(rideToAdd);
        } else {
            throw new IllegalArgumentException("Az első fuvarral kezd");
        }

        if (rideToAdd.getDay() < rides.get(rides.size() - 1).getDay() || rideToAdd.getDay() != rides.get(rides.size() - 1).getDay()) {
            throw new IllegalArgumentException("Vagy ugyanazt a napot, vagy későbbit kell megadni!");
        }

        if (rides.get(rides.size() - 1).getWitchRide() + 1 != rideToAdd.getWitchRide()) {
            throw new IllegalArgumentException("A fuvarok csak sorban jöhetnek");
        }
        rides.add(rideToAdd);
    }

    public int getHoliday() {
        boolean[] workdays = new boolean[7];
        for (int i = 0; i < rides.size();i++) {
            workdays[rides.get(i).getDay() -1] =false;
        }

        for (int j = 0; j < workdays.length; j++) {
            if (workdays[j] = false) {
                return j;
            }
        }
        return -1;
    }
}
