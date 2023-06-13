package restaurantManagementSystem;

import restaurantManagementSystem.enumeration.ReservationStatus;
import restaurantManagementSystem.notification.Notification;
import restaurantManagementSystem.user.Customer;

import java.util.Date;
import java.util.List;

public class Reservation {
    private int reservationID;
    private Date timeOfReservation;
    private int peopleCount;
    private ReservationStatus status;
    private String notes;
    private Date checkinTime;
    private Customer customer;

    private Table[] tables;
    private List<Notification> notifications;

    public void updatePeopleCount(int count) {
    }
}
