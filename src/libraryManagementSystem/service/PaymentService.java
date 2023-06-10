package libraryManagementSystem.service;

import libraryManagementSystem.payment.PaymentGateway;

public class PaymentService {
    private PaymentGateway paymentGateway;

    public PaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void makePayment(int amount) {
        this.paymentGateway.pay(amount);
    }
}
