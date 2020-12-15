package lec5_string_2Darray;

import java.util.Scanner;

public class input2DwithDifferentLength {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter no.of rows");
		int k=	s.nextInt();
		 int [][]arr=new int[k][];
		 
		 for(int i=0;i<k;i++)
		 {
			 System.out.println("enter length of array"+i);
			 int n=s.nextInt();
			 arr[i]=new int[n];
			 
			 for(int j=0;j<n;j++){
			System.out.println("enter element "+j);
				 arr[i][j]=s.nextInt();
			 
			 }
			
		 }
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=0;j<arr[i].length;j++)
			 {
				 System.out.print(arr[i][j]);
			 }
			 System.out.println();
		 }
		 
		}
}
