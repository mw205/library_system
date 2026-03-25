package library;

public class JsonBookAdapter implements BookInterface {
    private final ExternalJsonBook book;
    private boolean isAvailable;

    public JsonBookAdapter(ExternalJsonBook externalJsonBook) {
        this.book = externalJsonBook;
        isAvailable = externalJsonBook.isBorrowable;
    }

    @Override
    public void borrowBook(User user) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(user.getName() + " borrowed JsonBook");
        } else {
            System.out.println(book.bookTitle + " is not available");
        }
    }

    @Override
    public void returnBook() {
        isAvailable = true;
        System.out.println(book.bookTitle + " returned");
    }

    @Override
    public String getTitle() {
        return book.bookTitle;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }
}
