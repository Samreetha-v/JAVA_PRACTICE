package example.string;

public class StringBuilderAndBuffer {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello");
		sb.append("Welcome");
		System.out.println(sb);
		//insert,replace,length,substring,char at,capacity,set char at
		System.out.println(sb.insert(5,"Hi"));
		sb.replace(6,11,"Java");
		System.out.println(sb);
		
		System.out.println(sb.length());
		sb.substring(0, 8);
		System.out.println(sb);
		sb.charAt(5);
		System.out.println(sb);
		sb.delete(9, 10);
		System.out.println(sb);
		
		System.out.println(sb.capacity());
		sb.setCharAt(9,'K');
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

	}

}
