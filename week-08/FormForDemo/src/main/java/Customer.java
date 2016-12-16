import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Anna on 16/12/15.
 */

@DatabaseTable
public class Customer {
    @DatabaseField(generatedId = true)
    Integer customerID;
    @DatabaseField
    String name;
    @DatabaseField
    String email;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
    Address address;

    public Customer() {
    }

    public Customer(String name, String email, Address address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("Customer name: %s\nE-mail: %s\n%s", name, email, address.toString());
    }
}
