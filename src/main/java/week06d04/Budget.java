package week06d04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Budget {
  private List<Item> items = new ArrayList<>();

    public Budget(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItemsByMonth(int month) {
        List<Item> result = new ArrayList<>();
        for (Item i : items) {
            if (i.getDate().getMonth().equals(getItemsByMonth(month))) {
                result.add(i);
            }
        }
        return result;
    }
}
