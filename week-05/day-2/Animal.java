/**
 * Created by Anna812 on 11/15/2016.
 */
public class Animal {

    public int lifeExpectancy;
    public boolean isCarnivore;

    public Animal() {
        lifeExpectancy = 10;
        isCarnivore = false;
        System.out.println("created an animal");
    }

    public Animal(String type, int lifeExpectancy, boolean isCarnivore) {
//        this();
        this.lifeExpectancy = lifeExpectancy;
        this.isCarnivore = isCarnivore;
        System.out.println(type);
    }

    public void sleep(String str) {
        System.out.println(str);
    }

    public void sleep() {
        System.out.println("animal sleeps");
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void speak() {
        System.out.println("animal speaks");
    }

    @Override
    public String toString() {
        return String.format("isCarnivore = %b, lifeExpectancy = %d", isCarnivore, lifeExpectancy);
    }
}
