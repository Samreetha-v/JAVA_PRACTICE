package example.oop.Abstraction;

interface Animal{
	int num=20;  //public , static , final
	void eats();
	default void method2() {
		System.out.println("Default can be overrridden");
	}
	static void method3() {
		System.out.println("Static can be overrridden");
	}
}
class Cat implements Animal{
	public void eats() {
		System.out.println("Cats eat fish");
	}
	
	@Override
	public void method2() {
		System.out.println("Override");
	}
}
public class Interface_Practice {

	public static void main(String[] args) {
          Animal a1=new Cat();
          a1.eats();
          a1.method2();
        
          Animal.method3();
System.out.println(Animal.num);
	}

}
