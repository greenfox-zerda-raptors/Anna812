/**
 * Created by Anna812 on 11/15/2016.
 */
public class Person {

    public String name;
    public int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return String.format(name + "(" + age + ")");
    }
}
