package week13d02;

import java.time.LocalTime;

public class Fly {

    private String flyId;
    private Status status;
    private String city;
    private LocalTime time;

    public Fly(String flyId, Status status, String city, LocalTime time) {
        this.flyId = flyId;
        this.status = status;
        this.city = city;
        this.time = time;
    }

    public String getFlyId() {
        return flyId;
    }

    public Status getStatus() {
        return status;
    }

    public String getCity() {
        return city;
    }

    public LocalTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Fly{" +
                "flyId='" + flyId + '\'' +
                ", status=" + status +
                ", city='" + city + '\'' +
                ", time=" + time +
                '}';
    }
}
