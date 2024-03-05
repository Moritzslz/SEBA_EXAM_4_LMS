import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Borrow {

    Book book;
    User user;
    Date returnAt;
    Date returnedAt;
    int penalty;

    public Borrow(Book book, User user, Date returnAt) {
        this.book = book;
        this.user = user;
        this.returnAt = returnAt;
        this.returnedAt = null;
        this.penalty = 0;
    }
}
