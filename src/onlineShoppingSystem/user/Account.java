package onlineShoppingSystem.user;

import onlineShoppingSystem.Product;
import onlineShoppingSystem.enumeration.AccountStatus;

public class Account {
    private String userName;
    private String password;
    private AccountStatus status;
    private String name;
    private String email;
    private String phone;

    public boolean addProduct(Product product) {
        return true;
    }

    public boolean updateProduct(Product product) {
        return true;
    }

    public boolean deleteProduct(Product product) {
        return true;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean resetPassword() {
        return true;
    }
}
