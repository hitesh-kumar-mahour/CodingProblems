package gfg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

//http://www.geeksforgeeks.org/find-all-strings-that-match-specific-pattern-in-a-dictionary/
public class MatchSpecificPattern {

	public static void main(String[] args) {
		
		ArrayList<String> dict=new ArrayList<>();
		dict.add("abb");
		dict.add("abc");
		dict.add("xyz");
		dict.add("xyy");
		
//		abb abc  xyz xyy
		String pattern="mno";
		
		ArrayList<String> ans =new ArrayList<String>();
		
		for (int i = 0; i < dict.size(); i++)
		{
			if(dict.get(i).length()!=pattern.length())
				continue;
			
			int j; 
			HashMap<Character, Character> map=new HashMap<>();
			
			for ( j = 0; j < dict.get(i).length(); j++)
			{
				if(!map.containsKey(pattern.charAt(j))&& !map.containsKey(dict.get(i).charAt(j)))
				{
					map.put(pattern.charAt(j), dict.get(i).charAt(j));
					map.put(dict.get(i).charAt(j), pattern.charAt(j));
					
				}
				else if(map.containsKey(pattern.charAt(j))&& map.containsKey(dict.get(i).charAt(j)))
				{
					if(map.get(pattern.charAt(j))==dict.get(i).charAt(j) && map.get(dict.get(i).charAt(j))==pattern.charAt(j))
						continue;
					else break;
				}
				else break;
			}
			
			if(j==dict.get(i).length())
				ans.add(dict.get(i));
		}
		
		for (int i = 0; i < ans.size(); i++) {
			System.out.println(ans.get(i));
			
		}
	}
}
