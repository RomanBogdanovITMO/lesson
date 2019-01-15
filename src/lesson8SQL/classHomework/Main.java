package lesson8SQL.classHomework;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
      User user = new User(1,"boba");
      User user1 = new User(2,"lala");

      UserDao userDao = new UserDao();
      userDao.creatUserTabl();
      userDao.add(user);
      userDao.add(user1);

      User user3 = userDao.getByid(1);

        System.out.println(user3.toString());

    }
}
