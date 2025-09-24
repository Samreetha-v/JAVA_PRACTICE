package example.type_casting;

public class TypeCasting {
	public static void main(String[] args) {
	//	Widening Casting
	int number = 100;
	float val = number;
    System.out.println("Widening Casting:");
	System.out.println("Before Casting :"+ number);
	System.out.println("After Casting :"+ val);
	long abc = 12345L;
	float cd=abc;
	System.out.println(cd);
	//Narrowing Casting
	float fc=45.67f;
	int num =(int)fc;
	System.out.println("Narrowing Casting:");
	System.out.println("Before Casting :"+ fc);
	System.out.println("After Casting :"+ num);
	}
}
