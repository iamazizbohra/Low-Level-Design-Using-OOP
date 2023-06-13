package movieTicketBookingSystem;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Catalog implements Searchable{
    HashMap<String, List<Movie>> movieTitles;
    HashMap<String, List<Movie>> movieLanguages;
    HashMap<String, List<Movie>> movieGenres;
    HashMap<Date, List<Movie>> movieReleaseDates;
    HashMap<String, List<Movie>> movieCities;

    @Override
    public List<Movie> searchByTitle(String title) {
        return null;
    }

    @Override
    public List<Movie> searchByLanguage(String language) {
        return null;
    }

    @Override
    public List<Movie> searchByGenre(String genre) {
        return null;
    }

    @Override
    public List<Movie> searchByReleaseDate(Date releaseDate) {
        return null;
    }

    @Override
    public List<Movie> searchByCity(String cityName) {
        return null;
    }
}
