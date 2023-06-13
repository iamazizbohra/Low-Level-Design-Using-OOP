package hotelManagementSystem.transaction;

import hotelManagementSystem.paymentMode.ChequePaymentMode;

public class ChequeTransaction extends Transaction {
    public ChequeTransaction() {
        super(new ChequePaymentMode());
    }
}
