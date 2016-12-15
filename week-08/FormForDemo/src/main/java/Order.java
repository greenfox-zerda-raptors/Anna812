import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import lombok.NoArgsConstructor;

/**
 * Created by Anna on 16/12/15.
 */

@DatabaseTable
//@NoArgsConstructor
public class Order {
    @DatabaseField(generatedId = true)
    Integer orderID;
    @DatabaseField
    String orderedItem;
    @DatabaseField
    String paymentMethod;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
    Customer customer;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
    Address address;
//    @DatabaseField
//    DateTime instant;

    public Order() {
    }

    public Order(String orderedItem, String paymentMethod, Customer customer, Address address) {
        this.orderedItem = orderedItem;
        this.paymentMethod = paymentMethod;
        this.customer = customer;
        this.address = address;
    }
}
