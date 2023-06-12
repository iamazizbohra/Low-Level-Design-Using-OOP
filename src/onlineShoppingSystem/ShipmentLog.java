package onlineShoppingSystem;

import onlineShoppingSystem.enumeration.ShipmentStatus;

import java.util.Date;

public class ShipmentLog {
    private String shipmentNumber;
    private Date date;
    private ShipmentStatus status;

    public String getShipmentNumber() {
        return shipmentNumber;
    }

    public void setShipmentNumber(String shipmentNumber) {
        this.shipmentNumber = shipmentNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ShipmentStatus getStatus() {
        return status;
    }

    public void setStatus(ShipmentStatus status) {
        this.status = status;
    }
}
