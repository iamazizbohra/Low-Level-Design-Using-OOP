package parkingLot;

import parkingLot.manager.TicketManager;

public class CustomerInfoPortal {
    private TicketManager ticketManager;

    public CustomerInfoPortal() {
        this.ticketManager = new TicketManager();
    }

    public void processTicket(ParkingTicket parkingTicket) {
        this.ticketManager.processTicket(parkingTicket);
    }
}
