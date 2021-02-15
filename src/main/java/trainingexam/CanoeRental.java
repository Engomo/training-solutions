package trainingexam;

import java.time.Duration;
import java.time.LocalDateTime;

public class CanoeRental {
    private String name;
    private CanoeType canoeType;
    LocalDateTime startTime;
    LocalDateTime endTime;

    public CanoeRental(String name, CanoeType canoeType, LocalDateTime startTime) {
        this.name = name;
        this.canoeType = canoeType;
        this.startTime = startTime;
    }

    public String getName() {
        return name;
    }

    public CanoeType getCanoeType() {
        return canoeType;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public double calculateRentalSum() {
        return Duration.between(startTime, endTime).toHours();
    }
}
