package assignment15heaps;

import java.util.Scanner;

import lec21_PriorityQ.MinHeap;

public class Sort_k_sortedArraylists {

	public static void main(String[] args) throws Exception {
		
MinHeap<Integer> heap=new MinHeap<>();

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
	 heap.insert(arr[i][j],arr[i][j]);
	 }
	
 }
 
 for(int i=0;i<arr.length;i++)
 {
	 for(int j=0;j<arr[i].length;j++)
	 {
		 System.out.print(heap.remove()+" ");
	 }
 }
 //4 5 1 2 3 8 14 4 5 9 16 17 3 0 6 10 3 4 18 22
}

}
