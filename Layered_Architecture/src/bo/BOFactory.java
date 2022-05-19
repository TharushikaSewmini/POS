package bo;

import bo.custom.impl.CustomerBOImpl;
import bo.custom.impl.ItemBOImpl;
import bo.custom.impl.PurchaseOrderBOImpl;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory() {

    }

    // Singleton
    public static BOFactory getBoFactory() {
        if(boFactory == null) {
            boFactory = new BOFactory();
        }
        return boFactory;
    }

    // public final static integer values
    public enum BOTypes {
        CUSTOMER, ITEM, PURCHASE_ORDER
    }

    //method for hide the object creation logic and return what client wants
    public SuperBO getBO(BOFactory.BOTypes types) {
        switch(types) {
            case CUSTOMER:
                return new CustomerBOImpl(); //SuperBO bo=new CustomerBOImpl();

            case ITEM:
                return new ItemBOImpl(); //SuperBO bo=new ItemBOImpl();

            case PURCHASE_ORDER:
                return new PurchaseOrderBOImpl(); //SuperBO bo = new PurchaseOrderBOImpl();

            default:
                return null;
        }
    }
}
