package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {

    private List<Activity> activities;

    public Activities(List<Activity> activities) {
        this.activities = new ArrayList<>(activities);
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public List<Report> distancesByTypes() {
        List<Report> reports = new ArrayList<>();
        ActivityType activityType;
        for (int i = 0; i < ActivityType.values().length; i++) {
            activityType = ActivityType.values()[i];
            double distance = 0;
            for (Activity a : activities) {
                if (a.getType().equals(ActivityType.values()[i])) {
                    distance += a.getDistance();
                }
            }
            reports.add(new Report(activityType, distance));
        }
        return reports;
    }

    public int numberOfTrackActivities() {
        int result = 0;
        for (Activity a : activities) {
            if (a instanceof ActivityWithTrack) {
                result++;
            }
        }
        return result;
    }

    public int numberOfWithoutTrackActivities() {
        return activities.size() - numberOfTrackActivities();
    }
}
