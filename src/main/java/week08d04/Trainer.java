package week08d04;

public class Trainer {

    private CanMark canMark;

    public Trainer(CanMark canMark) {
        this.canMark = canMark;
    }

    public int giveMark() {
        return canMark.giveMark();
    }

    public static void main(String[] args) {
        System.out.println(new Trainer(new GoodMood()).giveMark());
        System.out.println(new Trainer(new BadMood()).giveMark());
    }
}
