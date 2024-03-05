import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Book {
    int inventoryID;
    String title;
    String authorName;
    String publisherName;
    String ISBN;
    Location location;

    public Book(int inventoryID, String title, String authorName, String publisherName, String ISBN) {
        this.inventoryID = inventoryID;
        this.title = title;
        this.authorName = authorName;
        this.publisherName = publisherName;
        this.ISBN = ISBN;
    }
}
