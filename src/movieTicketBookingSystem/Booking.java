package movieTicketBookingSystem;

import movieTicketBookingSystem.enumeration.BookingStatus;
import movieTicketBookingSystem.paymentMode.PaymentMode;

import java.util.Date;
import java.util.List;

public class Booking {
    private String bookingNumber;
    private int numberOfSeats;
    private Date createdAt;
    private BookingStatus status;
    private CinemaHall cinemaHall;
    private Show show;
    private List<ShowSeat> seats;
    private PaymentMode paymentMode;

    public void selectSeat(ShowSeat showSeat) {

    }

    public void makePayment(PaymentMode paymentMode) {

    }

    public void cancelBooking() {

    }
}
