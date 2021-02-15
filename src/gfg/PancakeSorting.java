package gfg;

import java.util.Arrays;

public class PancakeSorting {
	
//	https://www.youtube.com/watch?v=AFtXLUn_TZg&ab_channel=KnowledgeCenter
	
	private static void reverse(int [] a, int k){
		if(k>=a.length)
			return;
		
		for(int i=0;i<=k/2;i++) {
			int c = a[i];
			a[i]=a[k-i];
			a[k-i]=c;
		}
	}
	
	private static void pancakeSort(int []a, int n) {
		if(n==0)
			return;
		int max_i=0;
		for(int i=0;i<=n;i++) {
			if(a[i]>a[max_i])
				max_i=i;
		}
		
		reverse(a, max_i);
		reverse(a, n);
		pancakeSort(a, n-1);
	}
	
	public static void main(String[] args) {
		int [] a = {6,5,4,3,2,1};
		pancakeSort(a, a.length-1);
		System.out.println(Arrays.toString(a));
	}
}
