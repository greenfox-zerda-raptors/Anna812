/**
 * Created by Anna812 on 11/14/2016.
 */
public class Car {
    private String color;
    private int sizeEngine;
    private String typeCar;
    private int kmOdometer;
    private static int countCar = -1;

// Workshop 03
    public Car() {
        color = "red";
        sizeEngine = 1600;
        typeCar = "Ford";
        kmOdometer = 15000;
    }

    public String getColor() {
        return color;
    }

    public int getSizeEngine() {
        return sizeEngine;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public int getkmOdometer() {
        return kmOdometer;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSizeEngine(int sizeEngine) {
        this.sizeEngine = sizeEngine;
    }

    public void setkmOdometer(int kmOdometer) {
        this.kmOdometer = kmOdometer;
    }
// Workshop 04
    public void drive (int speed){
        if (speed < 20) {
            System.out.println("brrm, " + color + " " +  typeCar + " " + "just drove around " +
                    "town " + speed + " clicks.");
        } else if (speed < 50) {
            System.out.println("brrm, screech, brrm, screech; " + color + " " + typeCar + " " +
                    "commuted " + speed + " clicks.");
        } else {
            System.out.println("whee, " + color + " " + typeCar + " " + speed + " clicks.");
        }
        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's.\n", typeCar,  color,
                sizeEngine, kmOdometer + speed);
    }
// Workshop 05
    @Override
    public String toString() {
        return String.format("This %s is %s, has %d cc engine and clocked %d km's.\n", typeCar, color, sizeEngine,
                kmOdometer);
    }

    //Workshop01, 06 CONSTRUCTOR:


    public Car(String color, String typeCar) {
        this (typeCar, color, 1600, 10);
    }

    public Car(int sizeEngine, int kmOdometer) {
        this ("Mazda", "red", sizeEngine, kmOdometer);
    }

    public Car(String typeCar, String color, int sizeEngine) {
        this (typeCar, color, sizeEngine, 10);
        countCar++;
    }

    public Car(String typeCar, String color, int sizeEngine, int kmOdometer) {
        this.typeCar = typeCar;
        this.color = color;
        this.sizeEngine = sizeEngine;
        this.kmOdometer = kmOdometer;
    }

    public static int getcountCar() {
        return countCar;
    }
}

