package onlineShoppingSystem;

import java.util.Date;
import java.util.List;

public class Shipment {
    private int orderId;
    private String shipmentNumber;
    private Date shipmentDate;
    private Date estimatedArrival;
    private String shipmentMethod;
    private List<ShipmentLog> shipmentLogs;

    public boolean addShipmentLog(ShipmentLog shipmentLog) {
        return true;
    }
}
