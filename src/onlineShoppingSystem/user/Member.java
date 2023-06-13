package onlineShoppingSystem.user;

import onlineShoppingSystem.Address;
import onlineShoppingSystem.Order;
import onlineShoppingSystem.ProductReview;
import onlineShoppingSystem.paymentMode.PayByBankAccount;
import onlineShoppingSystem.paymentMode.PayByCreditCard;

import java.util.List;

public class Member extends Customer {
    private Account account;
    private Address shippingAddress;
    private Address billingAddress;
    private List<PayByCreditCard> creditCards;
    private List<PayByBankAccount> bankAccounts;
    private List<Order> orders;

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void addCreditCard(PayByCreditCard creditCard) {
        this.creditCards.add(creditCard);
    }

    public void removeCreditCard(PayByCreditCard creditCard) {
        this.creditCards.remove(creditCard);
    }

    public void addBankAccount(PayByBankAccount bankAccount) {
        this.bankAccounts.add(bankAccount);
    }

    public void removeBankAccount(PayByBankAccount bankAccount) {
        this.bankAccounts.remove(bankAccount);
    }

    public Order placeOrder(Order order) {
        return new Order();
    }

    public boolean addProductReview(ProductReview review) {
        return true;
    }
}
