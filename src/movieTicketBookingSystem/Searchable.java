package movieTicketBookingSystem;

import java.util.Date;
import java.util.List;

public interface Searchable {
    public List<Movie> searchByTitle(String title);

    public List<Movie> searchByLanguage(String language);

    public List<Movie> searchByGenre(String genre);

    public List<Movie> searchByReleaseDate(Date releaseDate);

    public List<Movie> searchByCity(String cityName);
}
