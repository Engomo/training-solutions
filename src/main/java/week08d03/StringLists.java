package week08d03;

import java.util.ArrayList;
import java.util.List;

public class StringLists {


    public List<String> stringListsUnion(List<String> first, List<String> second) {
        List<String> result = new ArrayList<>();
        result.addAll(second);
        for (int i = 0; i < first.size(); i++) {
            if (!result.contains(first.get(i))) {
                result.add(first.get(i));
            }
        }
        return result;
    }
}
