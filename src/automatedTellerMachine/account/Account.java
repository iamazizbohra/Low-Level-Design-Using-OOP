package automatedTellerMachine.account;

import automatedTellerMachine.Bank;
import automatedTellerMachine.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Account {
    private Bank bank;
    private Customer customer;
    private int accountNumber;
    private double balance;

    public double getBalance() {
        return 0.0;
    }

    public List<Objects> getStatement() {
        return new ArrayList<>();
    }
}
