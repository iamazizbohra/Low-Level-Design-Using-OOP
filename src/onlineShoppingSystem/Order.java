package onlineShoppingSystem;

import onlineShoppingSystem.enumeration.OrderStatus;
import onlineShoppingSystem.paymentMode.PaymentMode;

import java.util.Date;
import java.util.List;

public class Order {
    private int memberId;
    private String orderNumber;
    private OrderStatus status;
    private Date orderDate;
    private BillingAddress billingAddress;
    private ShippingAddress shippingAddress;
    private Shipment shipment;
    private List<OrderLog> orderLog;

    public boolean sendForShipment() {
        return true;
    }

    public boolean cancelOrder() {
        return true;
    }

    public boolean makePayment(PaymentMode paymentMode) {
        return true;
    }

    public boolean addOrderLog(OrderLog orderLog) {
        return true;
    }
}
