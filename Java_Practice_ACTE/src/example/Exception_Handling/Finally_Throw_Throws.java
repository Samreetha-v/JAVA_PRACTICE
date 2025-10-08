package example.Exception_Handling;
import java.util.Scanner;

public class Finally_Throw_Throws {

	public static void main(String[] args) {
		Calc c=new Calc();
		try {
		c.div();
		}
		catch(Exception e) {
			System.out.println("Not divide by zero");
		}
		try {
			int a=10/0;
		}catch(Exception e){
			System.out.println("Error occured");
		}
			finally {
		
			System.out.println("Finally Block");
		}
		
		/*int err=0;
		try {
			int b=10/10;
			err=0;
		}catch(Exception e){
            err=1;
		}finally {
			if(err==1) {
				System.out.println("No error");
			}else {
				System.out.println("Error");
			}
		}
		try {
			int c=10/0;
		}finally {
			System.out.println("HIII");
		}*/
		
		//THROW 
		Scanner sc=new Scanner(System.in);
		try {
		int age=sc.nextInt();
		if(age<1) {
			throw new Exception("Age is above 1");
		}
		}catch(Exception e) {
			System.out.println("Error");
		}
		
	}

}
//THROWS
class Calc{
	void div() throws Exception{
		int a=10/0;
	}
}

