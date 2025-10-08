package example.oop.Abstraction;

public class Multiple_Inheritance_Interface {
	 public static void main(String[] args) {
	        C obj = new C();
	        obj.showA();
	        obj.showB();
	    }
	}
	interface A {
	    void showA();
	}

	interface B {
	    void showB();
	}

	class C implements A, B {
	    public void showA() {
	        System.out.println("From Interface A");
	    }

	    public void showB() {
	        System.out.println("From Interface B");
	    }
	

	
	   
}


