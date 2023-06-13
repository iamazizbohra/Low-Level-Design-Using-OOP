package automatedTellerMachine;

import automatedTellerMachine.enumeration.TransactionType;

public class Screen {
    public boolean showMessage(String message) {
        return true;
    }

    public TransactionType getInput() {
        return TransactionType.BALANCE_INQUIRY;
    }
}
