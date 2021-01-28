package week13d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class AirLines {

    private List<Fly> flyList = new ArrayList<>();

    public void readFromFile(String fileName) {
        try(BufferedReader reader = Files.newBufferedReader(Path.of(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
               flyList.add(makeFlyFromLines(reader));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't read file", ioe);
        }
    }

    private Fly makeFlyFromLines(BufferedReader reader) throws IOException {
        String[] splittedLine = reader.readLine().split(" ");
        Status status = splittedLine[1].equals("Arrival") ? Status.ARRIVAL : Status.DEPARTURE;
        String[] splitTime = splittedLine[3].split(":");
        LocalTime time = LocalTime.of(Integer.parseInt(splitTime[0]), Integer.parseInt(splitTime[1]));
        return new Fly(splittedLine[0], status , splittedLine[2],time);
    }

    public String arrivalOrDeparture() {
        int sumOfArrival = 0;
        int sumOfDeparture = 0;
        for (Fly f : flyList) {
            if (f.getStatus() == Status.ARRIVAL) {
                sumOfArrival++;
            } else {
                sumOfDeparture++;
            }
        }
        return (sumOfArrival > sumOfDeparture) ? "Arrival" : "Departure";
    }

    public Fly searchByFlyId(String flyId) {
        for (Fly f : flyList) {
            if (f.getFlyId().equals(flyId)) {
                return f;
            }
        }
        throw new IllegalArgumentException("Can't find fly!");
    }

    public List<Fly> fliesByCityAndStatus(String city, Status status) {
        List<Fly> result = new ArrayList<>();
        for (Fly f : flyList) {
            if (f.getCity().equals(city) && f.getStatus() == status) {
                result.add(f);
            }
        }
        return result;
    }

    public Fly earliestDepartureFly() {
        Fly earliest = flyList.get(0);
        for (Fly f : flyList) {
            if (f.getTime().isBefore(earliest.getTime()) && f.getStatus() == Status.DEPARTURE) {
                earliest = f;

            }
        }
        return earliest;
    }

    public List<Fly> getFlyList() {
        return flyList;
    }

    public static void main(String[] args) {
        AirLines airLines = new AirLines();
        airLines.readFromFile("cities.txt");
        System.out.println(airLines.getFlyList().toString());
        System.out.println(airLines.arrivalOrDeparture());
        System.out.println(airLines.searchByFlyId("KJ7245"));
        System.out.println(airLines.fliesByCityAndStatus("Bern", Status.ARRIVAL).toString());
        System.out.println(airLines.earliestDepartureFly());
    }
}
