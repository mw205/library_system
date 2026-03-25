package library;

public class EbookProxy implements BookInterface {
    private final Book ebook;

    public EbookProxy(Book eBook) {
        this.ebook = eBook;
    }

    @Override
    public void borrowBook(User user) {
        if (user.isPremium()) {
            ebook.borrowBook(user);
        } else {
            System.out.println("Access denied: " + user.getName() + " is not a premium user.");
        }
    }

    @Override
    public void returnBook() {
        ebook.returnBook();
    }

    @Override
    public String getTitle() {
        return ebook.getTitle();
    }

    @Override
    public boolean isAvailable() {
        return ebook.isAvailable();
    }


}
