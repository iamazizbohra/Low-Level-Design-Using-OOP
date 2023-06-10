package parkingLot.Vehicle;

import parkingLot.enumeration.VehicleType;

public abstract class Vehicle {
    private String no;
    private VehicleType type;

    public Vehicle(VehicleType type) {
        this.type = type;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }
}
