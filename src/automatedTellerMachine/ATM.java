package automatedTellerMachine;

import automatedTellerMachine.transaction.Transaction;

public class ATM {
    private int atmID;
    private Bank bank;
    private Address location;
    private Keypad keypad;
    private Screen screen;
    private Printer printer;
    private CashDispenser cashDispenser;
    private CashDepositSlot cashDepositSlot;
    private CheckDepositSlot checkDepositSlot;

    public boolean authenticateUser() {
        return true;
    }

    public boolean makeTransaction(Customer customer, Transaction transaction) {
        return true;
    }
}
