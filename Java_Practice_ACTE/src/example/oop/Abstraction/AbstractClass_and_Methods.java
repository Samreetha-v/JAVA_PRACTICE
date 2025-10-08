package example.oop.Abstraction;

abstract class Vehicle{
	abstract void start() ;
	Vehicle(){
	System.out.println("Vehicle constructor");
	}
	void move(){
		System.out.println("Vehicles move after started");
	}
}
class Car extends Vehicle{
	Car(){
		System.out.println("Car Constructor");
	}
	void start() {
		System.out.println("Car Started");
	}
}
class Bike extends Vehicle{
	void start() {
		System.out.println("Bike Started");
	}
}
public class AbstractClass_and_Methods {

	public static void main(String[] args) {
		Vehicle obj;
		obj=new Car();
       // obj.move();
		obj.start();
		obj=new Bike();
		obj.start();

	}

}
