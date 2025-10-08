package example.oop.inheritance;

//SINGLE INHERITANCE
//Parent class
class Animal{
	void eat() {
		System.out.println("Eating");
	}
}
//Child Class
class Dog extends Animal{
	void bark() {
		System.out.println("Barking");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
		d.bark();

	}

}
