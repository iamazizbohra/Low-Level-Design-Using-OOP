package onlineShoppingSystem;

import onlineShoppingSystem.enumeration.OrderStatus;

import java.util.Date;

public class OrderLog {
    private String orderNumber;
    private Date date;
    private OrderStatus status;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
