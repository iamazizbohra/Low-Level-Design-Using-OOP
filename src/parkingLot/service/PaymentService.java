package parkingLot.service;

import parkingLot.payment.PaymentGateway;

public class PaymentService {
    private PaymentGateway paymentGateway;

    public PaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void makePayment(double amount) {
        this.paymentGateway.pay(amount);
    }
}
