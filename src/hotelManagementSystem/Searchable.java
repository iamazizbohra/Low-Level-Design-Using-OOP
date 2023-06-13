package hotelManagementSystem;

import hotelManagementSystem.enumeration.RoomStyle;

import java.util.Date;
import java.util.List;

public interface Searchable {
    List<Room> search(RoomStyle style, Date startDate, int duration);
}
