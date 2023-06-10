package parkingLot.parkingSpot;

import parkingLot.ElectricPanel;
import parkingLot.Vehicle.Vehicle;
import parkingLot.enumeration.ParkingSpotType;

public class ParkingSpot {
    private int no;
    private boolean isFree;
    private ParkingSpotType type;
    private ElectricPanel electricPanel;
    private Vehicle vehicle;

    public ParkingSpot(ParkingSpotType type) {
        this.type = type;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public ParkingSpotType getType() {
        return type;
    }

    public void setType(ParkingSpotType type) {
        this.type = type;
    }

    public void setElectricPanel(ElectricPanel electricPanel) {
        this.electricPanel = electricPanel;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void assignVehicle(Vehicle vehicle) {
        this.setVehicle(vehicle);
        this.setFree(false);
    }

    public void removeVehicle() {
        this.setVehicle(null);
        this.setFree(true);
    }

}
