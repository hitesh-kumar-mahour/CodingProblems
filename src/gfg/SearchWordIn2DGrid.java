package gfg;

import java.util.Scanner;

public class SearchWordIn2DGrid {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	
		String[] a= {"geeksforgeeks","geeksquizgeek","ideqapractice"};
		String b="xyz";
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			for (int j = 0; j < a[i].length(); j++) {
				if(fun(a,i,j,b,0,1))
				{
					flag=true;
					System.out.println(i+", "+j);
				}
				else if(fun(a,i,j,b,0,2))
					{
					flag=true;
					System.out.println(i+", "+j);
					}
				else if(fun(a,i,j,b,0,3))
					{
					flag=true;
					System.out.println(i+", "+j);
					}
				else if(fun(a,i,j,b,0,4))
					{
					flag=true;
					System.out.println(i+", "+j);
					}
				else if(fun(a,i,j,b,0,5))
					{
					flag=true;
					System.out.println(i+", "+j);
					}
				else if(fun(a,i,j,b,0,6))
					{
					flag=true;
					System.out.println(i+", "+j);
					}
				else if(fun(a,i,j,b,0,7))
					{
					flag=true;
					System.out.println(i+", "+j);
					}
				else if(fun(a,i,j,b,0,8))
					{
					flag=true;
					System.out.println(i+", "+j);
					}
			
			}
			
		}
		
		if(flag==false)System.out.println(-1);
		
	}

	private static boolean fun(String[] a, int i, int j, String b, int x,int direc) {
	
		if(i<0||j<0||i>=a.length||j>=a[0].length())
			return false;
		
		if(a[i].charAt(j)!=b.charAt(x))
			return false;

		if(x==b.length()-1)
			return true;
		
		return direc==1&&fun(a, i, j+1, b, x+1, 1) ||
			   direc==2&&fun(a, i+1, j+1, b, x+1,2) ||
			   direc==3&&fun(a, i+1, j, b, x+1, 3) ||
			   direc==4&&fun(a, i+1, j-1, b, x+1, 4) ||
			   direc==5&&fun(a, i, j-1, b, x+1, 5) ||
			   direc==6&&fun(a, i-1, j-1, b, x+1, 6) ||
			   direc==7&&fun(a, i-1, j, b, x+1, 7) ||
			   direc==8&&fun(a, i-1, j+1, b, x+1, 8) ;			

	}
}
