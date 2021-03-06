import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Anna on 16/12/15.
 */

@DatabaseTable
public class Address {
    @DatabaseField(generatedId = true)
    Integer addressID;
    @DatabaseField
    String city;
    @DatabaseField
    int postalCode;
    @DatabaseField
    String street;

    public Address() {
    }

    public Address(String city, int postalCode, String street) {
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
    }

    @Override
    public String toString() {
        return String.format("City: %s\nPostal code: %s\nStreet: %s", city, postalCode, street);
    }
}
