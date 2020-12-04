package methodoverloading.pub;

import java.util.ArrayList;
import java.util.List;

public class ListOfGoodPubs {

    private List<Pub> goodPubs = new ArrayList<>();

    public ListOfGoodPubs(List<Pub> listOfGoodPubs) {
        if (listOfGoodPubs == null || listOfGoodPubs.size() == 0) {
            throw new IllegalArgumentException("Pub list is empty!");
        }
        this.goodPubs = listOfGoodPubs;
    }

    public List<Pub> getListOfGoodPubs() {
        return goodPubs;
    }

    public Pub findTheBest() {
        Pub best = goodPubs.get(0);
        for (int i = 0; i < goodPubs.size(); i++) {
            if (goodPubs.get(i).getOpenFrom().isEarlier(best.getOpenFrom())) {
                best = goodPubs.get(i);
            }
        }
        return best;
    }

}
