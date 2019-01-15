package lesson8SQL.classHomework;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao implements DAO {
    User user;
    String sql = "CREATE TABLE IF NOT EXISTS User (" +
            "id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
            "login TEXT NOT NULL);";

    String getAll = "SELECT * FROM User;";
    String getById = "SELECT * FROM User WHERE id=?;";


    SQLConnection connection = new SQLConnection();

    public void creatUserTabl() throws SQLException {
    connection.createTable(sql);
    }

    @Override
    public void add(User user)  {
        String insert = "INSERT INTO User (id, login) VALUES (" + user.getId() + ",'" + user.getLogin() + "');";
        try {
            connection.updateTable(insert);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public User getByid(int id) {
        String getById = "SELECT * FROM User WHERE id="+ id + ";";
        User user1 = new User();
        try (PreparedStatement preparedStatement = connection.querTable(getById)){
            ResultSet resultSet = preparedStatement.executeQuery();
            user1.setId(resultSet.getInt("id"));
            user1.setLogin(resultSet.getString("login"));
        }catch (SQLException e){
            e.printStackTrace();
        }
        return user1;
    }
}
