package parkingLot;

import parkingLot.Vehicle.Vehicle;
import parkingLot.enumeration.ParkingSpotType;
import parkingLot.parkingSpot.BikeParkingSpot;
import parkingLot.parkingSpot.ParkingSpot;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloor {
    private int no;
    private Map<Integer, ParkingSpot> bikeParkingSpots;
    private Map<Integer, ParkingSpot> electricParkingSpots;
    private Map<Integer, ParkingSpot> compactParkingSpots;
    private Map<Integer, ParkingSpot> largeParkingSpots;
    private Map<Integer, ParkingSpot> handicappedParkingSpots;
    private ParkingDisplayBoard parkingDisplayBoard;
    private CustomerInfoPortal customerInfoPortal;

    public ParkingFloor() {
        bikeParkingSpots = new HashMap<Integer, ParkingSpot>();
        electricParkingSpots = new HashMap<Integer, ParkingSpot>();
        compactParkingSpots = new HashMap<Integer, ParkingSpot>();
        largeParkingSpots = new HashMap<Integer, ParkingSpot>();
        handicappedParkingSpots = new HashMap<Integer, ParkingSpot>();

        parkingDisplayBoard = new ParkingDisplayBoard();
    }

    public int getNo() {
        return no;
    }

    public void addBikeParkingSpot(ParkingSpot parkingSpot) {
        this.bikeParkingSpots.put(parkingSpot.getNo(), parkingSpot);
    }

    public void addElectricParkingSpot(ParkingSpot parkingSpot) {
        this.electricParkingSpots.put(parkingSpot.getNo(), parkingSpot);
    }

    public void addCompactParkingSpot(ParkingSpot parkingSpot) {
        this.compactParkingSpots.put(parkingSpot.getNo(), parkingSpot);
    }

    public void addLargeParkingSpot(ParkingSpot parkingSpot) {
        this.largeParkingSpots.put(parkingSpot.getNo(), parkingSpot);
    }

    public void addHandicappedParkingSpot(ParkingSpot parkingSpot) {
        this.handicappedParkingSpots.put(parkingSpot.getNo(), parkingSpot);
    }

    public void assignSpotToVehicle(Vehicle vehicle, ParkingSpot parkingSpot) {
        parkingSpot.assignVehicle(vehicle);

        parkingDisplayBoard.update(
                this.getFreeBikeParkingSpotCount(),
                this.getFreeElectricParkingSpotCount(),
                this.getFreeCompactParkingSpotCount(),
                this.getFreeLargeParkingSpotCount(),
                this.getFreeHandicappedParkingSpotCount()
        );
    }

    public void removeVehicleFromSpot(Vehicle vehicle, ParkingSpot parkingSpot) {
        parkingSpot.removeVehicle();

        parkingDisplayBoard.update(
                this.getFreeBikeParkingSpotCount(),
                this.getFreeElectricParkingSpotCount(),
                this.getFreeCompactParkingSpotCount(),
                this.getFreeLargeParkingSpotCount(),
                this.getFreeHandicappedParkingSpotCount()
        );
    }

    public ParkingSpot getAvailableParkingSpot(ParkingSpotType parkingSpotType){
        // search all the spots & return empty spot
        return new BikeParkingSpot();
    }

    private int getFreeBikeParkingSpotCount() {
        int count = 0;
        for (Integer key : bikeParkingSpots.keySet()) {
            if (bikeParkingSpots.get(key).isFree()) {
                count++;
            }
        }

        return count;
    }

    private int getFreeElectricParkingSpotCount() {
        int count = 0;
        for (Integer key : electricParkingSpots.keySet()) {
            if (electricParkingSpots.get(key).isFree()) {
                count++;
            }
        }

        return count;
    }

    private int getFreeCompactParkingSpotCount() {
        int count = 0;
        for (Integer key : compactParkingSpots.keySet()) {
            if (compactParkingSpots.get(key).isFree()) {
                count++;
            }
        }

        return count;
    }

    private int getFreeLargeParkingSpotCount() {
        int count = 0;
        for (Integer key : largeParkingSpots.keySet()) {
            if (largeParkingSpots.get(key).isFree()) {
                count++;
            }
        }

        return count;
    }

    private int getFreeHandicappedParkingSpotCount() {
        int count = 0;
        for (Integer key : handicappedParkingSpots.keySet()) {
            if (handicappedParkingSpots.get(key).isFree()) {
                count++;
            }
        }

        return count;
    }
}
