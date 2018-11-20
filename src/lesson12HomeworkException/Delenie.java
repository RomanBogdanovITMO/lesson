package lesson12HomeworkException;

public class Delenie extends Calculator {

    public Delenie(int value1, int value2) {
        super(value1, value2);
        this.work();
    }

    @Override
    public int work() {

        return getValue1()/getValue2();
    }
}
