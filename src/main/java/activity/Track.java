package activity;

import java.util.ArrayList;
import java.util.List;

public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    public Coordinate findMaximumCoordinate() {
        double maximumLatitude = -90;
        double maximumLongitude = -180;
        for (TrackPoint t : trackPoints) {
            if (t.getCoordinate().getLatitude() > maximumLatitude) {
                maximumLatitude = t.getCoordinate().getLatitude();
            }
            if (t.getCoordinate().getLongitude() > maximumLongitude) {
                maximumLongitude = t.getCoordinate().getLongitude();
            }
        }
        return new Coordinate(maximumLatitude, maximumLongitude);
    }

    public Coordinate findMinimumCoordinate() {
        double minimumLatitude = 90;
        double minimumLongitude = 180;
        for (TrackPoint t : trackPoints) {
            if (t.getCoordinate().getLatitude() < minimumLatitude) {
                minimumLatitude = t.getCoordinate().getLatitude();
            }
            if (t.getCoordinate().getLongitude() < minimumLongitude) {
                minimumLongitude = t.getCoordinate().getLongitude();
            }
        }
        return new Coordinate(minimumLatitude, minimumLongitude);
    }

    public double getDistance() {
        double fullDistacne = 0.0;

        for (int i = 1; i < trackPoints.size(); i++) {
            fullDistacne += trackPoints.get(i).getDistanceFrom(trackPoints.get(i - 1));
        }
        return fullDistacne;
    }

    public double getFullDecrease() {
        double fullDecrease = 0.0;
        for (int i = 1; i < trackPoints.size(); i++) {
            if (trackPoints.get(i).getElevation() < trackPoints.get(i - 1).getElevation()) {
                fullDecrease += (trackPoints.get(i).getElevation() + trackPoints.get(i - 1).getElevation());
            }
        }
        return fullDecrease;
    }

    public double getFullElevation() {
        double fullElevation = 0.0;
        for (int i = 1; i < trackPoints.size(); i++) {
            if (trackPoints.get(i).getElevation() > trackPoints.get(i - 1).getElevation()) {
                fullElevation += (trackPoints.get(i).getElevation() - trackPoints.get(i - 1).getElevation());
            }
        }
        return fullElevation;
    }

    public double getRectangleArea() {
        return (findMaximumCoordinate().getLatitude() - findMinimumCoordinate().getLatitude()) *
                (findMaximumCoordinate().getLongitude() - findMinimumCoordinate().getLongitude());
    }
}
