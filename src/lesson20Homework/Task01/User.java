package lesson20Homework.Task01;


public class User {
    private String name;
    private static int nextID =0;
    private int id;

    public User(String name) {
        this.name = name;
        this.id = ++ nextID;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
