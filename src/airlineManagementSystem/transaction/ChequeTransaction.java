package airlineManagementSystem.transaction;

import airlineManagementSystem.paymentMode.PayByCheque;

public class ChequeTransaction extends Transaction {
    public ChequeTransaction() {
        super(new PayByCheque());
    }
}
