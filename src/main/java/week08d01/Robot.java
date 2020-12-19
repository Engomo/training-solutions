package week08d01;

public class Robot {

    private int x = 0;
    private int y = 0;

    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + "," + y;
    }

    public Robot move(String str) {
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'L': {
                    y--;
                    break;
                }
                case 'F': {
                    y++;
                    break;
                }
                case 'B': {
                    x--;
                    break;
                }
                case 'J': {
                    x++;
                    break;
                }
                default:throw new IllegalArgumentException("Unknown parameter!");
            }
        }
        return new Robot(x,y);
    }
}
