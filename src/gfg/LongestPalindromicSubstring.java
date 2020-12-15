package gfg;

import java.util.Scanner;

public class LongestPalindromicSubstring {

	private static String fun(String s) {
		
        int maxLength = 1;  // The result (length of LPS)
        int p=0,q=0;
        
        int len = s.length();
     
        int low, high;
     
        // One by one consider every character as center point of 
        // even and length palindromes
        for (int i = 1; i < len; ++i)
        {
            // Find the longest even length palindrome with center points
            // as i-1 and i.  
            low = i - 1;
            high = i;
            while (low >= 0 && high < len && s.charAt(low) == s.charAt(high))
            {
                if (high - low + 1 > maxLength)
                {
                    maxLength = high - low + 1;
                    p=low;q=high;
                }
                --low;
                ++high;
            }
     
            // Find the longest odd length palindrome with center 
            // point as i
            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < len && s.charAt(low) == s.charAt(high))
            {
                if (high - low + 1 > maxLength)
                {
                    maxLength = high - low + 1;
                    p=low;q=high;
                }
                --low;
                ++high;
            }
        }
        
        return s.substring(p,q+1);
	}
	
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(;t>0;t--)
		{
		    String st=s.next();
		    fun(st);
		    
		}
	}
}
