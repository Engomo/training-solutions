package abstractclass.gamecharacter;

public class Point {

    private long x;
    private long y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public long distance(Point point) {
        return (long) Math.sqrt( Math.pow((double) x - point.getX() , 2)  +
                     Math.pow((double) y - point.getY(), 2)
        );
    }
}
