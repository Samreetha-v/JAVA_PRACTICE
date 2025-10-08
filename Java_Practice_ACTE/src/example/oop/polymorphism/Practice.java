package example.oop.polymorphism;


public class Practice {

	public static void main(String[] args) {
		
		// Parent reference --> Child object
		Payment ref;
		ref=new Cash();
		ref.process();
		ref=new Card();
		ref.process();
		ref=new UPI();
		ref.process();
		
		//VEHICLE -- PARENT REFERENCE 
		//SUBCLASS -- ACTUAL OBJECT TYPE
		Vehicle v1=new Car();
		v1.move();
		Vehicle v2=new Bike();
		v2.move();
		Vehicle v3=new Bus();
		v3.move();
		Vehicle v4=new Auto();
		v4.move();

	}

}
class Vehicle{
	void move() {
		System.out.println("Vehivles types");
	}
}
class Car extends Vehicle{
	void move() {
		System.out.println("4 Wheeler");
	}
}
class Bike extends Vehicle{
	void move() {
		System.out.println("2 Wheeler");
	}
}
class Bus extends Vehicle{
	void move() {
		System.out.println("4 Wheeler");
	}
}
class Auto extends Vehicle{
	void move() {
		System.out.println("3 Wheeler");
	}
}
