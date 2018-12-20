package lesson20Homework.Task01;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Roman");
        User user2 = new User("Boba");
        User user3 = new User("lala");

        Account account = new Account(user1,5000);
        Account account1 = new Account(user2,200);
        Account account2 = new Account(user3,222);

        Banck banck = new Banck("Sberbanck");
        banck.AddClient(account);
        banck.AddClient(account1);
        banck.AddClient(account2);
        banck.transferMoney(account,account1,1000,new Date());
        System.out.println("--------------------------------------------------");
        banck.transferMoney(account1,account2,300,new Date());
        System.out.println("__----------------------------------------_");
        banck.transferMoney(account,account2,120,new Date());
    }
}
