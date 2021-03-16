package jdbc.activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {

    private DataSource dataSource;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Activity insertActivity(Activity activity) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("insert into activities(start_time, activity_desc, activity_type) values (?,?,?)", Statement.RETURN_GENERATED_KEYS)) {
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getType().toString());
            stmt.executeUpdate();
            Activity result = getIdAfterExecuted(activity, stmt);
            insertActivityTrackPoints(activity.getTrackPoints(), result.getId());
            return getIdAfterExecuted(activity, stmt);

        } catch (SQLException throwables) {
            throw new IllegalStateException("cannot connect", throwables);
        }
    }

    private void insertActivityTrackPoints(List<TrackPoint> trackPoints, long activityId) {
        try (Connection conn = dataSource.getConnection()) {
            conn.setAutoCommit(false);

            try (PreparedStatement stmt = conn.prepareStatement("insert into track_points(act_time, lat, lon, activityId) values (?,?,?,?)")) {
                for (TrackPoint trackPoint : trackPoints) {
                    if (!isValidTrackPoint(trackPoint.getLat(), trackPoint.getLon())) {
                        throw new IllegalArgumentException("Invalid params!");
                    }
                    stmt.setDate(1, Date.valueOf(trackPoint.getTime()));
                    stmt.setDouble(2, trackPoint.getLat());
                    stmt.setDouble(3, trackPoint.getLon());
                    stmt.setLong(4, activityId);
                    stmt.executeUpdate();
                }
                conn.commit();
            }catch(IllegalArgumentException iae) {
                conn.rollback();
        }
    } catch(
    SQLException throwables)

    {
        throw new IllegalStateException("Cannot connect", throwables);
    }

}

    private boolean isValidTrackPoint(double lat, double lon) {
        if (lat > 90 || lat < -90) {
            return false;
        }
        if (lon > 180 || lon < -180) {
            return false;
        }
        return true;
    }

    private Activity getIdAfterExecuted(Activity activity, PreparedStatement stmt) throws SQLException {
        try (ResultSet rs = stmt.getGeneratedKeys()) {
            if (rs.next()) {
                long id = rs.getLong(1);
                return new Activity(id, activity.getStartTime(), activity.getDesc(), activity.getType());
            }
        }
        throw new IllegalStateException("Cannot get key");
    }

    public Activity selectById(long id) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities where id = (?)")) {
            stmt.setLong(1, id);
            List<Activity> result = selectByPreparedStatement(stmt);
            if (result.size() == 1) {
                return result.get(0);
            }
            throw new IllegalArgumentException("Wrong params");
        } catch (SQLException sqle) {
            throw new IllegalStateException("cannot connect", sqle);
        }
    }

    private List<Activity> selectByPreparedStatement(PreparedStatement stmt) {
        List<Activity> result = new ArrayList<>();
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Activity activity = new Activity(rs.getLong("id"), rs.getTimestamp("start_time").toLocalDateTime(), rs.getString("activity_desc"), ActivityType.valueOf(rs.getString("activity_type")));
                result.add(activity);
            }
            return result;
        } catch (SQLException throwables) {
            throw new IllegalArgumentException("Wrong statement", throwables);
        }

    }

    public List<Activity> selectAllActivities() {

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities")) {
            return selectByPreparedStatement(stmt);
        } catch (SQLException throwables) {
            throw new IllegalArgumentException("Connection failed", throwables);
        }
    }

    public List<Activity> selectActivitiesByType(ActivityType activityType) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities where activity_type = (?)")) {
            stmt.setString(1, activityType.toString());
            return selectByPreparedStatement(stmt);
        } catch (SQLException throwables) {
            throw new IllegalStateException("Connection failed", throwables);
        }
    }

    public List<Activity> activitiesBeforeDate(LocalDate date) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities where start_time < (?)")) {
            LocalDateTime actualDate = date.atTime(0, 0);
            stmt.setTimestamp(1, Timestamp.valueOf(actualDate));
            return selectByPreparedStatement(stmt);
        } catch (SQLException throwables) {
            throw new IllegalStateException("Cannot connect", throwables);
        }
    }

}
