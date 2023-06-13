package automatedTellerMachine;

import automatedTellerMachine.account.Account;
import automatedTellerMachine.enumeration.CustomerStatus;
import automatedTellerMachine.transaction.Transaction;

import java.util.List;

public class Customer {
    private String name;
    private String email;
    private String phone;
    private Address address;
    private CustomerStatus status;
    private List<Card> cards;
    private List<Account> accounts;

    public boolean makeTransaction(Transaction transaction) {
        return true;
    }
}
