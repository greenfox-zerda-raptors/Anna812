/**
 * Created by Anna812 on 11/15/2016.
 */
public class Mentor extends Person {

    public String seniorityLevel;
    public String subject;

    public Mentor (String name, int age, String seniorityLevel, String subject) {
        super(name, age);
        this.seniorityLevel = seniorityLevel;
        this.subject = subject;
    }

    public String toString() {
        return String.format(super.toString() + " is a(n) " + subject + " " + seniorityLevel);
    }

}
