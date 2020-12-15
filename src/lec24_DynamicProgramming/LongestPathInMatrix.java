package lec24_DynamicProgramming;

import java.util.Scanner;

//http://www.geeksforgeeks.org/find-the-longest-path-in-a-matrix-with-given-constraints/
public class LongestPathInMatrix {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [][]a=new int[n][n];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j]=s.nextInt();
			}
		}
		
		int max_p=0;
		int[][]visited=new int[n][n];
		for (int j = 0; j < n; j++) {
			max_sum_path(a,n,0,j,visited);
			max_p=Math.max(max_p,visited[0][j]);
		}
		
		System.out.println(max_p);
	}

	private static void max_sum_path(int[][] a, int n,int i,int j,int[][] visited) {
		
		if(visited[i][j]==0)
		{
			int bottom_left=0,bottom_right=0,bottom=0;
			
			if(i+1<n && j-1>=0)
			{
				max_sum_path(a, n, i+1, j-1, visited);
				bottom_left=visited[i+1][j-1];
			}
			
			if(i+1<n && j+1<n)
			{
				max_sum_path(a, n, i+1, j+1, visited);
				bottom_right=visited[i+1][j+1];
			}
			
			if(i+1<n)
			{
				max_sum_path(a, n, i+1, j, visited);
				bottom=visited[i+1][j];
			}
			
			int max=Math.max(bottom,Math.max(bottom_left,bottom_right));
			visited[i][j]=max+a[i][j];
		}
	}

	
}
