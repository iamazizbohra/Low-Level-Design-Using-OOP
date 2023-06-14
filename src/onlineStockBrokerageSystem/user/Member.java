package onlineStockBrokerageSystem.user;

import onlineStockBrokerageSystem.*;
import onlineStockBrokerageSystem.enumeration.ErrorCode;
import onlineStockBrokerageSystem.enumeration.OrderStatus;
import onlineStockBrokerageSystem.enumeration.TimeEnforcementType;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Member extends Account {
    private double availableFundsForTrading;
    private Date dateOfMembership;

    private HashMap<String, StockPosition> stockPositions;

    private HashMap<Integer, Order> activeOrders;

    public ErrorCode placeSellLimitOrder(
            String stockId,
            float quantity,
            int limitPrice,
            TimeEnforcementType enforcementType) {
        // check if member has this stock position
        if (!stockPositions.containsKey(stockId)) {
            return ErrorCode.NO_STOCK_POSITION;
        }

        StockPosition stockPosition = new StockPosition();
        // check if the member has enough quantity available to sell
        if (stockPosition.getQuantity() < quantity) {
            return ErrorCode.INSUFFICIENT_QUANTITY;
        }

        LimitOrder order =
                new LimitOrder(stockId, quantity, limitPrice, enforcementType);
        order.isBuyOrder = false;
        order.saveInDB();
        boolean success = StockExchange.placeOrder(order);
        if (!success) {
            order.setStatus(OrderStatus.FILLED);
            order.saveInDB();
        } else {
            activeOrders.put(order.getId(), order);
        }

        return ErrorCode.NONE;
    }

    public ErrorCode placeBuyLimitOrder(
            String stockId,
            float quantity,
            int limitPrice,
            TimeEnforcementType enforcementType) {
        // check if the member has enough funds to buy this stock
        if (availableFundsForTrading < quantity * limitPrice) {
            return ErrorCode.INSUFFICIENT_FUNDS;
        }

        LimitOrder order = new LimitOrder(stockId, quantity, limitPrice, enforcementType);
        order.isBuyOrder = true;
        order.saveInDB();

        boolean success = StockExchange.placeOrder(order);
        if (!success) {
            order.setStatus(OrderStatus.FILLED);
            order.saveInDB();
        } else {
            activeOrders.put(order.getId(), order);
        }

        return ErrorCode.NONE;
    }

    // this function will be invoked whenever there is an update from
    // stock exchange against an order
    public void callbackStockExchange(int orderId, List<OrderPart> orderParts, OrderStatus status) {
        Order order = activeOrders.get(orderId);
        order.addOrderParts(orderParts);
        order.setStatus(status);
        order.updateInDB();

        if (status == OrderStatus.FILLED || status == OrderStatus.CANCELLED) {
            activeOrders.remove(orderId);
        }
    }
}
