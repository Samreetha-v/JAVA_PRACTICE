package example.constructors;

class Student{
	int id;
	String name;
	
	Student(){
		id=120;
		name="Sam";
	}
	void display() {
		System.out.println(id+name);
	}
	
}
class Student2{
	int reg;String name;int age;
	
	Student2(int r,String n,int a){
		reg=r;
		name=n;
		age=a;
	}
	void display2() {
		System.out.println(reg+name+age);
	}
}
public class Constructors {

	public static void main(String[] args) {
		Student s=new Student();
		s.display();
		Student2 s2=new Student2(1,"Sam",21);
		s2.display2();
	}

}
