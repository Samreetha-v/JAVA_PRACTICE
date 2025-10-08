package example.oop.polymorphism;
class Shape{
void draw() {
	System.out.println("Draw a shape");
}}
class circle extends Shape{
	void draw() {
		System.out.println("Draw Circle");
	}
}
class Rectangle extends Shape{
	@Override
	void draw() {
		System.out.println("Draw Rectangle");
	}
}

public class RunTime_MethodOverriding {

	public static void main(String[] args) {
		Shape sh = new Shape();
		sh.draw();
		
		//if we use cirlcle , it is not run time
		Shape sh1=new circle();
		sh1.draw();
		Shape sh2=new Rectangle();
		sh2.draw();

	}

}
