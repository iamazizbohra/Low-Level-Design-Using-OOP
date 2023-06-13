package hotelManagementSystem.transaction;

import hotelManagementSystem.paymentMode.PayByCheque;

public class ChequeTransaction extends Transaction {
    public ChequeTransaction() {
        super(new PayByCheque());
    }
}
