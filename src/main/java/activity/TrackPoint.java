package activity;

public class TrackPoint{

    private Coordinate coordinate;

    private double elevation;

    public TrackPoint(Coordinate coordinate, double elevation) {
        this.coordinate = coordinate;
        this.elevation = elevation;
    }

    public double getElevation() {
        return elevation;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public double getDistanceFrom(TrackPoint otherTrackPoint) {
        final int R = 6371;

        double latitudeDistance = Math.toRadians(coordinate.getLatitude() - otherTrackPoint.coordinate.getLatitude());
        double longtitudeDistance = Math.toRadians(coordinate.getLongitude() - otherTrackPoint.coordinate.getLongitude());

        double a = Math.sin(latitudeDistance / 2) * Math.sin(latitudeDistance / 2) +
                 Math.cos(Math.toRadians(otherTrackPoint.coordinate.getLatitude())) * Math.cos(Math.toRadians(coordinate.getLatitude())) *
                 Math.sin(longtitudeDistance / 2) * Math.sin(longtitudeDistance / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        double distance = R * c * 1000;

        double height = otherTrackPoint.getElevation() - getElevation();

        distance = Math.pow(distance, 2) + Math.pow(height, 2);

        return Math.sqrt(distance);


    }
}
