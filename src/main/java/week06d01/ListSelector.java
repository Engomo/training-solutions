package week06d01;

import java.util.List;

public class ListSelector {

    public String listSelector(List<String> list) {
        StringBuilder sb = new StringBuilder();
        if (list == null) { throw new IllegalStateException("list should be not null!"); }

//        if ("".equals(list)) {sb = ""};
        sb.append("[");
        for (int i = 0; i < list.size(); i += 2){
            sb.append(list.get(i));
        }
        sb.append("]");
        return sb.toString();
    }
}

