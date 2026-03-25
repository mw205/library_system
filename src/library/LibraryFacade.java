package library;

public class LibraryFacade {
    private final LibraryService libraryService;
    private final BorrowApprover approvalChain;

    public LibraryFacade() {
        this.libraryService = LibraryService.getInstance();

        BorrowApprover librarian = new Librarian();
        BorrowApprover manager = new Manager();
        BorrowApprover director = new Director();

        librarian.setNextApprover(manager);
        manager.setNextApprover(director);

        this.approvalChain = librarian;
    }

    public void processBorrowing(String title, User user, int daysRequested) {
        System.out.println("\n--- Processing Borrow Request for '" + title + "' ---");

        BookInterface book = libraryService.findBook(title);

        if (book == null) {
            System.out.println("Error: Book not found in system.");
            return;
        }

        if (!approvalChain.approveRequest(daysRequested)) {
            System.out.println("Request denied: Invalid borrowing duration.");
            return;
        }

        book.borrowBook(user);
    }
}