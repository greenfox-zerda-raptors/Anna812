import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import lombok.NoArgsConstructor;

/**
 * Created by Anna on 16/12/15.
 */

@DatabaseTable
//@NoArgsConstructor
public class Customer {
    @DatabaseField(generatedId = true)
    Integer customerID;
    @DatabaseField
    String name;
    @DatabaseField
    String email;

    public Customer() {
    }

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
