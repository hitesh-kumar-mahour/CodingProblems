package gfg;

import java.util.HashMap;
import java.util.Scanner;
//http://www.geeksforgeeks.org/converting-roman-numerals-decimal-lying-1-3999/
public class RomanNumberToInteger {
	 
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 int t= s.nextInt();
		 while(t>0)
		 {
			 String a=s.next();
			 System.out.println(convert_to_int(a));
			 t--;
		 }
	}

	private static int convert_to_int(String a) {
		
		HashMap<Character,Integer>map=new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int n=0;
		for(int i=0;i<a.length();)
		{
			int temp=map.get(a.charAt(i));
			
			if((i+1)<a.length() && map.get(a.charAt(i+1))>temp)
			{
				temp=map.get(a.charAt(i+1))-temp;
				i=i+2;
			}
			else i++;
			
			n+=temp;
		}
		
		return n;
	}
}
