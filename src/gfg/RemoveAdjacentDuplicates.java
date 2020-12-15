package gfg;

import java.util.Scanner;

public class RemoveAdjacentDuplicates {

    public static StringBuffer fun(StringBuffer a){
        if(a.length()<2) 
            return a;
        
        // replacing adjacent dupli with '~'
        for(int i=0;i<a.length()-1;)
        {
            int j=i+1;
           
            for(;j<a.length() && a.charAt(i)==a.charAt(j);j++)
                a.setCharAt(j,'~');
           
            if(j!=i+1)
                a.setCharAt(i,'~');
           
            i=j;
        }
        
        // creating new string without adjacent duplicates
        StringBuffer b = new StringBuffer();
        for(int i=0;i<a.length();i++)
            if(a.charAt(i)!='~')
                b.append(a.charAt(i));
        
        // return self if unchanged
        if(a.toString().equals(b.toString()))
            return b;
        
        // remove adjacent dupli recursively 
        return fun(b);
        
    }
    
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		for(int t=s.nextInt();t>0;t--){
		    StringBuffer a = new StringBuffer(s.next());
		    System.out.println(fun(a));
		}
	}
}
