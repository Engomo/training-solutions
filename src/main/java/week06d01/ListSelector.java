package week06d01;

import java.util.List;

public class ListSelector {

    public String listSelector(List<String> list) {

        if (list == null) {
            throw new IllegalArgumentException("list should be not null!");
        }

        StringBuilder sb = new StringBuilder();

        if (list.size() != 0) {
            sb.append("[");
            for (int i = 0; i < list.size(); i += 2) {
                sb.append(list.get(i));
            }
            sb.append("]");

        }
        return sb.toString();
    }
}
