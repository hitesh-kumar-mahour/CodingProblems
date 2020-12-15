package gfg;

import java.util.HashMap;
import java.util.Scanner;

public class NumberToWords {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(;t>0;t--)
		{
			int n=s.nextInt();
			System.out.println(convert(n));
		}
	}

	private static String convert(int n) {
		HashMap<Integer,String>map=new HashMap<Integer, String>();
		map.put(0,"");
		map.put(1,"one ");
		map.put(2,"two ");
		map.put(3,"three "); 
		map.put(4,"four ");
		map.put(5,"five ");
		map.put(6,"six ");
		map.put(7,"seven ");
		map.put(8,"eight ");
		map.put(9,"nine ");
		map.put(10,"ten ");
		map.put(11,"eleven ");
		map.put(12,"twelve ");
		map.put(13,"thirteen ");
		map.put(14,"forteen ");
		map.put(15,"fifteen ");
		map.put(16,"sixteen ");
		map.put(17,"seventeen ");
		map.put(18,"eighteen ");
		map.put(19,"nineteen ");
		map.put(20,"twenty ");
		map.put(30,"thirty ");
		map.put(40,"forty ");
		map.put(50,"fifty ");
		map.put(60,"sixty ");
		map.put(70,"seventy ");
		map.put(80,"eighty ");
		map.put(90,"ninety ");

		
		String a="";
		int x=n;
		
		if(map.containsKey(x%100))
		{
			a=map.get(x%100)+a;
			x=x/100;
		}
		else
		{
			a=map.get(x%10)+a;
			x=x/10;
			a=map.get(x%10 *10)+a;
			x=x/10;
		}
		
		if(x==0)
			return a;
		
		if(a.length()!=0)
			a="and "+a;
		
		if(x%10!=0)
		{
			a=map.get(x%10)+"hundred "+a;
		}
		
		x=x/10;
		
		if(x==0)
			return a;
		
		if(x%10!=0)
		{
			a=map.get(x%10)+"thousand "+a;
		}
		
		return a;
	}
}
