import java.util.ArrayList;

abstract class Vehicle1{ //base class
    String make1 ="123";
    String model1 ="456";
    String year1="2023";
    abstract void start();
}

 class Car1 extends Vehicle1{ //Child Class(Car1)
     void start(){
         System.out.println("I am Starting Car1");
     }
}
class Truck1 extends Vehicle1{ //Child Class(Truck1)

    void start(){
        System.out.println("I am Starting Truck1");
    }
}

class Motorcycle extends Vehicle1{ //Child Class (MotorCycle)
    void start(){
        System.out.println("I am MotorCycle");
    }
}




public class AbstractionChallenge {
    public static void main(String[] args) {
        Vehicle1 a = new Car1();

        Vehicle1 b = new Truck1();
        Vehicle1 c =new Motorcycle();
        System.out.println(b.make1);
        ArrayList<Vehicle1> d = new ArrayList<Vehicle1>();
        d.add(a);
        d.add(b);
        d.add(c);
        for(Vehicle1 i:d){
             i.start();
        }
        // 0 index -> Car1.start();
        // 1 index -> Truck1.start();
        //2  index -> Motorcycle.start();
    }

}
