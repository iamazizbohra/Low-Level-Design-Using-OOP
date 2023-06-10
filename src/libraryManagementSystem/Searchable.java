package libraryManagementSystem;

import java.util.List;

public interface Searchable {
    List<BookItem> searchByTitle();

    List<BookItem> searchByAuthor();

    List<BookItem> searchByCategory();

    List<BookItem> searchByPublishedDate();
}
