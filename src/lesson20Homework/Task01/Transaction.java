package lesson20Homework.Task01;

import java.util.Date;

public class Transaction {
    private Account scr;
    private Account dst;
    private String nameBanck;
    private int amount;
    private Date date;

    public Transaction(Account scr, Account dst, String nameBanck, int amount, Date date) {
        this.scr = scr;
        this.dst = dst;
        this.nameBanck = nameBanck;
        this.amount = amount;
        this.date =  new Date();
    }

    @Override
    public String toString() {
        return "Transaction{" + "scr=" + scr + ", dst=" + dst + ", nameBanck='" + nameBanck + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
