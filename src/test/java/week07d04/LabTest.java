package week07d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class LabTest {


    @Test
    public void labTest(){
        Lab lab = new Lab("Task");
        assertEquals("Task", lab.getTitle());
        assertFalse(lab.isCompleted());
    }

    @Test
    public void createWithTitleAndDate(){
        Lab lab = new Lab("Task", LocalDateTime.of(2020, 12, 30, 15, 40));

        assertEquals("Task", lab.getTitle());
        assertEquals(LocalDateTime.of(2020,12,30,15,40), lab.getCompletedAt());
        assertTrue(lab.isCompleted());
    }

    @Test
    public void completedNow() {
        Lab lab = new Lab("Task", LocalDateTime.now());

        assertEquals("Task", lab.getTitle());
        assertTrue(LocalDateTime.now().plusSeconds(1).isAfter(lab.getCompletedAt()));
        assertTrue(LocalDateTime.now().minusSeconds(1).isBefore(lab.getCompletedAt()));
        assertTrue(lab.isCompleted());
    }
}

