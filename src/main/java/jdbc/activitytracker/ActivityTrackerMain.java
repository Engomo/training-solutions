package jdbc.activitytracker;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityTrackerMain {

    public static void main(String[] args) {
        MariaDbDataSource dataSource;

        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (SQLException throwables) {
            throw new IllegalStateException("Cannot connect", throwables);
        }

        Activity activity = new Activity(LocalDateTime.of(2021, 3, 15, 20, 0), "Biking Bugac", ActivityType.BIKING);
        Activity activity2 = new Activity(LocalDateTime.of(2021, 3, 15, 20, 0), "Hiking in Mecsek", ActivityType.HIKING);
        Activity activity3 = new Activity(LocalDateTime.of(2021, 3, 15, 20, 0), "Running in Bugac", ActivityType.RUNNING);

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();

        flyway.clean();
        flyway.migrate();

        ActivityDao ad = new ActivityDao(dataSource);
//       ad.insertActivity(activity);
//       ad.insertActivity(activity2);
//       ad.insertActivity(activity3);

        System.out.println(ad.selectById(1));
        System.out.println(ad.selectAllActivities());
        System.out.println(ad.selectActivitiesByType(ActivityType.HIKING));
    }
}
