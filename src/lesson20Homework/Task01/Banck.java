package lesson20Homework.Task01;

import java.util.ArrayList;
import java.util.List;

public class Banck {
    private List<Thread> threads = new ArrayList<>();
    private List<Account> userAccounts = new ArrayList<>();

    public void transferMoney(Account scr, Account dst, double amount){
        Transaction transaction = new Transaction(scr,dst,this,amount);
        Thread thread = new Thread(transaction);
        thread.start();
        threads.add(thread);
    }
    public List<Thread> getThreads(){
        return threads;
    }
    public void createAccount(Account account){
        userAccounts.add(account);
    }
    public List<Account> getUserAccount(int userId) {
        List<Account> list = new ArrayList<>();

        for(Account account : this.userAccounts) {
            if(account.getUserId() == userId)
                list.add(account);
        }
        return list;
    }

    public Account getAccountId(int accounId) {
        for (Account account: this.userAccounts) {
            if(account.getId() == accounId)
                return account;
        }
        return null;
    }
}
