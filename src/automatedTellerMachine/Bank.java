package automatedTellerMachine;

import automatedTellerMachine.account.Account;

import java.util.List;

public class Bank {
    private String name;
    private Address address;
    private String bankCode;
    private String phone;
    private List<ATM> atms;
    private List<Customer> customers;
    private List<Account> accounts;

    public boolean addATM() {
        return true;
    }

    public boolean removeATM() {
        return true;
    }
}
