package library;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {

    private static LibraryService instance;
    private final List<BookInterface> books = new ArrayList<>();

    private LibraryService() {

    }

    static public LibraryService getInstance() {
        if (instance == null) {
            instance = new LibraryService();
        }
        return instance;
    }

    public void addBook(BookInterface book) {
        books.add(book);
    }


    public BookInterface findBook(String title) {
        for (BookInterface book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void borrowBook(String title, User user) {
        BookInterface book = findBook(title);
        if (book != null) {
            book.borrowBook(user);
        } else {
            System.out.println("BookInterface not found.");
        }
    }

    public void returnBook(String title) {
        BookInterface book = findBook(title);
        if (book != null) {
            book.returnBook();
        } else {
            System.out.println("BookInterface not found.");
        }
    }
}
