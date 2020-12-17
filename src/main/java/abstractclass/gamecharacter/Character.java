package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {

    Random random = new Random();
    private Point position;
    private int hitPoint = 100;

    public Character(Point position, Random random) {
        this.random = random;
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public boolean isAlive() {
        return hitPoint > 0;
    }

    protected int getActualPrimaryDamage() {
        return random.nextInt(10) + 1;
    }

    private int getActualDefence() {
        return random.nextInt(6);
    }

    protected void hit(Character enemy, int damage) {
    if (damage > enemy.getActualDefence()) {
        enemy.decreaseHitPoint(damage);
    }
    }

    private void decreaseHitPoint(int diff) {
        this.hitPoint -= diff;
    }

    public void primaryAttack(Character enemy) {
        hit(enemy, getActualPrimaryDamage());
    }

    abstract public void secondaryAttack(Character enemy);

}
