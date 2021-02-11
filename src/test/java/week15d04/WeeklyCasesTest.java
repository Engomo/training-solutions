package week15d04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class WeeklyCasesTest {

   WeeklyCases weeklyCases = new WeeklyCases();


    @Test
    void selectMostWeeklyCases() {
        weeklyCases.readFromFileByCountry(Path.of("data.csv"), "Hungary");
        assertEquals("2020-48", weeklyCases.selectMostWeeklyCases());
    }
}