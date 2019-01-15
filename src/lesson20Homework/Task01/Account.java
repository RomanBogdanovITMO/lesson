package lesson20Homework.Task01;

public class Account {
    private double money;
    private int userId;
    private int id;
    private  static int nextID = 0;

    public Account(int userId) {
        this.money = 0;
        this.id = ++ nextID;
        this.userId = userId;
    }

    public double getMoney() {
        return money;
    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "money=" + money +
                ", userId=" + userId +
                ", id=" + id +
                '}';
    }
}
