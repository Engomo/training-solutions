package statements;

public class Time {
    private int Seconds;
    private  int Minutes;
    private int Hours;

    public Time (int Hours, int Minutes, int Seconds){
        this.Hours = Hours;
        this.Minutes = Minutes;
        this.Seconds = Seconds;
    }

    public int getInMinutes(){
        return ((Hours * 60) + Minutes);
    }
    public int getInSeconds(){
        return ((Hours * 3600) + (Minutes * 60) + Seconds);
    }
    public boolean earlierThan(Time other){
        int thisTimeInSeconds = this.getInSeconds();
        int otherTimeInSeconds = other.getInSeconds();
        return thisTimeInSeconds < otherTimeInSeconds;
    }
    public String toString(){
        return Hours + ":" + Minutes + ":" + Seconds;
    }
}
