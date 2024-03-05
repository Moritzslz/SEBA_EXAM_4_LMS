import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@Setter
@Getter
public class User {

    String fullName;
    int TUM_ID;
    Date dateOfBirth;
    int allowedSemesters;
}
