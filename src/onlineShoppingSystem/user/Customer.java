package onlineShoppingSystem.user;

import onlineShoppingSystem.CartItem;
import onlineShoppingSystem.ShoppingCart;

public abstract class Customer {
    private ShoppingCart cart;

    public ShoppingCart getCart() {
        return cart;
    }

    public boolean addItemToCart(CartItem item){
       return true;
    }
    public boolean removeItemFromCart(CartItem item) {
        return true;
    }

    public boolean modifyQuantityItemInCart(CartItem item) {
        return true;
    }
}
