package assignment8recursion3;

import java.util.Scanner;

public class Q6 {
	
	public static char int2alpha(int n) {
		
		char ch= (char)(n+96);
		return ch;
	}
	public static String[] combination(String a)
	{
		dwkfbskfdslknfs
		if(a.length()<=0)
		{
			String output[]={""};
			return output;
		}
		String smalloutput1[]=combination(a.substring(1));
		char ch1=int2alpha(a.charAt(0)-'0');
		
		String smalloutput2[]={""};
		char ch2=' ';
		
		if(a.length()>=2)
		{
			smalloutput2 = combination(a.substring(2));
			ch2=int2alpha((a.charAt(0)-'0')*10+(a.charAt(1)-'0'));
		}
		
		String output[]=new String[smalloutput1.length+smalloutput2.length];
		for(int i=0;i<smalloutput1.length;i++)
		{
			output[i]=ch1+smalloutput1[i];
		}
		for(int i=smalloutput1.length;i<output.length;i++)
		{
			output[i]=ch2+smalloutput2[i];
		}
		return output;
	}
	
	public static void print_combi(String a, String decision_so_far)
	{
		if(a.length()<=0)
		{
			System.out.println(decision_so_far);
			return;
		}
		
		if(a.length()==1)
		{
			decision_so_far=decision_so_far+int2alpha(a.charAt(0)-'0');
			System.out.println(decision_so_far);
			return;
		}
		
		print_combi(a.substring(1), decision_so_far+int2alpha(a.charAt(0)-'0'));
		
		if(int2alpha((a.charAt(0)-'0')*10+(a.charAt(1)-'0'))<='z')
		{
			print_combi(a.substring(2), decision_so_far+int2alpha((a.charAt(0)-'0')*10+(a.charAt(1)-'0')));
		}
		
		
	}
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter no.");
		String a=s.next();
//		String[] c=combination(a);
//		int n=s.nextInt();
//		System.out.println(int2alpha(n));
//		for(int i=0;i<c.length;i++)
//			System.out.println(c[i]);
	print_combi(a, "");
	}
	
}
