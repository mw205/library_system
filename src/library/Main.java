package library;

public class Main {

    public static void main(String[] args) {
        LibraryService library = LibraryService.getInstance();

        library.addBook(BookFactory.createBook("physical", "Harry Potter"));
        library.addBook(BookFactory.createBook("ebook", "Design Patterns"));
        library.addBook(BookFactory.createBook("physical", "Lord of the Rings", true)); // Premium Decorated Book

        ExternalJsonBook extBook = new ExternalJsonBook("Clean Code", true, "Robert C. Martin", 2008);
        library.addBook(new JsonBookAdapter(extBook));

        User standardUser = new User("John", false);
        User premiumUser = new User("Alice", true);

        LibraryFacade facade = new LibraryFacade();

        facade.processBorrowing("Design Patterns", standardUser, 5);
        facade.processBorrowing("Design Patterns", premiumUser, 12);

        facade.processBorrowing("Lord of the Rings", standardUser, 20);

        System.out.println("\n--- Testing Observer Pattern ---");
        facade.processBorrowing("Lord of the Rings", premiumUser, 5);
        library.findBook("Lord of the Rings").returnBook();
    }
}
