import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Anna on 16/12/14.
 */
@DatabaseTable
public class Account {
    @DatabaseField(id = true)
    private String name;
    @DatabaseField
    private String password;
    @DatabaseField(foreign = true, foreignAutoCreate = true)
    private Address address;

    public Account() {
    }

    public Account(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("{\n%s\n%s\n}", name, address.toString());
    }
}
