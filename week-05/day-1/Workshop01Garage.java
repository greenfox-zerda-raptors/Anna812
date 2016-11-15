/**
 * Created by Anna812 on 11/15/2016.
 */
public class Workshop01Garage {
    public static void main(String[] args) {
        Garage garage = new Garage();
        System.out.println(garage.toString());
        garage.addRandomCar();
        Car mycar = new Car();
        garage.addCar(mycar);

    }
}
