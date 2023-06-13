package parkingLot.service;

import parkingLot.paymentMode.Paymentmode;

public class PaymentService {
    private Paymentmode paymentmode;

    public PaymentService(Paymentmode paymentGateway) {
        this.paymentmode = paymentGateway;
    }

    public void makePayment(double amount) {
        this.paymentmode.pay(amount);
    }
}
