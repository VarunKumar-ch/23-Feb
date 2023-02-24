class Animal{ //Base Class
    //Instance Variable
    String name = "C";
    int age = 5;
    String color = "Brown";
    void eat(){
        System.out.println("I am Eating");
    }
    void sleep(){
        System.out.println("I am Eating");
    }
}

class Dog extends Animal{    //Child Class(Dog)
    String breed = "BullDog";
    boolean isTrained = false; //No
    void bark(){
        System.out.println("I am Barking");
    }
    void fetch(){
        System.out.println("fetching");
    }
}





public class InheritanceChallenge {
    public static void main(String[] args) {
        Dog Mydog = new Dog();
        System.out.println(Mydog.name);
        System.out.println(Mydog.age);
        System.out.println(Mydog.breed);
        System.out.println(Mydog.isTrained);
        System.out.println(Mydog.color);

        Mydog.eat();
        Mydog.bark();
        Mydog.fetch();
        Mydog.sleep();;


    }
}
