package libraryManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Catalog implements Searchable {
    private Map<String, List<BookItem>> booksByTitle;
    private Map<String, List<BookItem>> booksByAuthor;
    private Map<String, List<BookItem>> booksByCategory;
    private Map<String, List<BookItem>> booksByPublishedDate;

    @Override
    public List<BookItem> searchByTitle() {
        return new ArrayList<BookItem>();
    }

    @Override
    public List<BookItem> searchByAuthor() {
        return new ArrayList<BookItem>();
    }

    @Override
    public List<BookItem> searchByCategory() {
        return new ArrayList<BookItem>();
    }

    @Override
    public List<BookItem> searchByPublishedDate() {
        return new ArrayList<BookItem>();
    }
}
