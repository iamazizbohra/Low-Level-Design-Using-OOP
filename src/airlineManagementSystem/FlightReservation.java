package airlineManagementSystem;

import airlineManagementSystem.enumeration.ReservationStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class FlightReservation {
    private String reservationNumber;
    private FlightInstance flight;
    private Map<Passenger, FlightSeat> seatMap;
    private Date createdAt;
    private ReservationStatus status;

    public static FlightReservation fetchReservationDetails(String pnr) {
        return new FlightReservation();
    }

    public List<Passenger> getPassengers() {
        return new ArrayList<Passenger>();
    }
}
