package parkingLot;

import parkingLot.Vehicle.Vehicle;
import parkingLot.enumeration.TicketStatus;

import java.util.Date;

public class ParkingTicket {
    private int no;
    private Date issuedAt;
    private TicketStatus status;
    private Date payedAt;
    private Double price;
    private Vehicle vehicle;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Date getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(Date issuedAt) {
        this.issuedAt = issuedAt;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public Date getPayedAt() {
        return payedAt;
    }

    public void setPayedAt(Date payedAt) {
        this.payedAt = payedAt;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
