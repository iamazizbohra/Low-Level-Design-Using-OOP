package onlineStockBrokerageSystem;

import onlineStockBrokerageSystem.enumeration.OrderStatus;
import onlineStockBrokerageSystem.enumeration.TimeEnforcementType;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public abstract class Order {
    private String orderNumber;
    public boolean isBuyOrder;
    private OrderStatus status;
    private TimeEnforcementType timeEnforcement;
    private Date createdAt;
    private HashMap<Integer, OrderPart> parts;

    public void setStatus(OrderStatus status){
        this.status = status;
    }

    public void saveInDB() {
        // save in the database
    }

    public void addOrderParts(List<OrderPart> parts) {
        for (OrderPart part : parts) {
            this.parts.put(part.id, part);
        }
    }

    public void updateInDB() {
    }

    public int getId() {
        return 0;
    }
}
