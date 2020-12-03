package methodvarargs.examstats;

public class ExamStats {
    private double maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPrecent, int... results) {
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
        int count = 0;
        for (int i : results) {
            if (i > (1.0 * limitInPrecent / 100) * maxPoints) {
                count++;
            }
        }
        return count;
    }

    public boolean hasAnyFailed(int limitInPrecent, int... results) {
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
        for (int i : results) {
            if (i < (1.0 * limitInPrecent / 100) * maxPoints) {
                return true;
            }
        }
        return false;
    }
}
