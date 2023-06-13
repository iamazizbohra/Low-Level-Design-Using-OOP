package restaurantManagementSystem.transaction;

import restaurantManagementSystem.paymentMode.PaymentMode;

import java.util.Date;

public abstract class Transaction {
    private double amount;
    private Date createdAt;
    private PaymentMode paymentMode;

    public Transaction(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public void initiateTransaction() {

    }
}
