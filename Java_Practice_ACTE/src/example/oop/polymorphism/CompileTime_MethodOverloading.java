package example.oop.polymorphism;


class Calculator{
	int add(int a , int b) {
		return a+b;
	}
	double add(double a, double b) {
		return a+b;
	}
	int add(int a , int b, int c) {
		return a+b+c;
	}
	
	int multiply(int a , int b) {
		return a*b;
	}
	int multiply(int a , int b ,int c) {
		return a*b*c;
	}
	
}
public class CompileTime_MethodOverloading {

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		System.out.println(cal.add(50, 550));
		System.out.println(cal.add(500.98, 54.09));
		System.out.println(cal.add(32, 23, 54));
		System.out.println(cal.multiply(4, 7, 9));
		System.out.println(cal.multiply(56, 2));

	}

}
