package example.conditional_statement;
import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		//-- Conditional Statement - if,if-else,if else ladder,nested if,switch
		//--- IF STATEMENT
		System.out.println("IF STATEMENT");
		int a=10;
		if(a<=10) {
			System.out.println("A is greater value");
		}

		//--- IF-ELSE
		System.out.println("IF-ELSE STATEMENT");
		int b = 10,c=15;
		if(b>=c) {
			System.out.println("B is greater than C");
		}else{
			System.out.println("C is greater than B");
		}
		
		//--IF ELSE IF
		System.out.println("IF-ELSE If STATEMENT");
		int x=10;
		if(x>0) {
			System.out.println("It is +ve");
		}else if(x<0) {
			System.out.println("It is -ve");
		}else {
			System.out.println("Invalid");
		}
		
		//---IF ELSE LADDER
		System.out.println("IF-ELSE LADDER STATEMENT");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks :");
		int marks = sc.nextInt();
		if(marks<=100&&marks>=90) {
			System.out.println("Grade A");
		}else if(marks<=90&&marks>=80) {
			System.out.println("Grade B");
		}
		else if(marks<=80&&marks>=70) {
			System.out.println("Grade C");
		}
		else if(marks<=70&&marks>=60) {
			System.out.println("Grade D");
		}else if(marks<=60&&marks>=50) {
			System.out.println("Grade E");
		}else {
			System.out.println("Fail");
		}
	   
		//---NESTED IF
		System.out.println("NESTED IF STATEMENT");
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int g = inp.nextInt();
		if(g<=10) {
			if(g>=15) {
				System.out.println("Value is Greater than 15");
			}else {
				System.out.println("Value is greater than 10");
			}
		
		}else {
			System.out.println("Value Mismatch");
		}
	inp.close();
	sc.close();
	}
	

}
