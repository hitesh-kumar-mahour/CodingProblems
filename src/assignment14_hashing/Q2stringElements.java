package assignment14_hashing;

import java.util.HashMap;
import java.util.Scanner;

public class Q2stringElements {

	public static boolean check(String a,int n)
	{
		HashMap<Character, Integer> map= new HashMap<>();
		
		for(int i=0;i<a.length();i++)
		{
			char c=a.charAt(i);
			if(!map.containsKey(c))
				map.put(c,1);
		}
		
		if(map.size()<=n)
			return true;
		
		return false;
	}
	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("input string and no.");
		String a=s.next();
		int n=s.nextInt();
		System.out.println(check(a,n));
		
		
	}

}
