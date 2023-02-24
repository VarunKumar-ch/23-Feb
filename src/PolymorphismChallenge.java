import java.util.ArrayList;

interface Shape{
    void calculateArea();
    void calculatePerimeter();
}
class Circle implements Shape{
      public void calculateArea() {
          System.out.println("Calculates area of CirCle");
      }
      public void calculatePerimeter() {
          System.out.println("Calculates perimeter of Circle");
      }
}
 class Rectangle implements Shape{
     public void calculateArea() {
         System.out.println("Calculates area of Rectangle");
     }
     public void calculatePerimeter() {
         System.out.println("Calculates perimeter of Rectangle");
     }
 }
 class Triangle implements Shape{
     public void calculateArea() {
         System.out.println("Calculates area of Triangle");
     }
     public void calculatePerimeter() {
         System.out.println("Calculates perimeter of Triangle");
     }
 }



public class PolymorphismChallenge {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        ArrayList<Shape> Al = new ArrayList<Shape>();
        Al.add(circle);
        Al.add(rectangle);
        Al.add(triangle);
        for(Shape x:Al){
            x.calculatePerimeter();
            x.calculateArea();
        }
    }
}
