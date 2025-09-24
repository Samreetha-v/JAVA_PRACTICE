package example.operators;

public class Operators {

	public static void main(String[] args) {
		//--- 1. ARITHMETIC OPERATOR 
		int a =10;
		int b=5;
		System.out.println("ARITHMETIC OPERATOR");
		System.out.println("Addition:" + (a+b));
		System.out.println("Subtraction:"+ (a-b));
		System.out.println("Multiply: "+(a*b));
		System.out.println("Divide :"+(a/b));
		System.out.println("Modulo:"+(a%b));
		System.out.println();
		
		//---2.RELATIONAL OPERATOR
		System.out.println("RELATIONAL OPERATOR");
		int  c=5 , d=10;
		System.out.println("c==d:"+(c==d));
		System.out.println("c<=d:"+(c<=d));
		System.out.println("c>=d:"+(c>=d));
		System.out.println("c<d:"+(c<d));
		System.out.println("c>d:"+(c>d));
		System.out.println("c!=d:"+(c!=d));
		System.out.println();
		
		//---3.LOGICAL OPERATOR
		System.out.println("LOGICAL OPERATOR");
		boolean x = true, y = false;
		System.out.println("x&&y:"+(x==y));
		System.out.println("x||y:"+(x==y));
		System.out.println("!x:"+(!x));
		System.out.println();
		
		//---4.ASSIGNMENT OPERATOR
		int number = 5;
		System.out.println("After += : "+(number+=3));
		System.out.println("After -= : "+(number-=3));
		System.out.println("After *= : "+(number*=3));
		System.out.println("After /= : "+(number/=3));
		System.out.println("After %= : "+(number%=3));
		System.out.println();
		
		//---5.INCREAMENT AND DECREAMENT OPERTAOR
		System.out.println("INCREAMENT AND DECREAMENT OPERTAOR");
		int i =7;
		i=i++ + ++i + --i + i--;
		System.out.println(i);
		
		int arr[]= {5,10,15,20};
		int j =0;
		System.out.println(arr[j]+arr[j++]);
		System.out.println(arr[++j]);

	}

}
