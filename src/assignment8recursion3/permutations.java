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
//		Scanner s=new Scanner(System.in);
//		String a=s.next();
//		String [] all_permutations= allPermutationsRecursive(a);
//		
//
//		for(int i=0;i<all_permutations.length;i++)
//		{
//			System.out.println(all_permutations[i]);
//		}
//		
////		Arrays.sort(all_permutations);
//		sort_2Dstring_lexicographically(all_permutations);
//		
//		for(int i=0;i<all_permutations.length;i++)
//		{
//			System.out.println(all_permutations[i]);
//		}
		ArrayList<Integer> x= new ArrayList<>();
		x.add(1);
		x.add(2);

		ArrayList<ArrayList<Integer>> ans= permute(x);
		System.out.println("done");
		for(int i=0;i<ans.size();i++) {
			for (int j = 0; j < ans.get(i).size(); j++) {
				System.out.println(ans.get(i).get(j));
			}
		}
//		x.add(1, 1);
//		printallPermutations(a, "");
		
//		printAllPermutationsWithDuplicates(a,0,a.length()-1);
	}

	public static void sort_2Dstring_lexicographically(String[] a )
	{
		for (int i = 0; i < a.length-1; i++)
			{
				for (int j = i+1; j < a.length; j++)
				{
					if(a[i].compareTo(a[j])>0)
					{
						String temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
	}

	private static String[] allPermutationsRecursive(String a) {
		// total time complexity is O(n*n!)
		if(a.length()<=1)
		{
			String[] output={a};
			return output;
		}
		
		String [] smallOutput= allPermutationsRecursive(a.substring(1));// this is called n times 
		String [] output=new String[smallOutput.length*(smallOutput[0].length()+1)];
		
		int k=0; // time complexity for each call is O(n*[(n-1)!])=O(n!)
		for(int i=0;i<smallOutput.length;i++)
		{	//the outer for loop will run (n-1)! times
			for(int j=0;j<smallOutput[i].length()+1;j++)
			{// inner for loop will run n times
				output[k]=smallOutput[i].substring(0,j)+a.charAt(0)+smallOutput[i].substring(j);
				k++;
			}
		}
		return output;
	}
	
	
	private static void printallPermutations(String a,String decisionSoFar) {
		//time complexity O(n!)
		if(a.length()<=0)
		{
			System.out.println(decisionSoFar);
			return ;
		}
		
		for(int i=0;i<decisionSoFar.length()+1;i++)
		{
			printallPermutations(a.substring(1), decisionSoFar.substring(0,i)+a.charAt(0)+decisionSoFar.substring(i));
		}

	}
	
	private static void printAllPermutationsWithDuplicates(String a, int l, int r) {
		//time complexity O(n!)
		if(l>=r) {
			System.out.println(a);
			return;
		}
		
		for (int i = l; i <= r; i++) {
			
				if(l==i)
					printAllPermutationsWithDuplicates(a, l+1, r);
				else if(a.charAt(i)!=a.charAt(l))
					printAllPermutationsWithDuplicates(a.substring(0,l)+a.charAt(i)+a.substring(l+1,i)+a.charAt(l)+a.substring(i+1),l+1, r);
	
		}
		
	}
	
    public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
        
    if(a.size()<=1){
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>(); 
        ans.add(a);
        return ans;
    }
    
    int curr = a.remove(0);
    ArrayList<ArrayList<Integer>> Tans = permute(a);
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    
    for(int i=0;i<Tans.size();i++){
        for(int j=0;j<Tans.get(i).size()+1;j++){
            ArrayList<Integer> temp =new ArrayList<Integer>(Tans.get(i));
        	ans.add(temp);
            ans.get(ans.size()-1).add(j,curr);
        }    
    }
    return ans;
}
	
}
