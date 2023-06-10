package parkingLot.payment;

public class PayByCash implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Payment done by cash");
    }
}
