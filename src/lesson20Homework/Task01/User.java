package lesson20Homework.Task01;

import java.util.concurrent.atomic.AtomicInteger;

public class User {
    private String name;
    private AtomicInteger nextID = new AtomicInteger();
    private int id;

    public User(String name) {
        this.name = name;
        this.id = nextID.getAndIncrement();
    }

    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
