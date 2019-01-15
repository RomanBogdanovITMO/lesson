package lesson8SQL.classHomework;

import org.sqlite.JDBC;

import java.sql.*;

public class SQLConnection {

    public void createTable(String create) throws SQLException {
        DriverManager.registerDriver(new JDBC());
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:lesson8SQL.db")) {
            Statement statement = connection.createStatement();
            System.out.println(statement.executeUpdate(create));
        }
    }
    public void updateTable(String update) throws SQLException {
        DriverManager.registerDriver(new JDBC());

        try(Connection connection = DriverManager.getConnection("jdbc:sqlite:lesson8SQL.db")) {
            Statement statement = connection.createStatement();
            System.out.println(statement.executeUpdate(update));
        }
    }
    public PreparedStatement querTable(String querry) throws SQLException {
        DriverManager.registerDriver(new JDBC());

        try(Connection connection = DriverManager.getConnection("jdbc:sqlite:lesson8SQL.db")) {
            PreparedStatement statement = connection.prepareStatement(querry);
            return statement;
        }
    }
}
