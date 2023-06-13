package libraryManagementSystem.service;

import libraryManagementSystem.paymentMode.PaymentMode;

public class PaymentService {
    private PaymentMode paymentMode;

    public PaymentService(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public void makePayment(int amount) {
        this.paymentMode.pay(amount);
    }
}
