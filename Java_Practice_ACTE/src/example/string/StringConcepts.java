package example.string;
import java.util.Arrays;

public class StringConcepts {

	public static void main(String[] args) {
		String s="This is a String";
		int end=0;int position=0;
		String word;
		while(s.indexOf(' ',position)>0){
			end=s.indexOf(' ',position);
			word=s.substring(position, end);
			System.out.println(word);
			position=end+1;
			
		}
		word=s.substring(position);
		System.out.println(word);
		
		
		//---Built in 
		{
			String[] str=s.split(" ");
			for(String s1:str) {
				System.out.println(s1);
			}
			
			int ends=0;int positions=0;
			String words,longest="";
			while(s.indexOf(' ',positions)>0){
				ends=s.indexOf(' ',positions);
				words=s.substring(positions, ends);
				if(words.length()>longest.length()) {
					longest=words;;
				}
				positions=end+1;
				
			}
			words=s.substring(positions);
			if(words.length()>longest.length()) {
				longest=words;
			}
			System.out.println(longest);
			System.out.println(longest.length());
			
		}
		
		String[] stri=s.split(" ");
		String longest=" ";
		for(String string:stri) {
			if(string.length()>longest.length()) {
				longest=string;
			}
			
		}
		System.out.println(longest);
		
		//--Built in for capitalize 
		{
			// String ="This is a String";
		
		StringBuilder sb=new StringBuilder("This is a String");
	
			System.out.println(sb.reverse());
			
			/*String s3=(s2.substring(0,1).toUpperCase()+s2.substring(1).toLowerCase()+" ");
			System.out.print(s3);*/
			
		}}
		
		
		{
	
		String str1="silent";
		String str2="listen";
		
		char[] a1=str1.toCharArray();
		char[] a2=str2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		if(Arrays.equals(a1,a2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
		
		
	}
}
