package example.Arrays;



public class Arrays {

	public static void main(String[] args) {
		int[] arr=new int[5];
		// Manual assigning values
		arr[0]=5;
		arr[1]=2;
		arr[4]=5;
		System.out.println(arr[3]);
		//for loop assigning
        for(int i=0;i<arr.length;i++) {
        	arr[i]=i+1;
        	System.out.println(arr[i]);
        }
        //fetch by for each loop
        for(int num:arr) {
        	System.out.println(num);
        }
        //fetch by for loop
        Class Object=new Class();
        Object.SampleMethod();
        StringsAlpha obj=new StringsAlpha();
        obj.StringConcepts();
        
	}

}
class Class{
	void SampleMethod(){
	int[] a=new int[4];
	for(int i=0;i<a.length;i++) {
		a[i]=i+1;
    	System.out.println(a[i]);
    }
}}
class StringsAlpha{
	void StringConcepts() {
		char alpha='A';
		String[] str=new String[6];
		for(int i=0;i<str.length;i++) {
			str[i]=Character.toString(alpha);
			alpha++;
		}
		for(String alph:str) {
			System.out.println(alph);
		}
	}
}
