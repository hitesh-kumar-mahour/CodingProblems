package lec24_DynamicProgramming;

public class EditDistance {
//	http://www.geeksforgeeks.org/dynamic-programming-set-5-edit-distance/
	public static int editDistance_usingDP(String s,String t,int i,int j,int[][]visited)
	{
//		time complexity O(s.length*t.length)
//		space complexity O(s.length*t.length)
		if(i<0)
		 return j+1;
		
	    if(j<0)
		 return i+1;
			
	    if(visited[i][j]!=-1)
	    	return visited[i][j];
			
		if(s.charAt(i)==t.charAt(j))
			{
			visited[i][j]=editDistance_usingDP(s, t, i-1, j-1,visited);
			return visited[i][j];
			}
		
		int insert=0,remove=0,replace=0;
			insert=editDistance_usingDP(s, t, i, j-1,visited);
			remove=editDistance_usingDP(s, t, i-1, j,visited);		
			replace=editDistance_usingDP(s, t, i-1, j-1,visited);
		
			visited[i][j]=Math.min(Math.min(insert, replace),remove)+1;
		return visited[i][j];
	}
	
	public static int editDistance_withoutDP(String s,String t,int i,int j)
	{
//		time complexity O(3^s.length)
//		space complexity O(1)
		if(i<0)
		 return j+1;
		
	    if(j<0)
		 return i+1;
			
			
		if(s.charAt(i)==t.charAt(j))
			return editDistance_withoutDP(s, t, i-1, j-1);
		
		int insert=0,remove=0,replace=0;
			insert=editDistance_withoutDP(s, t, i, j-1);
			remove=editDistance_withoutDP(s, t, i-1, j);		
			replace=editDistance_withoutDP(s, t, i-1, j-1);
		
		return Math.min(Math.min(insert, replace),remove)+1;
	}
	
	public static void main(String[] args) {
		
		String s="sunday";
		String t="saturday";
		System.out.println(editDistance_withoutDP(s, t,s.length()-1,t.length()-1));
		
		int[][]visited=new int[s.length()][t.length()];
		for (int i = 0; i < visited.length; i++) {
			for (int j = 0; j < visited[i].length; j++) {
				visited[i][j]=-1;
			}
		}
	
		System.out.println("using DP"+" "+editDistance_usingDP(s, t, s.length()-1, t.length()-1, visited));
				
	}
	
}
