package libraryManagementSystem.payment;

public class PayByCard implements PaymentGateway {
    @Override
    public void pay(int amount) {
        System.out.println("Payment done by credit/debit card");
    }
}
