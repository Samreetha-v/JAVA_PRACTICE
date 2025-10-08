package example.this_keyword;

public class ThisKeyword {
      String myname;
      ThisKeyword(){
    	  System.out.println("hello");
      }
      void setname(String myname) {
    	  this.myname=myname;
      }
	public static void main(String[] args) {
		ThisKeyword tk = new ThisKeyword();
		tk.setname("mark");
		System.out.println(tk.myname);
		}

}
