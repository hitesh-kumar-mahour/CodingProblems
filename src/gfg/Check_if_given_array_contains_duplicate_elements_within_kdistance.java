package gfg;

import java.util.HashMap;
import java.util.Scanner;

//http://www.geeksforgeeks.org/check-given-array-contains-duplicate-elements-within-k-distance/
public class Check_if_given_array_contains_duplicate_elements_within_kdistance {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0)
		{
			int k=s.nextInt();
			int size=s.nextInt();
			int[] a=new int[size];
			
			for (int i = 0; i < a.length; i++) {
				a[i]=s.nextInt();
			}
			
			boolean ans=check(a,k);
			System.out.println(ans);
			t--;
		}
		
	}

	private static boolean check(int[] a, int k) {
		HashMap<Integer,Boolean> map=new HashMap<>();
		
		for (int i = 0; i < a.length; i++) 
		{
			if(map.containsKey(a[i]))
				return true;
			
			map.put(a[i], true);
			
			if(i>=k)
				map.remove(a[i-k]);
		}
		
		return false;
	}
}
