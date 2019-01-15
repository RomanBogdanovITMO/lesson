package lesson8SQL.classHomework;

import java.sql.SQLException;

public interface DAO {
    void add(User user) throws SQLException;
    Object getByid(int id) throws SQLException;

}
