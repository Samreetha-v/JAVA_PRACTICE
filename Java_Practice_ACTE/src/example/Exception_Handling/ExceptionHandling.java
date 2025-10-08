package example.Exception_Handling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		try{
			int name=sc.nextInt();
			int a=10/0;
			
		}catch(ArithmeticException e){
		System.out.println("Exception Handled"+e);	
		}
		catch(Exception e) {
			System.out.println(e);
		}finally {
		System.out.println("HIII");
		}
		
		try {Scanner sc1= new Scanner (System.in);
		int x=sc1.nextInt();
		Scanner sc2= new Scanner (System.in);
		int y=sc2.nextInt();
		int z=x/y;
		}catch(ArithmeticException e) {
			System.out.println("AE handled");
		}
		catch(InputMismatchException e) {
			System.out.println("IME handled");
		}
	}

}
