package dao;

import db.DBConnection;
import model.CustomerDTO;
import model.OrderDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderDAOImpl {

    public boolean existOrder(String id) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getDbConnection().getConnection();
        PreparedStatement pstm = connection.prepareStatement("SELECT oid FROM `Orders` WHERE oid=?");
        pstm.setString(1, id);
        return pstm.executeQuery().next();
    }

    public boolean saveOrder(OrderDTO dto) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getDbConnection().getConnection();
        PreparedStatement pstm = connection.prepareStatement("INSERT INTO `Orders` (oid, date, customerID) VALUES (?,?,?)");
        pstm.setString(1, dto.getOrderId());
        pstm.setString(2, String.valueOf(dto.getOrderDate()));
        pstm.setString(3, dto.getCustomerId());
        return pstm.executeUpdate() > 0;
    }
}
