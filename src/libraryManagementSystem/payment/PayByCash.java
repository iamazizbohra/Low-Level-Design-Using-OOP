package libraryManagementSystem.payment;

public class PayByCash implements PaymentGateway {
    @Override
    public void pay(int amount) {
        System.out.println("Payment done by cash");
    }
}
