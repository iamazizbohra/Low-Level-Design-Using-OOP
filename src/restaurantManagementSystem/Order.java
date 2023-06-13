package restaurantManagementSystem;

import restaurantManagementSystem.enumeration.OrderStatus;
import restaurantManagementSystem.user.Chef;
import restaurantManagementSystem.user.Waiter;

import java.util.Date;

public class Order {
    private int OrderID;
    private OrderStatus status;
    private Date createdAt;
    private Meal[] meals;
    private Table table;
    private Waiter waiter;
    private Chef chef;

    public void addMeal(Meal meal) {
    }

    public void removeMeal(Meal meal) {
    }

    public OrderStatus getStatus() {
        return OrderStatus.PREPARING;
    }

    public void setStatus(OrderStatus status) {

    }
}
