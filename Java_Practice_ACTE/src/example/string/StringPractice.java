package example.string;
import java.util.Scanner;

public class StringPractice {

	public static void main(String[] args) {{
		Reverse obj=new Reverse();
		obj.rev();
		Palindrome obj2=new Palindrome();
		obj2.palindrome();
		VowelsConsonants obj3=new VowelsConsonants();
		obj3.vowcon();
		ConvertCase conv = new ConvertCase();
		conv.convert();
		//COUNT with space
		String str="This is a Program";
		int count=0;
		for(char s1:str.toCharArray()) {
			count++;
		}
       System.out.println(count);}
	//without spaces
	int count=0;
	String str1="This is a Program";
       for(int i=0;i<str1.length();i++) {
    	   if(str1.charAt(i)!=' ') {
    		   count++;
    	   }
       }
       System.out.println(count); 
       
	}
}//REVERSE
class Reverse{
	void rev() {
		String str="This is a Program";
		String reverse="";
		System.out.println(str.length());
		for(int i=str.length()-1;i>=0;i--) {
			reverse+=str.charAt(i);
		}
		System.out.println(reverse);
		}
	}
//PALINDROME
class Palindrome{
	void palindrome() {
		String copy="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Input:");
		String str=sc.nextLine();
		for(int i=str.length()-1;i>=0;i--) {
			copy+=str.charAt(i);
		}
		boolean b=str.equalsIgnoreCase(str);
		if(b==true) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}
}
class VowelsConsonants{
	void vowcon() {
		String str="This Program".toLowerCase();
		int vowels=0;int consonats=0;
		for(char c:str.toCharArray()) {
		if(c>='a'&&c<='z') {
			if("aeiou".indexOf(c)!=-1) {
				vowels++;
			}else {consonats++;}
		}
		
		}System.out.println(vowels);System.out.println(consonats);
	}
}
//CONVERT CASE
class ConvertCase{
	void convert() {
		String str="HellO";
		StringBuilder cas=new StringBuilder();
		for(char c:str.toCharArray()) {
			if(Character.isUpperCase(c)) {
				cas.append(Character.toLowerCase(c));
			}else {
				cas.append(Character.toUpperCase(c));
			}
		}
		System.out.println(cas);
	}
}//COUNT WORDS
class counts{
	void count() {
		String str="This ia Progran to execute";
		int count=0;
		String[] s1=str.split(" ");
		for(int i=0;i<s1.length;i++) {
			count++;
			
		}System.out.println(count);
	}
}


