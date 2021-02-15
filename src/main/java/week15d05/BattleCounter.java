package week15d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class BattleCounter {

   private Map<String, Integer> houseMap = new HashMap<>();

    public Map.Entry<String, Integer> readFromFile(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            br.readLine();
            Map<String, Integer> houseMap = new HashMap<>();
            while ((line = br.readLine()) != null) {
                loadHouses(line, houseMap);

            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot find file", ioe);
        }
        return getHouseWithMostBattle(houseMap);
    }

    private void loadHouses (String line, Map<String, Integer> houseMap) {
        Map<String, Integer> result = new HashMap<>();
        String[] temp = line.split(",");
        List<String> houses = List.of(temp[5], temp[6], temp[7], temp[8], temp[9], temp[10], temp[11], temp[12]);
        fillMap(result, houses);
    }

    private void fillMap(Map<String, Integer> houseMap, List<String> houses) {
        for (String house : houses) {
            if (!house.isEmpty()) {
                if (!houseMap.containsKey(house)) {
                    houseMap.put(house, 0);
                }
                houseMap.replace(house, houseMap.get(house) + 1);
            }
        }
    }

    private Map.Entry<String, Integer> getHouseWithMostBattle(Map<String, Integer> houseMap) {
        int value = Collections.max(houseMap.values());
        Map.Entry<String, Integer> result = null;
        for (Map.Entry<String, Integer> entry : houseMap.entrySet()) {
            if (entry.getValue().equals(value)) {
                result = entry;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        BattleCounter battleCounter = new BattleCounter();
        battleCounter.readFromFile(Path.of("battles.txt"));
    }
}
