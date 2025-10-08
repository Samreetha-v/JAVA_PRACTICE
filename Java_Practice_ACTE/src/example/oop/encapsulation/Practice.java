package example.oop.encapsulation;

public class Practice {

	private String name;
	private String accnum;
	private int balance;
	
	public void practice(String name , String accnum,int balance) {
		this.name=name;
		this.accnum=accnum;
		this.balance=balance;
		System.out.println("Account Created : Name ");
	}
	public void credit(int cre) {
		this.balance+=cre;
		System.out.println("Amount Credited "+cre);
	}
	public void debit(int deb) {
		this.balance-=deb;
		System.out.println("Amount debited "+ deb);
	}
	public void bal() {
		System.out.println("Balance amount "+ balance);
	}
	

}
