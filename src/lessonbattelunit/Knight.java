package lessonbattelunit;

public class Knight extends BattleUnit {

    public Knight(int health, int attackScore) {
        super(health, attackScore);
    }

    private void addHealth() {
        if (this.health > 1) {
            this.health += 5;
        }
    }

    @Override
    public void attack(BattleUnit enemy) {
        enemy.health -= this.attackScore;
        addHealth();
        System.out.println("Knight attack");
    }
}