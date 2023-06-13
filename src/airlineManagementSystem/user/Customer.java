package airlineManagementSystem.user;

import airlineManagementSystem.Itinerary;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    private String frequentFlyerNumber;

    public List<Itinerary> getItineraries() {
        return new ArrayList<Itinerary>();
    }
}
