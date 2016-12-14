import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Anna on 16/12/14.
 */
@DatabaseTable
public class Address {
    @DatabaseField(generatedId = true, columnName = "address_id")
    private int id;
    @DatabaseField
    private String street;
    @DatabaseField
    private String city;
    @DatabaseField
    private int postcode;
    @DatabaseField
    private String country;

    @Override
    public String toString() {
        return String.format("{\npostcode = %d\ncity = %s\ncountry = %s\nstreet = %s\n}", postcode, city, country, street);
    }
}
