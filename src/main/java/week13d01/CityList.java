package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;

public class CityList {

    public String maxLengthCityFromFile(String fileName) {
        try (BufferedReader br = Files.newBufferedReader(Path.of("src/main/resources/" + fileName))) {
            skipHeader(br);
           return selectMaxLenghtCity(br);
        } catch (IOException e) {
           throw new IllegalStateException("cannot read file");
        }
    }

    private void skipHeader(BufferedReader bufferedReader) throws IOException{
        bufferedReader.readLine();
    }

    private String splitLine(String line) {
        String[] splitted = line.split(";");
        return splitted[1].trim();
    }

    private String selectMaxLenghtCity(BufferedReader bufferedReader) throws IOException {
        String maxLength = "";
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String city = splitLine(line);
            if (city.length() > maxLength.length()) {
                maxLength = city;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        CityList cityList = new CityList();
        System.out.println(cityList.maxLengthCityFromFile("iranyitoszamok-varosok-2021.csv"));
    }
}
