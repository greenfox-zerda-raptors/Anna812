import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Anna812 on 11/14/2016.
 */

public class Garage {
    public ArrayList<Car> garage;

    public Garage(){
        ArrayList<Car> garage = new ArrayList<>(getCars());
    }

    private ArrayList <String> colors = new ArrayList<>(Arrays.asList("white", "blue", "red", "silver", "black",
            "green", "banana"));
    private ArrayList <String> makes = new ArrayList<>(Arrays.asList("toyota", "mazda", "bmw", "vw", "opel",
            "suzuki", "ford","mercedes"));
    private ArrayList <Integer> engineSizes = new ArrayList<>(Arrays.asList(1100, 1400, 1600, 1800, 2500));
    private Random random = new Random();

    public ArrayList getCars() {

        ArrayList <Car> lsCars = new ArrayList<>(5);

        for (int i = 0; i < 5; i++) {
            int color = random.nextInt(7);
            int make = random.nextInt(8);
            int engineSize = random.nextInt(5);
            Car myCar = new Car(makes.get(make), colors.get(color), engineSizes.get(engineSize));
            lsCars.add(myCar);
        }
        return lsCars;
    }

    public void addRandomCar() {
        int color = random.nextInt(7);
        int make = random.nextInt(8);
        int engineSize = random.nextInt(5);
        Car myCar = new Car(makes.get(make), colors.get(color), engineSizes.get(engineSize));
        garage.add(garage.size(), myCar);
    }

    public void addCar (Car thisCar) {
        garage.add(garage.size(), thisCar);
    }
}