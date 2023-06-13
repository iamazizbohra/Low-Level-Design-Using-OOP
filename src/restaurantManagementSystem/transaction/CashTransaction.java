package restaurantManagementSystem.transaction;

import restaurantManagementSystem.paymentMode.PayByCash;

public class CashTransaction extends Transaction {
    public CashTransaction() {
        super(new PayByCash());
    }
}
