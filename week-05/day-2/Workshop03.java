/**
 * Created by Anna812 on 11/15/2016.
 */
public class Workshop03 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Dog dog = new Dog();

        System.out.println("Testing Animal");
        animal.speak();
        animal.sleep();
        System.out.println(animal.toString());

        System.out.println("\nTesting Bird");
        bird.speak();
        bird.sleep();
        bird.fly();
        System.out.println("And a bird: " + bird.toString());

        System.out.println("\nTesting Dog");
        dog.speak();
        dog.sleep();
        dog.beg();
        System.out.println("And a dog: " + dog.toString() + ", and hasTail = " + dog.hasTail);

        System.out.println("\nTesting Dog2");
        Animal dog2 = new Dog();
        dog2.speak();
        dog2.sleep();
        System.out.println("Casting dog2 into Y to see if it begs...");
        Dog y = (Dog) dog2;
        y.lifeExpectancy = 22;
        y.isCarnivore = true;
        y.hasTail = false;
        y.beg();
        System.out.println("And a dog2: " + y.toString() + ", and hasTail = " + y.hasTail);

        System.out.println("\nTesting Dog 'd'");
        Dog d = new Dog();
        d.speak();
        d.sleep();
        System.out.println(d.toString());
    }
}
