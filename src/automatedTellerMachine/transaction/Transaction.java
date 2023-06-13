package automatedTellerMachine.transaction;

import automatedTellerMachine.enumeration.TransactionStatus;

import java.util.Date;

public class Transaction {
    private int transactionId;
    private Date createdAt;
    private TransactionStatus status;

    public boolean makeTransaction() {
        return true;
    }
}
