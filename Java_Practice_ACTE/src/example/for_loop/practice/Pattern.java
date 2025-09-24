package example.for_loop.practice;

public class Pattern {

	public static void main(String[] args) {
		//HOLOW SQUARE
		System.out.println("HOLLOW SQUARE");
		int m=5;
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=m;j++) {
				if(i==1||i==m||j==1||j==m) 
					System.out.print(j+" ");
					else 
						System.out.print("  ");
					}
			System.out.println();
			}
		System.out.println("HOLLOW RIGHT TRIANGLE");
for(int i=1;i<=m;i++) {
	for(int j=1;j<=i;j++) {
		if(i==m||j==1||j==i) {
			System.out.print(j+" ");	
		}else {
			System.out.print("  ");
		}
		
	}
	System.out.println();
}
System.out.println("HOLLOW INVERTED RIGHT TRIANGLE");
	for(int i=m;i>=1;i--) {
		for(int j=1;j<=i;j++) {
			if(j==1||j==i||i==m) {
				System.out.print(j+" ");
			}else {
				System.out.print("  ");
			}}
		
		System.out.println();
	}
	System.out.println("HOLLOW PYRAMID");
	for(int i=1;i<=m;i++) {
		for(int j=i;j<m;j++) {
			System.out.print(" ");
		}
		for(int k =1;k<=(2*i-1);k++) {
			if(k==1||k==(2*i-1)||i==m) {
			System.out.print(k+" ");
		}else {
			System.out.print("  ");
		}}
		System.out.println();
	}
	System.out.println("DIAMOND HOLLOW");
int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
		System.out.print(" ");	
		}
	for(int k=1;k<=(2*i-1);k++) {
		if(k==1||k==(2*i-1)||i==n-i) {
		System.out.print(k+" ");
	}else {
		System.out.print("  ");
	}
	
	}
	System.out.println();
	}
	for(int i=n-1;i>=1;i--) {
		for(int j=1;j<=n-i;j++) {
		System.out.print(" ");	
		}
	for(int k=1;k<=(2*i-1);k++) {
		if(k==1||k==(2*i-1)||i==n) {
		System.out.print(k+" ");
	}else {
		System.out.print("  ");
	}
	
	}
	System.out.println();
	
	}
	System.out.println("Palindrome Alphaet");
	
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		for(char ch='A';ch<'A'+i;ch++) {
			System.out.print(ch +" ");
		}
		for(char ch=(char)('A'+i-2);ch>='A';ch--) {
			System.out.print(ch+" ");
		}
		System.out.println();
	}
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		for(char ch=(char)('A'+i-1);ch>='A';ch--) {
			System.out.print(ch +" ");
		}
		for(char ch='B';ch<='A'+i-1;ch++) {
			System.out.print(ch+"  ");
		}
		System.out.println();
	}
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int k=i;k>=1;k--) {
			System.out.print(k+" ");
		}
		for(int l=2;l<=i;l++) {
			System.out.print(l+" ");
		}
	System.out.println();
	}
}}
