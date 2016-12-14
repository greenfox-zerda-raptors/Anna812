import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Anna on 16/12/14.
 */
@DatabaseTable
public class Address {
    @DatabaseField(generatedId = true, canBeNull = false, columnName = "address_id")
    private int id;
    @DatabaseField
    private String street;
    @DatabaseField
    private String city;
    @DatabaseField
    private int postcode;
    @DatabaseField
    private String country;

    public Address() {
    }

    public Address(String street, String city, int postcode, String country) {
        this.street = street;
        this.city = city;
        this.postcode = postcode;
        this.country = country;
    }

    @Override
    public String toString() {
        return String.format("{\npostcode = %d\ncity = %s\ncountry = %s\nstreet = %s\n}", postcode, city, country, street);
    }
}
