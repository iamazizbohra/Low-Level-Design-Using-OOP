package hotelManagementSystem.transaction;

import hotelManagementSystem.paymentMode.CreditCardPaymentMode;

public class CreditCardTransaction extends Transaction {
    public CreditCardTransaction() {
        super(new CreditCardPaymentMode());
    }
}
