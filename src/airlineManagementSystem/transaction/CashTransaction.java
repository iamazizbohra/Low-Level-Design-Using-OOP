package airlineManagementSystem.transaction;

import airlineManagementSystem.paymentMode.PayByCash;

public class CashTransaction extends Transaction {
    public CashTransaction() {
        super(new PayByCash());
    }
}
