package movieTicketBookingSystem;

import java.util.List;

public class CinemaHall {
    private String name;

    private Address address;
    private int totalSeats;
    private List<CinemaHallSeat> seats;
    private List<Show> shows;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public List<CinemaHallSeat> getSeats() {
        return seats;
    }

    public void setSeats(List<CinemaHallSeat> seats) {
        this.seats = seats;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
}
