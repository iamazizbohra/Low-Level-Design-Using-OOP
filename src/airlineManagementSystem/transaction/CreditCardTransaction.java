package airlineManagementSystem.transaction;

import airlineManagementSystem.paymentMode.PayByCreditCard;

public class CreditCardTransaction extends Transaction {
    public CreditCardTransaction() {
        super(new PayByCreditCard());
    }
}
