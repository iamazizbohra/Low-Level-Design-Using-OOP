package parkingLot.user;

import parkingLot.ParkingTicket;
import parkingLot.Vehicle.Vehicle;
import parkingLot.enumeration.AccountRole;
import parkingLot.manager.TicketManager;

public class ParkingAttendant extends Account {
    private TicketManager ticketManager;

    public ParkingAttendant() {
        super(AccountRole.PARKING_ATTENDANT);

        this.ticketManager = new TicketManager();
    }

    public void issueTicket(Vehicle vehicle) {
        this.ticketManager.issueTicket(vehicle);
    }

    public void processTicket(ParkingTicket parkingTicket) {
        this.ticketManager.processTicket(parkingTicket);
    }
}
