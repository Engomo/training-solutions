package week04;

import java.util.ArrayList;
import java.util.List;

public class CharOperations {

    public List<Integer> getPositionOfChar(String base, String part) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < base.length(); i++) {
            if (base.substring(i, i + part.length()).equals(part)) {
                result.add(i);
            }
        }
        return result;
    }
}
