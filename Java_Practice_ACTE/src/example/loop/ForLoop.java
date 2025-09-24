package example.loop;
import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the n value");
	int n = sc.nextInt();
	for(int i=1;i<=n;i++) {
		System.out.println(i);
		
	}
	// pattern
	System.out.println("RIGHT ANGLE TRIANGLE");
	for(int i =1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*"); /*1 22 333 4444 55555 ==> i
/* when print j  1
			12
			123
			1234
			12345*/
		}
		System.out.println();
	}
	
	//--INVERTED TRIANGLE
	System.out.println("INVERTED TRIANGLE");
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	//PYRAMID PATTERN
	System.out.println("PYRAMID PATTERN");
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=2*i-1;k++) {  //2*i-1 ==> pyramid without -1 it prints only even number pattern
			System.out.print("*");
		}
		System.out.println();
	}
	
	System.out.println("DIAMOND PATTERN");
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=2*i-1;k++) {  
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=n-1;i>=1;i--) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=2*i-1;k++) {  
			System.out.print("*");
		}
		System.out.println();
	}
		sc.close();
		
			
		}
		

}
