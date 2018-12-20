package lesson20Homework.Task01;

import java.util.concurrent.atomic.AtomicInteger;

public class Account {
    private int money;
    private String userId;
    private final int id;
    private static AtomicInteger nextID = new AtomicInteger();

    public Account(User user, int money) {
        this.money = money;
        this.id = nextID.getAndIncrement();
        this.userId = user.getName();
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" + "user =" + userId + ", money=" + money + ", id=" + id + '}';

    }
}
