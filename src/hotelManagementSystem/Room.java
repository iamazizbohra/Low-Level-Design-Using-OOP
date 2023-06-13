package hotelManagementSystem;

import hotelManagementSystem.enumeration.RoomStatus;
import hotelManagementSystem.enumeration.RoomStyle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Room implements Searchable{
    private String roomNumber;
    private RoomStyle style;
    private RoomStatus status;
    private double bookingPrice;
    private boolean isSmoking;

    private List<RoomKey> keys;
    private List<RoomHouseKeeping> houseKeepingLog;

    public boolean isRoomAvailable(){return  true;}
    public void checkIn(){}
    public void checkOut(){}

    @Override
    public List<Room> search(RoomStyle style, Date startDate, int duration) {
        return new ArrayList<Room>();
    }
}
