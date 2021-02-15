package exam03;

import java.text.Collator;
import java.time.LocalDate;
import java.util.*;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void bookPassenger(Passenger passenger) {
        if (boat.getMaxPassengers() == passengers.size()) {
            throw new IllegalArgumentException("Cannot overload passengers");
        } else {
            passengers.add(passenger);
        }
    }

    public double getPriceForPassenger(Passenger passenger) {
        if (passenger.getCruiseClass().equals(CruiseClass.SECOND)) {
            return basicPrice;
        } else if (passenger.getCruiseClass().equals(CruiseClass.FIRST)) {
            return basicPrice * 1.8;
        } else {
            return basicPrice * 3.0;
        }
    }

    public Passenger findPassengerByName(String name) {
        Passenger result = null;
        for (Passenger passenger : passengers) {
            if (passenger.getName().equals(name)) {
                result = passenger;
            }
        }
        return result;
    }

    public List<String> getPassengerNamesOrdered() {
        List<String> orderedList = new ArrayList<>();
        for (Passenger passenger : passengers) {
            orderedList.add(passenger.getName());
        }
        Collections.sort(orderedList, Collator.getInstance());
        return orderedList;
    }

    public double sumAllBookingsCharged() {
        double result = 0.0;
        for (Passenger passenger : passengers) {
            result += getPriceForPassenger(passenger);
        }
        return result;
    }

    public Map<CruiseClass, Integer> countPassengerByClass() {
        Map<CruiseClass, Integer> result = new HashMap<>();
        for (Passenger passenger : passengers) {
            if (!result.containsKey(passenger.getCruiseClass())) {
                result.put(passenger.getCruiseClass(), 1);
            }else {
                result.put(passenger.getCruiseClass(), result.get(passenger.getCruiseClass()) + 1);
            }
        }
        return result;
    }
}
