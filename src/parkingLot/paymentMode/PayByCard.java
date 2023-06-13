package parkingLot.paymentMode;

public class PayByCard implements Paymentmode {
    @Override
    public void pay(double amount) {
        System.out.println("Payment done by credit/debit card");
    }
}
