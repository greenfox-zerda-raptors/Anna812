import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Anna on 16/12/15.
 */

@DatabaseTable
public class Order {
    @DatabaseField(generatedId = true)
    Integer orderID;
    @DatabaseField
    String orderedItem;
    @DatabaseField
    String paymentMethod;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
    Customer customer;
    @DatabaseField
    String timestamp;

    public Order() {
    }

    public Order(String orderedItem, String paymentMethod, Customer customer) {
        this.orderedItem = orderedItem;
        this.paymentMethod = paymentMethod;
        this.customer = customer;
        timestamp = getInstant();
    }

    public String getInstant() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        return sdf.format(date);
    }
}
