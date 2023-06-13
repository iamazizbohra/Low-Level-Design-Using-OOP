package airlineManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Aircraft {
    private String name;
    private String model;
    private String manufacturer;
    private int manufacturingYear;
    private int maxCapacity;
    private List<Seat> seats;

    public List<FlightInstance> getFlights(){
        return new ArrayList<FlightInstance>();
    }
}
