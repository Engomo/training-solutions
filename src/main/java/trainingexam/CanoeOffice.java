package trainingexam;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CanoeOffice {

//    private List<CanoeRental> canoeRentalList = new ArrayList<>();
//
//    public void createRental(CanoeRental canoeRental) {
//        canoeRentalList.add(canoeRental);
//    }
//
//    public CanoeRental findRentalByName(String name) {
//        for (CanoeRental cr : canoeRentalList) {
//            if (cr.getName().equals(name) && isActive(cr)) {
//               return cr;
//            }
//        }
//        throw new IllegalArgumentException("Can't find rental");
//    }
//
//    private boolean isActive(CanoeRental cr) {
//        return cr.getEndTime() == null;
//    }
//
//    public void closeRentalByName(String name, LocalDateTime endTime) {
//        CanoeRental result = findRentalByName(name);
//        result.setEndTime(endTime);
//    }
//
//    public double getRentalPriceByName(String name, LocalDateTime endTime) {
//        CanoeRental result = findRentalByName(name);
//        closeRentalByName(result.getName(), endTime);
//        switch (result.getCanoeType()) {
//            case RED -> 5000 * 1.0 *  result.calculateRentalSum();
//            case BLUE ->
//        }
//    }
//
//

}
