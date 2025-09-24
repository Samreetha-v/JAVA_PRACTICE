package example.for_loop.practice;

public class For_Loop {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println( );
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println( );
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
			    System.out.print("*");	
			}
			System.out.println();
		}
		for(int i =n-1;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println( );
		}

		for(int i=n ;i>=1;i--){
			for(int k=1;k<=n-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		//for loop basic practice 
		for(int i =1;i<=5;i++) {
			System.out.println(i);
		}
		for(int i=5;i>=1;i--) {
		  System.out.println(i);
		}
		for(int i=2;i<=20;i+=2) {
			System.out.println(i);
		}
		for(int i=1;i<=20;i+=2) {
			System.out.println(i);
		}
		int sum=0;
		for(int i =1;i<=20;i++) {
			sum+=i;
		}
		System.out.println(sum);
		int m=5;
		for(int i=1;i<=10;i++) {
			System.out.println(m+"*"+i+"="+(n*i));
		}
		int fact=1;
		for(int i=1;i<=5;i++) {
			fact*=i;
		}
		System.out.println(fact);
		for(char c='A';c<='Z';c++) {
			System.out.print(c);
		}
		int j=13;
		boolean prime=true;
		for(int i=2;i<=j/2;i++) {
			if(n%i==0) {
				prime=false;
				break;
			}
		}
		if(prime) {
			System.out.println("Prime");
		}else {
			System.out.println("not a prime");
		}
		for(int i =1;i<=5;i++) {
			System.out.println(i*i);
		}
		for(int i=1;i<=5;i++) {
			for(int j1=1;j1<=n-i;j1++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--) {
			for(int j1=1;j1<=n-i;j1++) {
			System.out.print(" ");	
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int s=5;
		for (int i = 0; i < s; i++) {
            // spaces
            for (int j2 = 0; j2 < s - i; j2++) {
                System.out.print(" ");
            }

            int number = 1; // first number in each row
            for (int j3= 0; j3 <= i; j3++) {
                System.out.print(number + " ");
                // formula for next number
                number = number * (i - j3) / (j3 + 1);
            }
            System.out.println();
            
	}
      
		
	}}
