package example.string;
import java.util.Scanner;
import java.util.Arrays;

public class StringProblem {

	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String string=sc.next();
		//String string="madam";
		StringBuilder sb2=new StringBuilder(string);
		StringBuilder sb3=new StringBuilder();
		//count
		String str="Hello";int count=0;
		for(char c:str.toCharArray()) {
			count++;
		}
		System.out.println(count);
		//Reverse
		sb1.append("Hello");
		System.out.println(sb1.reverse());
		//Check if a string is a palindrome
		
		 String rev=sb2.reverse().toString();
		 if(string.equals(rev)) {
			 System.out.println("Palindrome");
		 }else {
			 System.out.println("Not");
		 }
sc.close();
		
		//Count vowels and consonants
		//Count words in a string
String stri="This is a String";
String[] s3=stri.split(" ");
int counts=0;
if(stri.length()>s3.length) {
	counts++;
}
System.out.println(counts);
System.out.println(stri.length());


		//Convert case (uppercase → lowercase, lowercase → uppercase)
		//Find frequency of each character
		//Remove duplicate characters
		//Check if two strings are anagrams
	String s1="listen";
	String s2="silent";
    char[] a1=s1.toCharArray();
    char[] a2=s2.toCharArray();
    Arrays.sort(a1);
    Arrays.sort(a2);
    if(a1.equals(a2)) {
    	System.out.println("Anagram");
    }else {
    	System.out.println("Not Anagram");
    }
    
    		
    		//Find the largest and smallest word in a sentence
   
	}}


