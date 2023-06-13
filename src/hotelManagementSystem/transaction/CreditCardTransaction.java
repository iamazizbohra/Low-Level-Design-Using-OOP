package hotelManagementSystem.transaction;

import hotelManagementSystem.paymentMode.PayByCreditCard;

public class CreditCardTransaction extends Transaction {
    public CreditCardTransaction() {
        super(new PayByCreditCard());
    }
}
