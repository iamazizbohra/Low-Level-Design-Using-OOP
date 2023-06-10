package parkingLot;

import parkingLot.Vehicle.Vehicle;
import parkingLot.dataType.Address;
import parkingLot.enumeration.ParkingSpotType;
import parkingLot.enumeration.VehicleType;
import parkingLot.parkingSpot.*;

import java.util.HashMap;

public class ParkingLot {
    private String name;
    private Address address;
    private ParkingRate parkingRate;
    private int bikeSpotCount;
    private int compactSpotCount;
    private int largeSpotCount;
    private int electricSpotCount;
    private int handicappedSpotCount;
    private final int maxBikeCount = 0;
    private final int maxElectricCount = 0;
    private final int maxCompactCount = 0;
    private final int maxLargeCount = 0;
    private final int maxHandicappedCount = 0;
    private HashMap<String, EntrancePanel> entrancePanels;
    private HashMap<String, ExitPanel> exitPanels;
    private HashMap<Integer, ParkingFloor> parkingFloors;
    private HashMap<Integer, ParkingTicket> paidTickets;
    private HashMap<Integer, ParkingTicket> tickets;
    private EntrancePanel entrancePanel;
    private ExitPanel exitPanel;
    private static ParkingLot parkingLot = null;

    private ParkingLot() {

    }

    public static ParkingLot getInstance() {
        if (parkingLot == null) {
            parkingLot = new ParkingLot();
        }

        return parkingLot;
    }

    public void setEntrancePanel(EntrancePanel entrancePanel) {
        this.entrancePanel = entrancePanel;
    }

    public void setExitPanel(ExitPanel exitPanel) {
        this.exitPanel = exitPanel;
    }

    public void addParkingFloor(ParkingFloor parkingFloor) {
        parkingFloors.put(parkingFloor.getNo(), parkingFloor);
    }

    public void addTicket(ParkingTicket parkingTicket) {
        this.tickets.put(parkingTicket.getNo(), parkingTicket);
    }

    public void removeTicket(ParkingTicket parkingTicket) {
        this.tickets.remove(parkingTicket);
    }

    public void updateSpotCount() {
        // update spot count
        // inform the floor to update count
    }

    public boolean isFull() {
        return false;
    }

    public ParkingSpot getFreeSpot(VehicleType vehicleType) {
        // foreach floor check if any spot is available
        // return available spot

        return new BikeParkingSpot();
    }

    public ParkingSpot findParkedSpot(Vehicle vehicle) {
        // foreach floor check the spot assigned to vehicle
        // return the spot

       return new BikeParkingSpot();
    }
}
