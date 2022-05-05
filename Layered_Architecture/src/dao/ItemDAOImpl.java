package dao;

import db.DBConnection;
import model.CustomerDTO;
import model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class ItemDAOImpl implements CrudDAO {
    @Override
    public ArrayList<CustomerDTO> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean save(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean update(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean exist(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public String generateNewID() throws SQLException, ClassNotFoundException {
        return null;
    }

    /*@Override
    public ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.executeQuery("SELECT * FROM Item");
        ArrayList<ItemDTO> allItems = new ArrayList<>();
        while (rst.next()) {
            allItems.add(new ItemDTO(rst.getString(1), rst.getString(2), rst.getBigDecimal(3), rst.getInt(4)));
        }
        return allItems;
    }

    @Override
    public boolean deleteItem(String code) throws SQLException, ClassNotFoundException {
        return SQLUtil.executeUpdate("DELETE FROM Item WHERE code=?",code);
    }

    @Override
    public boolean saveItem(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return SQLUtil.executeUpdate("INSERT INTO Item (code, description, unitPrice, qtyOnHand) VALUES (?,?,?,?)", dto.getCode(),dto.getDescription(),String.valueOf(dto.getUnitPrice()),String.valueOf(dto.getQtyOnHand()));
    }

    @Override
    public boolean updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return SQLUtil.executeUpdate("UPDATE Item SET description=?, unitPrice=?, qtyOnHand=? WHERE code=?", dto.getCode(),dto.getDescription(),String.valueOf(dto.getUnitPrice()),String.valueOf(dto.getQtyOnHand()));
    }

    @Override
    public boolean existItem(String code) throws SQLException, ClassNotFoundException {
        return SQLUtil.executeQuery("SELECT code FROM Item WHERE code=?",code).next();
    }

    @Override
    public String generateNewID() throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.executeQuery("SELECT code FROM Item ORDER BY code DESC LIMIT 1;");
        if (rst.next()) {
            String code = rst.getString("code");
            int newCustomerId = Integer.parseInt(code.replace("I00-", "")) + 1;
            return String.format("I00-%03d", newCustomerId);
        } else {
            return "I00-001";
        }
    }*/

}
