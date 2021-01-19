package assignment8recursion3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;


public class permutations {

	public static void main(String[] args) {


		ArrayList<Integer>x=new ArrayList<Integer>();x.add(1);x.add(3);x.add(2);x.add(2);x.add(1);x.add(3);x.add(3);
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		permutationsWithDuplicates(x,0,x.size()-1,ans);
		System.out.println(ans.size());
		
		
//		String a="acbbcac";
//		ArrayList<String>ans = new ArrayList<String>();
//		permutationsWithDuplicates(a,0,a.length()-1,ans);
//		System.out.println(ans.size());
		
	}
	
	//code doesn't work for duplicates
	private static void permutationsWithDuplicates(ArrayList<Integer> a,int l, int r,ArrayList<ArrayList<Integer>>ans) {
		//time complexity O(n!)
		if(l>=r) {
			System.out.println(a.toString());
			ans.add(a);
			return;
		}
		
		for (int i = l; i <= r; i++) {
			
			ArrayList<Integer>t=new ArrayList<Integer>();
			for(int x : a) t.add(x);
						
			if(l==i)
				permutationsWithDuplicates(a, l+1, r,ans);
			else /*if(a.get(i)!=a.get(l))*/ {
				//swap l and i
				int c = t.get(i); t.set(i, a.get(l)); t.set(l, c);
				permutationsWithDuplicates(t,l+1,r,ans);
			}
		}
		
	}
	
	//code doesn't work for duplicates
	private static void permutationsWithDuplicates(String a, int l, int r,ArrayList<String>ans) {
		//time complexity O(n!)
		if(l>=r) {
			System.out.println(a);
			ans.add(a);
			return;
		}
		
		for (int i = l; i <= r; i++) {
			
				if(l==i)
					permutationsWithDuplicates(a, l+1, r, ans);
				else// if(a.charAt(i)!=a.charAt(l))
					permutationsWithDuplicates(a.substring(0,l)+a.charAt(i)+a.substring(l+1,i)+a.charAt(l)+a.substring(i+1),l+1, r, ans);
		}
		
	}
	

	
}
