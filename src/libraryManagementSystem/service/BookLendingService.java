package libraryManagementSystem.service;

import libraryManagementSystem.*;
import libraryManagementSystem.enumeration.AccountStatus;
import libraryManagementSystem.enumeration.BookStatus;
import libraryManagementSystem.enumeration.ReservationStatus;
import libraryManagementSystem.notification.BookAvailableNotification;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BookLendingService {
    private Map<BookItem, Member> issuedBookItems;
    private BookReservationService bookReservationService;
    private FineService fineService;
    private NotificationService notificationService;

    public BookLendingService() {
        this.issuedBookItems = new HashMap<BookItem, Member>();

        this.bookReservationService = new BookReservationService();
        this.fineService = new FineService();
        this.notificationService = new NotificationService();
    }

    public void issueBookItem(LibraryCard libraryCard, BookItem bookItem) {
        Member member = new BarcodeScanner().scan(libraryCard.getBarcode());

        if (member.getStatus() == AccountStatus.INACTIVE || member.getStatus() == AccountStatus.BLACKLIST) {
            System.out.println("Your account is either inactive or block");
            return;
        }

        if (member.getTotalBooksCheckout() >= Constants.MAX_BOOKS_ISSUED_TO_A_USER) {
            System.out.println("The user has already checked-out maximum number of books");
            return;
        }

        if (this.bookReservationService.isReserved(bookItem) != null || bookItem.getStatus() != BookStatus.AVAILABLE) {
            System.out.println("Either book is issued or reserved by someone");
            return;
        }

        bookItem.setBorrowDate(new Date());
        bookItem.setDueDate(new Date());
        bookItem.setStatus(BookStatus.LOANED);
        issuedBookItems.put(bookItem, member);
        member.setTotalBooksCheckout(member.getTotalBooksCheckout() + 1);
    }

    public void renewBookItem(LibraryCard libraryCard, BookItem bookItem) {
        Member member = new BarcodeScanner().scan(libraryCard.getBarcode());

        if (member.getStatus() == AccountStatus.INACTIVE || member.getStatus() == AccountStatus.BLACKLIST) {
            System.out.println("Your account is either inactive or block");
            return;
        }

        if (this.fineService.isEligibleForFine(bookItem)) {
            this.fineService.collectFine(bookItem);
        }

        if (bookItem.getStatus() != BookStatus.AVAILABLE) {
            System.out.println("Book is not available at this moment");
            return;
        }

        if (member.getTotalBooksCheckout() >= Constants.MAX_BOOKS_ISSUED_TO_A_USER) {
            System.out.println("The user has already checked-out maximum number of books");
            return;
        }

        ReservationRequest reservationRequest = this.bookReservationService.isReserved(bookItem);
        if (reservationRequest != null) {
            reservationRequest.setStatus(ReservationStatus.AVAILABLE);
            bookItem.setStatus(BookStatus.RESERVED);

            this.notificationService.send(new BookAvailableNotification(member));

            member.setTotalBooksCheckout(member.getTotalBooksCheckout() - 1);

            System.out.println("Book is already reserved by someone");
            return;
        }

        bookItem.setBorrowDate(new Date());
        bookItem.setDueDate(new Date());
        bookItem.setStatus(BookStatus.LOANED);
        issuedBookItems.put(bookItem, member);
    }

    public void returnBookItem(LibraryCard libraryCard, BookItem bookItem) {
        Member member = new BarcodeScanner().scan(libraryCard.getBarcode());

        if (member.getStatus() == AccountStatus.INACTIVE || member.getStatus() == AccountStatus.BLACKLIST) {
            System.out.println("Your account is either inactive or block");
            return;
        }

        if (this.fineService.isEligibleForFine(bookItem)) {
            this.fineService.collectFine(bookItem);
        }

        member.setTotalBooksCheckout(member.getTotalBooksCheckout() - 1);

        ReservationRequest reservationRequest = this.bookReservationService.isReserved(bookItem);
        if (reservationRequest != null) {
            reservationRequest.setStatus(ReservationStatus.AVAILABLE);
            bookItem.setStatus(BookStatus.RESERVED);

            this.notificationService.send(new BookAvailableNotification(member));

            System.out.println("Book is now available");
            return;
        }

        bookItem.setStatus(BookStatus.AVAILABLE);
    }
}
