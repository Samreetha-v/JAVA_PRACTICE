package example.constructors;

public class PracticeConstructor {
int reg;int age;
		int marks;
		String name;
		PracticeConstructor(){
			System.out.println("Hello");
		}
		PracticeConstructor(int marks){
			System.out.println("Hello");
			System.out.println(marks);
		}
		PracticeConstructor(int r,String n,int a){
			reg=r;age=a;name=n;age=a;
			
		}
		
		public static void main(String[] args) {
		PracticeConstructor st=new PracticeConstructor();
		PracticeConstructor st2=new PracticeConstructor(10);
		PracticeConstructor st3=new PracticeConstructor(321,"Sam",21);
	    System.out.println(st3.reg);
	    System.out.println(st2.marks);
		System.out.println(st.marks);
		
		

	}

}
