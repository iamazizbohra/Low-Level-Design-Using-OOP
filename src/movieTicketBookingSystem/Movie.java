package movieTicketBookingSystem;

import movieTicketBookingSystem.user.Admin;

import java.util.Date;
import java.util.List;

public class Movie {
    private String title;
    private String description;
    private int durationInMins;
    private String language;
    private Date releaseDate;
    private String country;
    private String genre;
    private Admin AddedBy;
    private List<Show> shows;
}
