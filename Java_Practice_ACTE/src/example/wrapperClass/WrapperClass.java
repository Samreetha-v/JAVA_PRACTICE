package example.wrapperClass;

public class WrapperClass {

	public static void main(String[] args) {
		int a = 50;
        Integer obj1 = Integer.valueOf(a);  
        int b = obj1.intValue();            
        System.out.println("Manual Boxing: " + obj1);
        System.out.println("Manual Unboxing: " + b);
        
        int x = 100;
        Integer autoObj = x;  
        System.out.println("Autoboxed Integer: " + autoObj);
        Integer wrapperNum = 200;
        int unboxed = wrapperNum;  
        System.out.println("Unboxed int: " + unboxed);
	}

}
