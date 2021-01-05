package week10d02;

import java.util.ArrayList;
import java.util.List;

public class MaxTravel {

    public static final int MAX_AMOUNT_OF_STOPS = 30;

    public int getMaxIndex(List<Integer> passengerList) {
        int[] availableStops = new int[30];

        int result = 0;
        int buffer = 0;

        for (int item : passengerList) {
            availableStops[item] ++;
        }
        for (int i = 0; i < availableStops.length; i++) {
            if (availableStops[i] > buffer) {
                buffer = availableStops[i];
                result = i;
            }
        }
        return result;
    }


}
