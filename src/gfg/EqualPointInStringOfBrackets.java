package gfg;
//http://www.geeksforgeeks.org/find-equal-point-string-brackets/
import java.util.Scanner;

public class EqualPointInStringOfBrackets {

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int t=s.nextInt();
			while(t>0)
			{
				String a=s.next();
				int n=find_index(a);
				System.out.println(n);
				t--;
			}
		}

		private static int find_index(String a) {

			int closing=0,opening=0;
			
			for (int i = 0; i < a.length(); i++)
				if(a.charAt(i)==')')
					closing++;
			for (int i = 0; i < a.length(); i++)
			{
				if(closing==opening)
					return i;
				else{
					 if(a.charAt(i)=='(')
						 opening++;
					 else closing--;
				}
			}
		
			if(opening==closing)
				return a.length();
			
			return -1;
		}
}
