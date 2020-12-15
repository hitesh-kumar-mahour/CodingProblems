package gfg;

import java.util.HashMap;
import java.util.Scanner;

//http://www.geeksforgeeks.org/smallest-window-contains-characters-string/
public class SmallestDistinctWindow {

	public static int find(String a)
	{
		HashMap<Character,Integer> map=new HashMap<Character, Integer>();
		
		for(int i=0;i<a.length();i++)
			map.put(a.charAt(i), 1);
		
		int count=map.size();
		
		int min=Integer.MAX_VALUE;
				
		for(int i=0;i<a.length();i++)
		{
			HashMap<Character,Boolean> map2=new HashMap<>();
			for (int j = i; j < a.length(); j++)
			{
				map2.put(a.charAt(j), true);
				
				if(map2.size()==count)
				{
					min=Math.min(min,j-i+1);
					break;
				}
			}
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int t=s.nextInt();
		for(;t>0;t--)
		{
			String a=s.next();
			int ans=find(a);
			System.out.println(ans);
		}
	}
}
