package onlineShoppingSystem.user;

import onlineShoppingSystem.Address;
import onlineShoppingSystem.Order;
import onlineShoppingSystem.ProductReview;
import onlineShoppingSystem.payment.BankAccount;
import onlineShoppingSystem.payment.CreditCard;

import java.util.List;

public class Member extends Customer {
    private Account account;
    private Address shippingAddress;
    private Address billingAddress;
    private List<CreditCard> creditCards;
    private List<BankAccount> bankAccounts;
    private List<Order> orders;

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void addCreditCard(CreditCard creditCard) {
        this.creditCards.add(creditCard);
    }

    public void removeCreditCard(CreditCard creditCard) {
        this.creditCards.remove(creditCard);
    }

    public void addBankAccount(BankAccount bankAccount) {
        this.bankAccounts.add(bankAccount);
    }

    public void removeBankAccount(BankAccount bankAccount) {
        this.bankAccounts.remove(bankAccount);
    }

    public Order placeOrder(Order order) {
        return new Order();
    }

    public boolean addProductReview(ProductReview review) {
        return true;
    }
}
