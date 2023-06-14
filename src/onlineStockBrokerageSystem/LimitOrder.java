package onlineStockBrokerageSystem;

import onlineStockBrokerageSystem.enumeration.TimeEnforcementType;

public class LimitOrder extends Order {
    private double priceLimit;

    public LimitOrder(String stockId, float quantity, int limitPrice, TimeEnforcementType enforcementType) {
        super();
    }
}
