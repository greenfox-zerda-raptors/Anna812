import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import lombok.NoArgsConstructor;
import org.joda.time.Instant;

/**
 * Created by Anna on 16/12/15.
 */
@NoArgsConstructor
@DatabaseTable
public class Order {
    @DatabaseField(generatedId = true, id = true)
    int orderID;
    @DatabaseField
    String orderedItem;
    @DatabaseField
    String paymentMethod;
    @DatabaseField
    Instant timeStamp;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
    Customer customer;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
    Address address;
}
