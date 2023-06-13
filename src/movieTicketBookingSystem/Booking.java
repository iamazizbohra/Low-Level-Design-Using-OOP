package movieTicketBookingSystem;

import movieTicketBookingSystem.enumeration.BookingStatus;
import movieTicketBookingSystem.payment.PaymentGateway;

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
    private PaymentGateway paymentGateway;

    public void selectSeat(ShowSeat showSeat){

    }
    public void makePayment(PaymentGateway paymentGateway){

    }
    public void cancelBooking(){

    }
}
