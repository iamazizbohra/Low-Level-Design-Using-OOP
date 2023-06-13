package restaurantManagementSystem.transaction;

import restaurantManagementSystem.paymentMode.PayByCreditCard;

public class CreditCardTransaction extends Transaction {
    public CreditCardTransaction() {
        super(new PayByCreditCard());
    }
}
