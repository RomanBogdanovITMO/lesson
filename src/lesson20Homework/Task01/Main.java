package lesson20Homework.Task01;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Banck banck = new Banck();

        User user1 = new User("Boba");
        User user2 = new User("Alexs");

        banck.createAccount(new Account(user1.getId()));
        banck.createAccount(new Account(user1.getId()));
        banck.createAccount(new Account(user1.getId()));
        banck.createAccount(new Account(user2.getId()));
        banck.createAccount(new Account(user2.getId()));
        banck.createAccount(new Account(user2.getId()));

        banck.getAccountId(2).setMoney(100_000);
        banck.getAccountId(1).setMoney(1000);
        banck.getAccountId(3).setMoney(11000);

        System.out.println(banck.getAccountId(2).toString());
        System.out.println(banck.getAccountId(1).toString());
        System.out.println(banck.getAccountId(3).toString());

        banck.transferMoney(banck.getAccountId(3),banck.getAccountId(2),500);
        banck.transferMoney(banck.getAccountId(3),banck.getAccountId(1),100);

        for (Thread thread: banck.getThreads()){
            try {
                thread.join();
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println(banck.getAccountId(2).toString());
        System.out.println(banck.getAccountId(1).toString());
        System.out.println(banck.getAccountId(2).toString());
    }
}
