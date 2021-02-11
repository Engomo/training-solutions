package week15d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeeklyCases {

    private List<Data> dataList = new ArrayList<>();

    public void readFromFileByCountry(Path path, String country) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                dataListByCountry(createData(line), country);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }

    private Data createData(String line) {
        String[] splittedLine = line.split(",");
        return new Data(splittedLine[0], splittedLine[1], splittedLine[2], splittedLine[3], splittedLine[4]);
    }

    private void dataListByCountry(Data data, String country) {
        if (data.getCountriesAndTerritories().equals(country)) {
            dataList.add(data);
            Collections.reverse(dataList);
        }
    }

    public String selectMostWeeklyCases() {
        List<Data> resultList = new ArrayList<>();
        Collections.sort(dataList);
        Collections.reverse(dataList);
        resultList.add(dataList.get(0));
        resultList.add(dataList.get(1));
        resultList.add(dataList.get(2));
        return resultList.toString();
    }


    public static void main(String[] args) {

        WeeklyCases weeklyCases = new WeeklyCases();
        weeklyCases.readFromFileByCountry(Path.of("data.csv"), "Hungary");
        System.out.println(weeklyCases.selectMostWeeklyCases());
    }
}
