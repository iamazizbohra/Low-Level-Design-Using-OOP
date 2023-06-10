package parkingLot.manager;

import parkingLot.ParkingLot;
import parkingLot.ParkingRate;
import parkingLot.ParkingTicket;
import parkingLot.Vehicle.Vehicle;
import parkingLot.enumeration.TicketStatus;
import parkingLot.parkingSpot.ParkingSpot;
import parkingLot.payment.PayByCard;
import parkingLot.service.PaymentService;

import java.util.Date;

public class TicketManager {
    private ParkingLot parkingLot;
    private ParkingRate parkingRate;
    private PaymentService paymentService;

    public TicketManager() {
        this.parkingLot = ParkingLot.getInstance();
        this.parkingRate = new ParkingRate();
        this.paymentService = new PaymentService(new PayByCard());
    }

    public void issueTicket(Vehicle vehicle) {
        if (this.parkingLot.isFull()) {
            System.out.println("Parking lot is full");
            return;
        }

        // generate ticket
        ParkingTicket parkingTicket = new ParkingTicket();
        parkingTicket.setIssuedAt(new Date());
        parkingTicket.setStatus(TicketStatus.UNPAID);
        parkingTicket.setVehicle(vehicle);

        // find free spot & assign vehicle to that spot
        ParkingSpot parkingSpot = this.parkingLot.getFreeSpot(vehicle.getType());
        parkingSpot.assignVehicle(vehicle);

        // add ticket & update spot count
        this.parkingLot.addTicket(parkingTicket);
        this.parkingLot.updateSpotCount();
    }

    public void processTicket(ParkingTicket parkingTicket) {
        if (parkingTicket.getStatus() == TicketStatus.PAID) {
            System.out.println("Ticket already paid");
            return;
        }

        // calculate & pay the amount
        double amount = parkingRate.calculateAmount(parkingTicket);
        this.paymentService.makePayment(amount);

        // mark ticket as paid
        parkingTicket.setPayedAt(new Date());
        parkingTicket.setStatus(TicketStatus.PAID);

        // find spot used by this vehicle & release it
        ParkingSpot parkingSpot = this.parkingLot.findParkedSpot(parkingTicket.getVehicle());
        parkingSpot.removeVehicle();

        // remove ticket & update spot count
        this.parkingLot.removeTicket(parkingTicket);
        this.parkingLot.updateSpotCount();
    }
}
