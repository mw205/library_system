package library;

public class ExternalJsonBook {
    public String bookTitle;
    public boolean isBorrowable;
    public String authorName;
    public int year;

    public ExternalJsonBook(
            String bookTitle,
            boolean isBorrowable,
            String authorName,
            int year
    ) {
        this.bookTitle = bookTitle;
        this.isBorrowable = isBorrowable;
        this.authorName = authorName;
        this.year = year;
    }
}
