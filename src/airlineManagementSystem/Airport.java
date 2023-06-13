package airlineManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private String name;
    private Address address;
    private String code;

    public List<Flight> getFlights(){
        return new ArrayList<Flight>();
    }
}
