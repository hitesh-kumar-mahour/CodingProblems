package gfg;

import java.util.Arrays;
import java.util.Scanner;

public class KMPPatternSearching {

//	https://www.youtube.com/watch?v=V5-7GzOfADQ&t
//	https://www.youtube.com/watch?v=GTJr8OvyEVQ

	
	
	// time complexity O(n), space complexity O(n)
	private static int[] longest_prefix_suffix(String s) {
	
		if(s==null || s.length()<2) {
			int[]a = {0};
			return a;
		}
		
		int[] a = new int[s.length()];
		
		for(int j=0,i=1;i<a.length;) {
			if(s.charAt(i)==s.charAt(j)) {
				a[i]=j+1;
				j++;
			}
			else {
				j=0;
			}
			i++;					
		}
		return a;
	}

	// time complexity O(n+m), space complexity O(m)
	private static int kmp_pattern_search(String a, String b) {
		int index=-1;
		
		int[]lps=longest_prefix_suffix(b);
		System.out.println(Arrays.toString(lps));		
		
		int i=0,j=0;
		for (; i<a.length() && j<b.length() ;) {
				
			if(a.charAt(i)==b.charAt(j)) {
				i++;
				j++;
			}
			else {
				if(j==0) {
					i++;
				}
				else {
					j=lps[j-1];
				}
			}
		}
		
		if(j==b.length())
			index=i-j;
		
		return index;
	}
	
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		//System.out.print("Enter Text : ");
		String a=s.next();
		//System.out.print("Enter Pattern : ");
		String b=s.next();
		int index = kmp_pattern_search(a,b);
		System.out.println(index);
		
	}
	
//abxabcabcaby
//abcaby
}





