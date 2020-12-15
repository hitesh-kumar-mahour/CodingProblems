package gfg;

import java.util.HashMap;
import java.util.Scanner;

public class DecimalToRoman {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		System.out.println(covert_to_roman(n));
	}

	private static String covert_to_roman(int n) {
		
		HashMap<Integer,String> map=new HashMap<Integer, String>();
		map.put(1,"I");
		map.put(4,"IV");
		map.put(5,"V");
		map.put(9,"IX");
		map.put(10,"X");
		map.put(40,"XL");
		map.put(50,"L");
		map.put(90,"XC");
		map.put(100,"C");
		map.put(400,"CD");
		map.put(500,"D");
		map.put(900,"CM");
		map.put(1000,"M");
		
		String ans="";
		
		for (int i=1;n!=0;i=i*10,n=n/10)
		{
			int x=n%10;
			
			if(x==0)
			continue;
			
			else if(map.containsKey(x*i))
			 ans=map.get(x*i)+ans;
			
			else if(x<4)
				for(int j=0;j<x;j++)
					ans=map.get(i)+ans;
			else{
				for(int j=0;j<x-5;j++)
					ans=map.get(i)+ans;
				
				ans=map.get(5*i)+ans;
			}
		}
		
		
		return ans;
	}
}
