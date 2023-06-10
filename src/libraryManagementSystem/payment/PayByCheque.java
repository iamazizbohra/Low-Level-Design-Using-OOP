package libraryManagementSystem.payment;

public class PayByCheque implements PaymentGateway {
    @Override
    public void pay(int amount) {
        System.out.println("Payment done by cheque");
    }
}
