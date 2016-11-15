/**
 * Created by Anna812 on 11/14/2016.
 */
public class Workshop01 {
    public static void main(String[] args){

// Workshop 01-02:
//        Car myCar1 = new Car("green", 1600, "Volkswagen", 210000);
//        Car myCar2 = new Car("blue", 1200, "Opel", 75000);
//        Car myCar3 = new Car("red", 2200, "Volvo", 10000);
//        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n", myCar1.typeCar, myCar1.color ,
//                myCar1.cc, myCar1.kmOdometer);
//        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n", myCar2.typeCar, myCar2.color ,
//                myCar2.cc, myCar2.kmOdometer);
//        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n", myCar3.typeCar, myCar3.color ,
//                myCar3.cc, myCar3.kmOdometer);

// Workshop: 03
//        Car myCar = new Car();
//        Car myCar2 = new Car();
//        Car myCar3 = new Car();
//
//        myCar2.setTypeCar("BMW");
//        myCar2.setColor("black");
//        myCar2.setSizeEngine(2400);
//        myCar2.setkmOdometer(34000);
//
//        myCar3.setTypeCar("Mercedes");
//        myCar3.setColor("pink");
//        myCar3.setSizeEngine(1200);
//        myCar3.setkmOdometer(45000);
//
//        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n", myCar.getTypeCar(),  myCar.getColor(),
//                myCar.getsizeEngine(), myCar.getkmOdometer());
//        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n", myCar2.getTypeCar(),
//                myCar2.getColor(),
//                myCar2.getsizeEngine(), myCar2.getkmOdometer());
//        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n", myCar3.getTypeCar(),
//                myCar3.getColor(),
//                myCar3.getsizeEngine(), myCar3.getkmOdometer());

// Workshop 04:
//        myCar.drive(15);
//        myCar2.drive(45);
//        myCar3.drive(90);

//// Workshop 05:
//        System.out.print(myCar.toString());
//        System.out.print(myCar2.toString());
//        System.out.print(myCar3.toString());


//Workshop 01, 06:
        Car myCar05 = new Car("Opel", "white", 1400, 25);
        Car myCar06 = new Car("VW", "grey"); // defaults to 1600 cc, 10 kms
        Car myCar07 = new Car(1100, 15); // defaults to a red Mazda;
        System.out.print(myCar05.toString());
        System.out.print(myCar06.toString());
        System.out.print(myCar07.toString());
    }
}


