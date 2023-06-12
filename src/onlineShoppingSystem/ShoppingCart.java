package onlineShoppingSystem;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> items;

    public boolean addItem(CartItem item) {
        return true;
    }

    public boolean removeItem(CartItem item) {
        return true;
    }

    public boolean updateItemQuantity(CartItem item, int quantity) {
        return true;
    }

    public List<CartItem> getItems() {
        return new ArrayList<CartItem>();
    }

    public boolean checkout() {
        return true;
    }
}
