package example.variables;

public class Variables {
	//Instance Variable - Belongs to object
	String name="Sam";
	int Age=21;
	
	//Static Variables - Belongs to Classes
	static String name2 = "Subanu";
	static int Age2 = 20;
	
	
	public static void main(String[] args) {
		// Local variable - Defined inside a method
		int abc = 100;
		System.out.println(abc);
		
		
		Variables instanceVariable = new Variables();
		System.out.println(instanceVariable.name);
		System.out.println(instanceVariable.Age);
		
		System.out.println(Variables.name2);
		System.out.println(Variables.Age2);

	}
}
