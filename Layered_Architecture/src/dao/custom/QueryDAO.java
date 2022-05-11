package dao.custom;

import java.sql.SQLException;

public interface QueryDAO {
    void searchOrderByOrderId(String id) throws SQLException, ClassNotFoundException;
}
