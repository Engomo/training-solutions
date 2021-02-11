package week15d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class WeeklyCases {

    private List<Data> dataList = new ArrayList<>();

    public void readFromFile(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
            dataListByCountry(createData(line), "Hungary");
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }

    private Data createData(String line) {
        String[] splittedLine = line.split(",");
        return new Data(splittedLine[0], splittedLine[1], splittedLine[2], splittedLine[3],splittedLine[4]);
    }

    private void dataListByCountry(Data data, String country) {
        if(data.getCountriesAndTerritories().equals(country)) {
            dataList.add(data);
        }
    }

    public String selectMostWeeklyCases() {
        Data result = dataList.get(0);
        for (Data d : dataList) {
            if (Integer.parseInt(d.getCases_weekly()) > Integer.parseInt(result.getCases_weekly())) {
                result = d;
            }
        }
        return result.getYear_week();
    }

    public static void main(String[] args) {
        WeeklyCases weeklyCases = new WeeklyCases();
        weeklyCases.readFromFile(Path.of("data.csv"));
        System.out.println(weeklyCases.selectMostWeeklyCases());

    }
}
