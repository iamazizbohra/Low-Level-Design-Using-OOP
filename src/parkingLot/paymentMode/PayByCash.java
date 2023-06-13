package parkingLot.paymentMode;

public class PayByCash implements Paymentmode {
    @Override
    public void pay(double amount) {
        System.out.println("Payment done by cash");
    }
}
