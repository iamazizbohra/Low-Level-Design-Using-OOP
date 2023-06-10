package parkingLot.payment;

public class PayByCard implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Payment done by credit/debit card");
    }
}
