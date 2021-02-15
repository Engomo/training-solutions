package week15d01;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Graph {


    public Map.Entry<Double, Double> maxValueEntry(Map<Double, Double> graph) {
        if (graph.size() == 0) {
            throw new IllegalArgumentException("Wrong param!");
        }
        Map.Entry<Double, Double> result = null;
           double max = Collections.max(graph.values());
            for (Map.Entry entry : graph.entrySet()) {
                if (entry.getValue().equals(max)) {
                    result = entry;

                }
            }
            return result;
    }
}
