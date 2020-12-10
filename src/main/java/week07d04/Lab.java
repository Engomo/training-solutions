package week07d04;

import java.time.LocalDateTime;

public class Lab {

    private String title;
    private boolean completed;
    private LocalDateTime completedAt;

    public Lab(String title) {
        this.title = title;
        this.completed = false;
    }

    public Lab(String title, LocalDateTime completedAt) {
        this.title = title;
        this.completedAt = completedAt;
        this.completed = true;
    }

    public void complete(LocalDateTime time) {
        completed = true;
        completedAt = time;
    }

    public void complete() {
        completed = true;
        completedAt = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "A " + title + " elvégezted " + completedAt + " kor.";
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public LocalDateTime getCompletedAt() {
        return completedAt;
    }
}
