import com.sun.deploy.nativesandbox.NativeSandboxBroker;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Anna812 on 11/14/2016.
 */
public class Workshop01Array {
    public static void main(String[] args) {
        ArrayList <String> colors = new ArrayList<>(Arrays.asList("white", "blue", "red", "silver", "black", "green", "banana"));
        ArrayList <String> makes = new ArrayList<>(Arrays.asList("toyota", "mazda", "bmw", "vw", "opel", "suzuki", "ford","mercedes"));
        ArrayList <Integer> engineSizes = new ArrayList<>(Arrays.asList(1100, 1400, 1600, 1800, 2500));
        ArrayList <Car> lsCars = new ArrayList<>(10);

        System.out.println("Number of Cars Available = " + Car.getcountCar());

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int color = random.nextInt(7);
            int make = random.nextInt(8);
            int engineSize = random.nextInt(5);
            Car myCar = new Car(makes.get(make), colors.get(color), engineSizes.get(engineSize));
            lsCars.add(myCar);
            System.out.println("Number of Cars Available = " + Car.getcountCar());
        }

// Workshop 07:
//        System.out.println(lsCars.get(0).toString());
//        System.out.println(lsCars.get(0).toString());
//
//        lsCars.get(0).drive(20);
//        lsCars.get(1).drive(900);
//
//        for(Car thisCar : lsCars){
//            System.out.print(thisCar.toString());
//        }
    }
}
