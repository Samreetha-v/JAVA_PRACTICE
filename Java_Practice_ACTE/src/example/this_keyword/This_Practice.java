package example.this_keyword;

public class This_Practice {
             String name ; int age;
             This_Practice(String name , int age){
            	 this.name=name;
            	 this.age=age;
             }
             void display() {
            	 System.out.println(age+" "+name);
             }
             
	public static void main(String[] args) {
		This_Practice tp =new This_Practice("sam",21);
		tp.display();
    
	}

}
