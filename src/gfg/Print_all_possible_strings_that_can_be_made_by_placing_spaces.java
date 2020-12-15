package gfg;

import java.util.Scanner;

public class Print_all_possible_strings_that_can_be_made_by_placing_spaces {
	 
	public static void print(String a, String decision_so_far)
	{
		if(a.length()==0)
		{
			System.out.println(decision_so_far);
			return;
		}
		if(decision_so_far.length()==0)
		{
			print(a.substring(1),decision_so_far+a.charAt(0));
			return;
		}
		
		print(a.substring(1),decision_so_far+a.charAt(0));
		print(a.substring(1), decision_so_far+" "+a.charAt(0));
		
	}
	public static void main(String[] args) {
	
		 Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0)
		{
			String a=s.next();
			print(a,"");
			t--;
		}
		 
	}
}
