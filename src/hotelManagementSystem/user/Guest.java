package hotelManagementSystem.user;

import hotelManagementSystem.RoomBooking;

import java.util.ArrayList;
import java.util.List;

public class Guest extends Person {
    private int totalRoomsCheckedIn;

    public List<RoomBooking> getBookings() {
        return new ArrayList<RoomBooking>();
    }
}
