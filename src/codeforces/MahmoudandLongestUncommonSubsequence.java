package codeforces;

import java.util.Scanner;

public class MahmoudandLongestUncommonSubsequence {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			String a=s.next();
			String b=s.next();
			int alen=a.length();
			int blen=b.length();
			if(alen>blen)
				System.out.println(alen);
			else if(blen>alen)
				System.out.println(blen);
			else
			{
				if(a.equals(b)){
					System.out.println("-1");
				}
				else
					System.out.println(alen);
			}

		
	}
}
