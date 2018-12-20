package lesson20Homework.Task01;

import java.util.Date;
import java.util.LinkedHashSet;

public class Banck {
    LinkedHashSet<Account> listClients;
    private String name;

    public Banck(String name) {
        this.name = name;
    }

    public void AddClient(Account account){
        listClients = new LinkedHashSet<>();
        listClients.add(account);
    }

    public synchronized  void transferMoney(Account src, Account dst, int count, Date data){
        if((listClients.contains(src) != false) &&(listClients.contains(dst) != false)){
            System.out.println("Ошибка! Один из клиентов не существует");
        }else if(count > src.getMoney()){
            System.out.println("Недостаточно денег для перевода");
        }else {
            src.setMoney(src.getMoney() - count);
            dst.setMoney(dst.getMoney() + count);
        }
        Transaction transaction = new Transaction(src,dst,name,count, data);
        System.out.println(transaction.toString());
    }
}
