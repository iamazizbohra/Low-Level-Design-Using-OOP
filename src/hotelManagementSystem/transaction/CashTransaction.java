package hotelManagementSystem.transaction;

import hotelManagementSystem.paymentMode.CashPaymentMode;

public class CashTransaction extends Transaction {
    public CashTransaction() {
        super(new CashPaymentMode());
    }
}
