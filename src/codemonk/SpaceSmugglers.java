package codemonk;

import java.util.HashMap;
import java.util.Scanner;

import lec3.array_use;

public class SpaceSmugglers {
	
	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int x=s.nextInt()-1;
		int y=s.nextInt()-1;
		
		int [][]a=new int[n][n];
		
//		System.out.println(a[3].length);
		
		
		for(int p=0;p<m;p++)
		{
			
			int u=s.nextInt();
			int v=s.nextInt();
			int g=s.nextInt();
			a[u-1][v-1]=g;
			
		}
		
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<a.length;j++)
//				System.out.print(a[i][j]+"\t");
//		System.out.println();
//		}
		HashMap<Integer,Boolean> visited=new HashMap<Integer, Boolean>();
		int d=fun(a,x,y,visited);
		System.out.println(d);
		
	}
	
	/*
 	5 9 1 2
	1 3 1
	1 5 5
	2 5 1
	3 1 10
	3 4 5
	4 2 1
	5 1 5
	5 3 100
	5 4 5
	*/

	public static int fun(int[][] a, int x, int y,HashMap<Integer,Boolean>visited) {
		
		if(a[x][y]!=0)
			return a[x][y];
		
		int i=x;
		int d=0;
		visited.put(i,true);
		for(int j=0;j<a[i].length;j++)
		{
			if(a[i][j]==0||visited.containsKey(j))
				continue;
			
//			visited.put(j, true);
			d=Math.max(d,fun(a, j, y, visited));
		}
		
		
		return d;
	}

}
