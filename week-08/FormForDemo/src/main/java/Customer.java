import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Created by Anna on 16/12/15.
 */
@NoArgsConstructor
@AllArgsConstructor
@DatabaseTable
public class Customer {
    @DatabaseField(generatedId = true, id = true)
    int customerID;
    @DatabaseField
    String name;
    @DatabaseField
    String email;
}
