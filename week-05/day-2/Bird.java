/**
 * Created by Anna812 on 11/15/2016.
 */
public class Bird extends Animal {

    public Bird() {
        super("new bird", 2, false);
    }

    public void fly() {
        System.out.println("bird flies");
    }

    public void sleep() {
//        System.out.println("The bird is sleeping");
        super.sleep();
    }

    public void eat() {
        super.eat();
    }

    public void speak() {
        System.out.println("bird chirps");
    }

    public void nightyNight() {
        super.eat();
        sleep();
    }
}
