package example.conditional_statement;
import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		System.out.println("SWITCH STATEMENT");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value :");
		//integer
		int val=sc.nextInt();
		switch(val) {
		case 1:
			System.out.println("1st value");
			break;
		case 2:
			System.out.println("2nd value");
			break;
		case 3:
			System.out.println("3rd value");
			break;
		default:
			System.out.println("Invalid value");
		}
		//String
		String fruit="Strawberry";
		switch(fruit) {
		case "Mango":
			System.out.println("This is Mango");
			break;
		case "Grape":
			System.out.println("This is Grape");
			break;
		case "Orange":
			System.out.println("This is Orange");
			break;
		case "Apple":
			System.out.println("This is Apple");
			break;
		default:
			System.out.println("No data found");
		}
		sc.close();

	}

}
