package automatedTellerMachine;

public class CheckDepositSlot extends DepositSlot {
    public boolean verifyCheque() {
        return true;
    }

    public boolean depositCheque() {
        return true;
    }
}
