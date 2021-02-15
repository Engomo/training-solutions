package week15d01;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @Test
    public void testGraph() {
        Graph graph = new Graph();

        Map<Double, Double> graphMap = new HashMap<>();
        graphMap.put(-2.0, -1.0);
        graphMap.put(-1.0, -6.7);
        graphMap.put(-0.0, -7.8);
        graphMap.put(1.0, 3.0);
        graphMap.put(2.0, 4.5);
        graphMap.put(5.0, 6.5);
        graphMap.put(3.0, 6.5);
        graphMap.put(4.0, 6.5);

        Map.Entry<Double, Double> result = graph.maxValueEntry(graphMap);
        assertEquals(3.0, result.getKey());
        assertEquals(6.5, result.getValue());
    }
}