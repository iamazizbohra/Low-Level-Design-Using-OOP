package libraryManagementSystem.paymentMode;

public class PaybyCreditCard implements PaymentMode {
    @Override
    public void pay(int amount) {
        System.out.println("Payment done by credit/debit card");
    }
}
