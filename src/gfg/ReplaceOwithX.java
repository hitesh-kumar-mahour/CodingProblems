package gfg;

import java.util.Scanner;

public class ReplaceOwithX {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(;t>0;t--)
	  {		
		int n=s.nextInt();
		int m=s.nextInt();
		boolean[][] a=new boolean[n][m];
		boolean[][] b=new boolean[n][m];
	
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < m; j++)
			{
				if(s.next().charAt(0)=='X')
					a[i][j]=true;
				else
					a[i][j]=false;
			}
		}
		
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < m; j++)
			{
				fun(i,j,a,b,n,m);
				if(a[i][j])
				System.out.print("X ");
				else
					System.out.print("O ");
			}
			System.out.println();
		}
	  }
	}

	private static boolean fun(int i, int j, boolean[][] a, boolean[][] b, int n, int m) {
		
		if(i<0 || i>=n || j<0 || j>=m)
			return false;
		
		if(a[i][j]==true)
			return true;
		
		if(b[i][j]==true)
		{
			if(i==0 || j==0 || i==n-1 || j==m-1)
				return false;
			else 
				return true;
		}
		
		if(b[i][j]==false)
		{
			b[i][j]=true;
			
			if(i==0 || j==0 || i==n-1 || j==m-1)
				return false;
			
			if(fun(i, j+1, a, b, n, m)&&fun(i+1, j, a, b, n, m)&&fun(i, j-1, a, b, n, m)&&fun(i-1, j, a, b, n, m)) 
			{
				a[i][j]=true;
				return true;
			}
		}
		
		
		return false;
	}
	/*
 	2
	6
	6
	X O X X X X
	X O X X O X
	X X X O O X
	O X X X X X
	X X X O X O
	O O X O O O
	
	4 7
	O O O O X X O
	O X O X O O X 
	X X X X O X O 
	O X X X O O O 	
	*/
}
