package lesson20Homework.Task01;

import java.util.Date;

public class Transaction implements Runnable{
    private final Account scr;
    private final Account dst;
    private Banck banck;
    private Date date;
    private boolean transactioSucces;
    private final double amount;


    public Transaction(Account scr, Account dst, Banck banck, double amount) {
        this.scr = scr;
        this.dst = dst;
        this.banck = banck;
        this.transactioSucces = false;
        this.amount = amount;
        this.date =  new Date();
    }
    private boolean accTransfer(){
        if(scr.getMoney() < amount || scr.getMoney() <= 0 || (scr.getMoney() == dst.getMoney())
                || amount <= 0){
            return false;
        }
        scr.setMoney(scr.getMoney() - amount);
        dst.setMoney(dst.getMoney() + amount);
        return true;
    }
    @Override
    public void run() {
        boolean result;
        if (scr.getId() > dst.getId()){
            synchronized (scr) {
                synchronized (dst) {
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    result = accTransfer();
                    if (result) {
                        System.out.println("Transaction success");
                    } else {
                        System.out.println("Transaction failed");
                    }
                }
            }
        }else if (dst.getId() > scr.getId()){
            synchronized (dst) {
                synchronized (scr) {
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    result = accTransfer();
                    if (result) {
                        System.out.println("Transaction success");
                    } else {
                        System.out.println("Transaction failed");
                    }
                }
            }
        }
    }
}
