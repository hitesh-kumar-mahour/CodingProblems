package Test;

import java.util.ArrayList;
import java.util.Collection;

public class Q1 {

	
	public static int kthPermutation(int n, int k) {
		
		ArrayList<Integer>a=new ArrayList<Integer>();
		
		for(int i=1;i<=n;i++)
			a.add(i);
		
		ArrayList<ArrayList<Integer>> permutations = new ArrayList<ArrayList<Integer>>();
		allPermutations(0,a,permutations);
		
		for(ArrayList<Integer> x:permutations)
			System.out.println(x.toString());
		System.out.println(permutations.size());
		
		return 0;
		
		
	}		
		
//	[1,2,3]
//	[1,3,2]
//	[1,2,3]		
	private static void allPermutations(int n,ArrayList<Integer> a, ArrayList<ArrayList<Integer>> ans) {
		
		if(n>=a.size()) {
			ans.add(a);
			return ;
		}
		
		for(int i=n;i<a.size();i++) {
			
			ArrayList<Integer> t = new ArrayList<Integer>();
			for(int x:a)
				t.add(x);
			
			int c = t.get(i);
			t.set(i, t.get(n));
			t.set(n, c);
			

			allPermutations(n+1, t, ans);
				
			
		}
		
		
	}
	
	public static void main(String[] args) {
		kthPermutation(5, 1);
	}
}
