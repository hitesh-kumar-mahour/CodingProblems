package assignment4array2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TripletSum {
	
//	https://www.geeksforgeeks.org/count-number-of-triplets-in-an-array-having-sum-in-the-range-a-b/
//	O(n^2)time, O(1)space
	public static int triplet_sum_range(int []a,int l,int r) {
		
		return triplet_sum_less(a,r+1) - triplet_sum_less(a, l);
	}
	
	
//	https://www.geeksforgeeks.org/count-triplets-with-sum-smaller-that-a-given-value/
//	O(n^2)time, O(1)space
	public static int triplet_sum_less(int []a,int val) {
		
		Arrays.sort(a);
		int count=0;
		
		for (int i = 0; i < a.length-2; i++) {
			int j=i+1,k=a.length-1;
			
			while(k>j) {
				
				long sum = a[i]+a[j]+a[k];
				
				if(sum<val) {
					count+=(k-j);
					j++;
				}
				else
					k--;
			}
		}
		
		return count;
	}
	
	
	
	public static int triplet_sum(int []a,long sum)
	{
		
		Arrays.sort(a);
		int count=0;
		
		for(int i=0;i<a.length-2;i++)
		{
			int j=i+1,k=a.length-1;
			
			while(k>j) {
				if(a[i]+a[j]+a[k]==sum) {
					count++;
					j++;
				}
				else {
					k--;
				}
			}
		}
		
		return count;
	}
	
	public static  int[]  takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("enter size ");
		int size = s.nextInt();
		int input[] = new int[size];
		for(int i = 0; i < size; i++){
			System.out.println("Enter "+i+" element");
			input[i] = s.nextInt();
		}
		return input;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> m =new HashMap<Integer, Integer>();
		Integer i=m.get(-1);
		
//		int[] a={2, 7, 5, 3, 8, 4, 1, 9};
//		triplet_sum(a,sum);
//		System.out.println(triplet_sum_less(a, 8));
//		System.out.println(triplet_sum_range(a, 8, 16));
		
	}

}
