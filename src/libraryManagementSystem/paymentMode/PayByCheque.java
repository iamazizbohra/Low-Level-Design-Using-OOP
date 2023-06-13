package libraryManagementSystem.paymentMode;

public class PayByCheque implements PaymentMode {
    @Override
    public void pay(int amount) {
        System.out.println("Payment done by cheque");
    }
}
