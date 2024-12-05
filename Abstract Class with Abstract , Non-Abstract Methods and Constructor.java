public abstract class Vehicle {
 public Vehicle()
 {
 System.out.println("Vehicle is Created.");
 }

 public abstract void move();

 public void carry()
 {
 System.out.println("All Vehicle carry loads");
 }

}

public class Car extends Vehicle {

 public void move()
 {
 System.out.println("Car moves faster.");
 }

 public static void main(String[] args) {
 Car c1 = new Car();
 c1.move();
 c1.carry();
 }
}
