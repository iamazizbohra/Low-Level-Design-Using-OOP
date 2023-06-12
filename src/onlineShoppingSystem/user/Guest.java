package onlineShoppingSystem.user;

public class Guest extends Customer {
    public Member registerAccount() {
        return new Member();
    }
}
