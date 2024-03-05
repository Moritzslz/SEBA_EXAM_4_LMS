import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class Library {

    ArrayList<User> users;

    public Library() {
        this.users = new ArrayList<>();
    }

    public void register(User user) {
        users.add(user);
    }
}
