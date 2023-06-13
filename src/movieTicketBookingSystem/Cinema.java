package movieTicketBookingSystem;

import java.util.List;

public class Cinema {
    private String name;
    private int totalCinemaHalls;
    private Address location;
    private List<CinemaHall> cinemaHalls;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalCinemaHalls() {
        return totalCinemaHalls;
    }

    public void setTotalCinemaHalls(int totalCinemaHalls) {
        this.totalCinemaHalls = totalCinemaHalls;
    }

    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        this.location = location;
    }

    public List<CinemaHall> getCinemaHalls() {
        return cinemaHalls;
    }

    public void setCinemaHalls(List<CinemaHall> cinemaHalls) {
        this.cinemaHalls = cinemaHalls;
    }
}
