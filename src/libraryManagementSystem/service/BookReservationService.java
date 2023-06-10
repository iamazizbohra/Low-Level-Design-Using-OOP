package libraryManagementSystem.service;

import libraryManagementSystem.*;
import libraryManagementSystem.enumeration.BookStatus;
import libraryManagementSystem.enumeration.ReservationStatus;
import libraryManagementSystem.notification.ReservationCanceledNotification;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookReservationService {
    private Map<BookItem, List<ReservationRequest>> reservationRequests;

    private NotificationService notificationService;

    public BookReservationService() {
        this.reservationRequests = new HashMap<BookItem, List<ReservationRequest>>();

        this.notificationService = new NotificationService();
    }

    public ReservationRequest isReserved(BookItem bookItem) {
        return null;
    }

    public ReservationRequest reserve(LibraryCard libraryCard, BookItem bookItem) {
        Member member = new BarcodeScanner().scan(libraryCard.getBarcode());

        ReservationRequest reservationRequest = this.isReserved(bookItem);
        if (bookItem.getStatus() != BookStatus.AVAILABLE || reservationRequest != null) {
            System.out.println("Book is not available at this moment");
            return null;
        }

        return new ReservationRequest(member, ReservationStatus.WAITING);
    }

    public void cancel(LibraryCard libraryCard, BookItem bookItem) {
        Member member = new BarcodeScanner().scan(libraryCard.getBarcode());

        ReservationRequest reservationRequest = this.isReserved(bookItem);
        if (reservationRequest != null) {
            reservationRequest.setStatus(ReservationStatus.CANCELED);

            this.notificationService.send(new ReservationCanceledNotification(member));
        }
    }
}
