package example.oop.encapsulation;

public class Encapsulation {
         

	public static void main(String[] args) {
		Encapsulate en=new Encapsulate();
		en.setName("Sam");
		System.out.println(en.getName());
		en.setInt(50);
		System.out.println(en.getInt());
        Practice acc1=new Practice();
        acc1.practice("Samreetha", "98765432SAM",5000);
        acc1.credit(2000);
        acc1.debit(500);
        acc1.bal();
	}

}
