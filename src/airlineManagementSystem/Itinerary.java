package airlineManagementSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Itinerary {
    private String customerId;
    private Airport startingAirport;
    private Airport finalAirport;
    private Date createdAt;
    private List<FlightReservation> reservations;

    public List<FlightReservation> getReservations() {
        return new ArrayList<FlightReservation>();
    }

    public boolean makeReservation() {
        return true;
    }

    public boolean makePayment() {
        return true;
    }
}
