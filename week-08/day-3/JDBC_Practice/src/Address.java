import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Anna on 16/12/14.
 */
@DatabaseTable
public class Address {
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField
    private String street;
    @DatabaseField
    private String city;
    @DatabaseField
    private int postcode;
    @DatabaseField
    private String country;
}
