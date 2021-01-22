package week12d03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberStat {

    public int findSmallestUnique(List<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty!");
        }

        List<Integer> sortList = new ArrayList<>(list);
        Collections.sort(sortList);

        if (list.size() == 1) {
            return list.get(0);
        }

        if (sortList.size() == 2) {
            if (sortList.get(0) != sortList.get(1)) {
                return sortList.get(0);
            }else {
                throw new IllegalStateException("Wrong list!");
            }
        }

        for(int i = 1; i < sortList.size() - 1; i++) {
            if (sortList.get(i - 1) != sortList.get(i) && sortList.get(i + 1) != sortList.get(i)) {
                return sortList.get(i);
            }
        }
        if (sortList.get(sortList.size() - 1) != sortList.get(sortList.size() - 2)) {
            return sortList.get(sortList.size() - 1);
        }
        throw new IllegalStateException("Wrong list!");
    }
}
