package parkingLot.user;

import parkingLot.dataType.Person;
import parkingLot.enumeration.AccountRole;
import parkingLot.enumeration.AccountStatus;

public abstract class Account {
    private Person person;
    private String username;
    private String password;
    private AccountRole role;
    private AccountStatus status;

    public Account(AccountRole role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountRole getRole() {
        return role;
    }

    public void setRole(AccountRole role) {
        this.role = role;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }
}
