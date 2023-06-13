package restaurantManagementSystem;

import restaurantManagementSystem.enumeration.TableStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Table {
    private int tableID;
    private TableStatus status;
    private int maxCapacity;
    private int locationIdentifier;

    private List<TableSeat> seats;

    public void isTableFree() {

    }

    public void addReservation() {

    }

    public static List<Table> search(int capacity, Date startTime) {
        // return all tables with the given capacity and availability
        return new ArrayList<Table>();
    }
}
