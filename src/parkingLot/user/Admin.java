package parkingLot.user;

import parkingLot.*;
import parkingLot.enumeration.AccountRole;
import parkingLot.parkingSpot.ParkingSpot;

public class Admin extends Account {
    public Admin() {
        super(AccountRole.ADMIN);
    }

    public boolean addParkingFloor(ParkingFloor floor) {
        return true;
    }

    public boolean addParkingSpot(ParkingFloor parkingFloor, ParkingSpot spot) {
        return true;
    }

    public boolean addParkingDisplayBoard(ParkingFloor parkingFloor, ParkingDisplayBoard displayBoard) {
        return true;
    }

    public boolean addCustomerInfoPanel(ParkingFloor parkingFloor, CustomerInfoPortal infoPanel) {
        return true;
    }

    public boolean addEntrancePanel(EntrancePanel entrancePanel) {
        return true;
    }

    public boolean addExitPanel(ExitPanel exitPanel) {
        return false;
    }
}
