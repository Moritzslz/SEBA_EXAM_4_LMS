import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


@Setter
@Getter
public class LibraryBorrowManager {

    ArrayList<Borrow> borrowList;


    public LibraryBorrowManager() {
        this.borrowList = new ArrayList<>();
    }

    public Borrow borrowBook(Book book, User user) {

        Date currentDate = new Date();

        // Add one month to the current date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.MONTH, 1);
        Date returnDate = calendar.getTime();

        Borrow nBorrow = new Borrow(book, user, returnDate);
        borrowList.add(nBorrow);
        return nBorrow;
    }
}
