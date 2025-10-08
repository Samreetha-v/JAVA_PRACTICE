package example.Exception_Handling;
import java.util.Scanner;

public class ExceptionPractice {
	static void divideNumbers(int numerator, int denominator){
		try {
			int result=numerator/denominator;
			System.out.println(result);
		}catch(Exception e) {
			System.out.println("Cannot divide by zero "+ e                               );
		}
	}
	

	public static void main(String[] args) {
		divideNumbers(15,0);
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt()
;		AgeValidator a1=new AgeValidator();
        a1.checkAge(age);
	}

}
class InvalidAgeException extends Exception{
	 public InvalidAgeException(String msg){
		super(msg);
	}
}
class AgeValidator{
	void checkAge(int age){
		try {
			if(age<0||age>150) {
				throw new InvalidAgeException("Invalid Age");
			}else{
				System.out.println("valid");
			}}catch(Exception e) {
				System.out.println("Not valid");
			}
		
	}}

