package library;

public abstract class BookDecorator implements BookInterface {

    protected BookInterface decoratedBook;

    public BookDecorator(BookInterface decoratedBook) {
        this.decoratedBook = decoratedBook;
    }

    public void borrowBook(User user) {
        decoratedBook.borrowBook(user);
    }

    public void returnBook() {
        decoratedBook.returnBook();
    }

    public String getTitle() {
        return decoratedBook.getTitle();
    }

    public boolean isAvailable() {
        return decoratedBook.isAvailable();
    }

}