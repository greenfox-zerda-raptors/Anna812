/**
 * Created by Anna812 on 11/15/2016.
 */
public class Dog extends Animal {

    public boolean hasTail = true;

    public Dog() {
        super("new dog", 15, true);
    }

    public void speak() {
        System.out.println("dog barks");
    }

    public void beg() {
        System.out.println("dog begs");
    }
}
