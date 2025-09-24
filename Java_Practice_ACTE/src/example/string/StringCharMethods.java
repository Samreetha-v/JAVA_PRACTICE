package example.string;

public class StringCharMethods {

	public static void main(String[] args) {
		
		//----CHARACTERS METHODS
		char ch1='a';
		char ch2='9';
		char ch3=' ';
		char ch4='A';
		System.out.println(Character.isLetterOrDigit(ch4));
		System.out.println(Character.isLetter(ch1));
		System.out.println(Character.toUpperCase(ch1));
		System.out.println(Character.isDigit(ch4));
		System.out.println(Character.toLowerCase(ch4));
		System.out.println(Character.isLetterOrDigit(ch3));
		System.out.println(Character.isWhitespace(ch3));
		System.out.println(Character.isDigit(ch2));
		System.out.println(Character.getNumericValue(ch2));
		System.out.println(Character.isAlphabetic(ch4));
		System.out.println(Character.isDefined('@'));
		
		//---STRING METHODS
		String s1="Hello";
		String s2="   Welcome";
		String s3="hello";
		System.out.println(s1+" ".concat(s2));
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		//--BOOLEAN RETURN TYPE
		System.out.println(s1.contains("He"));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.startsWith("Hello"));
		System.out.println(s1.startsWith("l",3));
		
		//--INTEGER RETURN TYPE
		System.out.println(s1.length());
		System.out.println(s1.indexOf('l'));
		System.out.println(s2.indexOf("come",3));
		System.out.println(s1.lastIndexOf('o'));
		System.out.println(s1.lastIndexOf("come",1));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareToIgnoreCase(s3));
		
		//--STRING RETURN TYPE
		System.out.println(s2.trim());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.replace('H','W'));
		System.out.println(s2.substring(4,6));
		
		//--CHARACTER RETURN
		String s4="Samreetha";
		char ch5=s4.charAt(4);
		char[] ch6=s4.toCharArray();
		System.out.println(ch6);
		System.out.println(ch5);
	}

}
