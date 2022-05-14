package dao;

import dao.custom.CustomerDAO;
import dao.custom.impl.CustomerDAOImpl;

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

    public CustomerDAO getDAO(DAOTypes types) {
        switch(types) {
            case CUSTOMER:
                return new CustomerDAOImpl();

            case ITEM:
                return;

            case ORDER:
                return;

            case QUERYDAO:
                return;

            case ORDERDETAILS:
                return;

            default:
                return;
        }
    }
}
