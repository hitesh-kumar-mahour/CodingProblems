package lec6_recursion;

import java.util.Scanner;

public class integer_to_word {
	public static String covertToWord(int n)
	{
		if(n==0)
			return "";

		   
		int a=n%10;
		if(a==0)
			return covertToWord(n/10)+"zero ";
		else if(a==1)
			return covertToWord(n/10)+"one ";
		else if(a==2)
			return covertToWord(n/10)+"two ";
		else if(a==3)
			return covertToWord(n/10)+"three ";
		else if(a==4)
			return covertToWord(n/10)+"four ";
		else if(a==5)
			return covertToWord(n/10)+"five ";
		else if(a==6)
			return covertToWord(n/10)+"six ";
		else if(a==7)
			return covertToWord(n/10)+"seven ";
		else if(a==8)
			return covertToWord(n/10)+"eight ";
		else
			return covertToWord(n/10)+"nine ";
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("input integer");
		int n=s.nextInt();
		System.out.println(covertToWord(n));

	}

}
