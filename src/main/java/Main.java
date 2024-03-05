import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Init classes
        LibraryCatalog libraryCatalog = new LibraryCatalog();
        Library library = new Library();
        LibraryBorrowManager libraryBorrowManager = new LibraryBorrowManager();

        // Create three Books
        Book book1 = new Book(1, "Introduction to Java", "John Smith", "ABC Publishing", "1234567890");
        Book book2 = new Book(2, "Data Structures and Algorithms", "Alice Johnson", "XYZ Publications", "0987654321");
        Book book3 = new Book(3, "Design Patterns", "Emily Davis", "DEF Books", "9876543210");

        // Create their locations
        Location location1 = new Location("Main Library", "3A", 1, 2);
        Location location2 = new Location("Main Library", "2B", 2, 3);
        Location location3 = new Location("Branch Library", "5C", 3, 4);

        book1.setLocation(location1);
        book2.setLocation(location2);
        book3.setLocation(location3);

        // Store books and their locations in the lists
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        libraryCatalog.setBooks(books);

        ArrayList<Location> locations = new ArrayList<>();
        locations.add(location1);
        locations.add(location2);
        locations.add(location3);

        System.out.println("A user wants to get a library membership and therefore registers at the library");
        System.out.println("If a user is not registered, they cannot use the service (trivial in this case)");
        User nRegisteredUser = new User("Moritz Schultz", 1, new Date(), 3);
        library.register(nRegisteredUser);
        System.out.println("Created user: " + nRegisteredUser.getFullName() + " who is born on: " + nRegisteredUser.dateOfBirth + " with the id: " + nRegisteredUser.getTUM_ID() + " and is allowed to use the library for " + nRegisteredUser.allowedSemesters + " semesters.");

        // Print books and their locations
        System.out.println("\nBooks and their Locations:");
        for (Book book : libraryCatalog.getBooks()) {
            System.out.println("Book: " + book.getTitle() + ", Location: " + book.getLocation());
        }

        System.out.println("The user now wants to borrow a book.");
        // Borrow a book
        Borrow borrow = libraryBorrowManager.borrowBook(book1, nRegisteredUser);

        // Test if user is registered
        System.out.println("Is user registered? " + library.getUsers().contains(nRegisteredUser));

        // Test if book is borrowed
        System.out.println("Is book borrowed? " + libraryBorrowManager.getBorrowList().contains(borrow));

        // Test if book is in library catalog
        System.out.println("Is book in catalog? " + libraryCatalog.getBooks().contains(book1));

        // Test if book has a location
        System.out.println("Book location: " + book1.getLocation());

        // Test if book has bibliographic information
        System.out.println("Book title: " + book1.getTitle());
        System.out.println("Book author: " + book1.getAuthorName());
        System.out.println("Book ISBN: " + book1.getISBN());
        System.out.println("Book publisher: " + book1.getPublisherName());

        // Test if book can be borrowed multiple times
        libraryBorrowManager.getBorrowList().add(borrow); // Borrowing the same book again
        System.out.println("Number of times book is borrowed: " + libraryBorrowManager.getBorrowList().size());

    }
}