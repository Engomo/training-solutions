package week14d01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Indexer {

    public Map<Character, List<String>> index(List<String> names) {
        Map<Character, List<String>> map = new HashMap();

        for (String name : names) {
            char init = name.charAt(0);
            if (!map.containsKey(init)) {
                map.put(init, new ArrayList<>());
            }
            map.get(init).add(name);
        }
        return map;
    }

    public static void main(String[] args) {
        Indexer indexer = new Indexer();

        System.out.println(indexer.index(List.of("Józsi", "Béla", "Jucus", "Laci", "Liza")));
    }
}
