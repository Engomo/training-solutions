package week07d03;

import java.util.List;

public class NumberList {

    public boolean isIncreasing(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) <= numbers.get(i + 1)) {
                return true;
            }
        }
        return false;
    }
}
