package libraryManagementSystem.paymentMode;

public class PayByCash implements PaymentMode {
    @Override
    public void pay(int amount) {
        System.out.println("Payment done by cash");
    }
}
