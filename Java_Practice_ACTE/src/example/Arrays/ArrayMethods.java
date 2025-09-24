package example.Arrays;
import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		int[] arr=new int[5];
		arr[0]=20;
		arr[1]=8;
		arr[2]=4;
		arr[3]=15;
		arr[4]=7;
		//toString
		System.out.println(Arrays.toString(arr));
		
		//Sort
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//BINARY SEARCH
		int val=Arrays.binarySearch(arr,8);
		System.out.println(val);
		
		//EQUALS
		int[] arr2= {2,6,4,3,4};
		if(Arrays.equals(arr, arr2)) {
			System.out.println("equal");
		}else {System.out.println("not equal");
		}
		
		//FILL
		int[] arr3=new int[5];
		Arrays.fill(arr3, 4);
		System.out.println(Arrays.toString(arr3));
		
		//COPY OF
		int[] copy=Arrays.copyOf(arr2,6);
		System.out.println(Arrays.toString(copy));
		
		//COPY OF RANGE
	    int[] copyofRange=Arrays.copyOfRange(copy, 2, 4);
	    System.out.println(Arrays.toString(copyofRange));
	    
	    // 2 DIMENSIONAL ARRAY
	    //DEEP TO STRING
	    int[][] value= {{1,2,3},{4,5}};
	    System.out.println(Arrays.deepToString(value));
	    
	    //DEEP EQUALS
	    int[][] val2= {{1,2,3},{4,5}};
	    System.out.println(Arrays.deepEquals(value, val2));
	}
}
