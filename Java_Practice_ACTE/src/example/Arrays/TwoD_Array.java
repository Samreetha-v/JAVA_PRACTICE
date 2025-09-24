package example.Arrays;
import java.util.Scanner;
public class TwoD_Array {

	public static void main(String[] args) {
		int[][] num=new  int[2][3];
		num[0][0]=1;
		num[0][1]=2;
		num[0][2]=3;
		num[1][0]=4;
		num[1][1]=5;
		num[1][2]=6;
		System.out.println(num[0][0]);
		System.out.println(num[0][1]);
		System.out.println(num[0][2]);
		System.out.println(num[1][0]);
		System.out.println(num[1][1]);
		System.out.println(num[1][2]);
		//USING FOR LOOP ASSIGNING VALUES
		//BY SCANNER CLASS
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[2][3];	
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {		
				System.out.println("Enter the Element:");
				 arr[i][j]=sc.nextInt();		
			}	
		}for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
		System.out.println();
	}
		sc.close();

}}
