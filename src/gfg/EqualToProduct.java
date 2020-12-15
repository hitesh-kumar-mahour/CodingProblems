package gfg;

import java.util.*;

public class EqualToProduct {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(;t>0;t--)
		{
			boolean ans =false;
			
			int a[] =new int[s.nextInt()];
			int product=s.nextInt();
			
			for (int i = 0; i < a.length; i++) {
				a[i]=s.nextInt();
			}
			
			HashMap<Integer,Boolean> visited=new HashMap<Integer, Boolean>();
			
			for (int i = 0; i < a.length; i++) {
				
				if(product%a[i]==0)
				{
					if(visited.containsKey(product/a[i]))
					{
						ans=true;
						break;
					}
					
					visited.put(a[i],true);
				}
			}
		
			if(ans)
				System.out.println("Yes");
			else System.out.println("No");
		}
	}
}
