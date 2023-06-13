package restaurantManagementSystem.transaction;

import restaurantManagementSystem.paymentMode.PayByCheque;

public class ChequeTransaction extends Transaction {
    public ChequeTransaction() {
        super(new PayByCheque());
    }
}
