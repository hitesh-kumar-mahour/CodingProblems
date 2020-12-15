package assignment8recursion3;

import java.util.Scanner;

public class StairSteps {

	public static int count_ways(int n, int[] visited) {
		//time complexity is o(n)
		//space complexity is o(n+1)=O(n)		
				if(n<=2)
					return n;
				if(n==3)
					return 4;
				if(visited[n]!=0)
					return visited[n];
				else
				{
					int ans = (count_ways(n-1, visited)+count_ways(n-2, visited)+count_ways(n-3, visited));
					visited[n]=ans;
					return ans;
				}
			}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(count_ways(n,new int[n+1]));
	}

	
}
