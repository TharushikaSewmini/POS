package dao;

import dao.custom.CustomerDAO;
import dao.custom.impl.*;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory() {

    }

    // Singleton
    public static DAOFactory getDaoFactory() {
        if(daoFactory == null) {
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    // public final static integer values
    public enum DAOTypes {
        CUSTOMER, ITEM, ORDER, ORDERDETAILS, QUERYDAO
    }

    //method for hide the object creation logic and return what client wants
    public SuperDAO getDAO(DAOTypes types) {
        switch(types) {
            case CUSTOMER:
                return new CustomerDAOImpl();

            case ITEM:
                return new ItemDAOImpl();

            case ORDER:
                return new OrderDAOImpl();

            case ORDERDETAILS:
                return new OrderDetailsDAOImpl();

            case QUERYDAO:
                return new QueryDAOImpl();

            default:
                return null;
        }
    }
}
