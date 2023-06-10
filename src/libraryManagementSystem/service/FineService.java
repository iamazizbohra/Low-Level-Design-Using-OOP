package libraryManagementSystem.service;

import libraryManagementSystem.BookItem;
import libraryManagementSystem.Constants;
import libraryManagementSystem.payment.PaymentGateway;

import java.util.Random;

public class FineService {
    private PaymentService paymentService;

    public void setPaymentGateway(PaymentGateway paymentGateway) {
        this.paymentService = new PaymentService(paymentGateway);
    }

    public boolean isEligibleForFine(BookItem bookItem) {
        return this.calculateFine(bookItem) == 0 ? false : true;
    }

    public void collectFine(BookItem bookItem) {
        int noOfDays = this.calculateFine(bookItem);
        int amount = noOfDays * Constants.FINE_PER_DAY;

        this.paymentService.makePayment(amount);
    }

    private int calculateFine(BookItem bookItem) {
        return new Random().nextInt(10);
    }
}
