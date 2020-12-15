package gfg;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FirstNonRepeatingCharacterInStream {
//	http://www.geeksforgeeks.org/find-first-non-repeating-character-stream-characters/
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int t=s.nextInt();
		for(;t>0;t--)
		{
			int n=s.nextInt();
			
			HashMap<Character,Integer> map=new HashMap<>();
			Queue<Character> q=new LinkedList<Character>();
			for(;n>0;n--)
			{
				char ch=s.next().charAt(0);
				
				if(!map.containsKey(ch))
				{
					map.put(ch,1);
					q.add(ch);
				}
				else{
					if(!q.isEmpty())
						q.remove(ch);
				}
				
				
				if(q.isEmpty())			
					System.out.print(-1+" ");
				else
					System.out.print(q.peek()+" ");
				 
			}
			System.out.println();	
		}
		
	}
}
