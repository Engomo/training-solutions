package jdbc.activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ActivityDaoTest {

    ActivityDao activityDao;

    @BeforeEach
    public void init() {
        MariaDbDataSource dataSource;

        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (SQLException throwables) {
            throw new IllegalStateException("Cannot connect", throwables);
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();

        flyway.clean();
        flyway.migrate();

        activityDao = new ActivityDao(dataSource);
    }

    @Test
    public void insertElementTest() {
        Activity activity3 = new Activity(LocalDateTime.of(2021, 3, 15, 20, 0), "Running in Bugac", ActivityType.RUNNING);
        activityDao.insertActivity(activity3);

        assertEquals(4, activityDao.selectAllActivities().size());
    }

    @Test
    public void selectByTypeTest() {

        assertEquals(1, activityDao.selectActivitiesByType(ActivityType.RUNNING).size());
    }

    @Test
    public void befroeDateTest() {
        assertEquals(2, activityDao.activitiesBeforeDate(LocalDate.of(2021,4,1)).size());
    }

    @Test
    public void insterActivityWhitTrackPointsTest() {
        Activity activity = new Activity(LocalDateTime.of(2021, 3, 15, 20, 0), "Running in Bugac", ActivityType.RUNNING);
        activity.addTrackPoints(List.of(
                new TrackPoint(LocalDate.of(2021,3,15), 45,36),
                new TrackPoint(LocalDate.of(2021,3,15), 47,35),
                new TrackPoint(LocalDate.of(2021,3,15), 46,33)));

        activityDao.insertActivity(activity);
    }
}