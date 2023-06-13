package hotelManagementSystem.transaction;

import hotelManagementSystem.paymentMode.PayByCash;

public class CashTransaction extends Transaction {
    public CashTransaction() {
        super(new PayByCash());
    }
}
