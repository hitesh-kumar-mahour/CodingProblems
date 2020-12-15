package gfg;

import java.util.Scanner;

public class FindWhetherPathExist {

public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();//rows
		int m=s.nextInt();//cols
		int[][]a =new int[n][m];
		
		int source_i=-1,source_j=-1;
		
		for (int i = 0; i < a.length; i++) 
			for (int j = 0; j < a[i].length; j++) 
				{
					a[i][j]=s.nextInt();
					if(a[i][j]==1)
					{
						source_i=i;
						source_j=j;
					}
				}
			
		boolean [][]visited=new boolean[n][m];
		System.out.println(if_path(source_i,source_j,a,visited, n, m));
	
	}

	private static boolean if_path(int i, int j, int[][] a,boolean[][] visited, int n, int m) {
		
		if(i>=0 && i<n && j>=0 && j< m && a[i][j]!=0 && !visited[i][j])
		{
			visited[i][j]=true;
			
			if(a[i][j]==2)
				return true;
			
			return (if_path(i-1, j, a, visited, n, m)||
					if_path(i+1, j, a, visited, n, m)||
					if_path(i, j-1, a, visited, n, m)||
					if_path(i, j+1, a, visited, n, m)); 
		}
		else
			return false;
	}
}
