package lessonbattelunit;

public class Main {
    public static void main(String[] args) {
        BattleUnit battleUnit = new BattleUnit(100,34);
        Knight knight = new Knight(100,80);
        knight.attack(battleUnit);

    }
}
