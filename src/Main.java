class Vechicle{    //Base Class
    private String make;
    private String model;
    private int year;
    private String color;

    //Getters and Setters Methods for each Property

    //Setters
     void SetNameforMake(String make){
        this.make = make;
    }
    void SetNameforModel(String model){
         this.model = model;
    }
    void SetNameforYear(int year){
         this.year =year;
    }
    void SetNameforColor(String color){
         this.color =color;
    }


    //Getters
    String getNameforMake(){
         return make;
    }
    String getNameforModel(){
        return model;
    }
    int getNameforYear(){
        return year;
    }
    String getNameforColor(){
        return color;
    }

}
class Car extends Vechicle{  //Child Class (Car) Extends to parent Class(Vechicle)
    int numDoors(){
        return 4;
    }
}
class Truck extends  Vechicle{ ///Child Class (Truck) Extends to parent Class(Vechicle)
    double cargoCapacity(){
        return 4.44444;
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        Truck myTruck = new Truck();
        myCar.SetNameforMake("Ford");
        myCar.SetNameforModel("Camry");
        myCar.SetNameforYear(2012);
        myCar.SetNameforColor("White");
        myTruck.SetNameforMake("Toyato");
        myTruck.SetNameforModel("F-150");
        myTruck.SetNameforYear(2019);
        myTruck.SetNameforColor("Red");


        System.out.println(myCar.getNameforMake());
        System.out.println(myCar.getNameforModel());
        System.out.println(myCar.getNameforYear());
        System.out.println(myCar.getNameforColor());
        System.out.println(myCar.numDoors());


        System.out.println(myTruck.getNameforMake());
        System.out.println(myTruck.getNameforModel());
        System.out.println(myTruck.getNameforYear());
        System.out.println(myTruck.getNameforColor());
        System.out.println(myTruck.cargoCapacity());


    }
}