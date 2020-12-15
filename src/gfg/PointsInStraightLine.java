package gfg;

import java.util.HashMap;
import java.util.Scanner;
//http://www.geeksforgeeks.org/count-maximum-points-on-same-line/
public class PointsInStraightLine {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0)
		{
			int points=s.nextInt();
			int[][] a =new int[points][2];
//			first input x cordinate of all points
			for(int i=0;i<points;i++)
				a[i][0]=s.nextInt();
//			now input y cordinate of all points
			for(int i=0;i<points;i++)
				a[i][1]=s.nextInt();
		
			int count=st_line(a);
			System.out.println(count);
			t--;
		}
	}

	private static int st_line(int[][] a) {
		
		int count=0;
		HashMap<Float,Integer> map=new HashMap<>();
		for(int i=0;i<a.length-1;i++)
		{
			HashMap<Float,Boolean> map_curr=new HashMap<>();//for storing slopes or current iteration

			for(int j=i+1;j<a.length;j++)
			{
				
				float slope;
				
				if(a[i][0]-a[j][0]==0)
					slope =Float.MAX_VALUE;
				
				else slope=(float)(a[i][1]-a[j][1])/(a[i][0]-a[j][0]);
				
				if(map_curr.containsKey(slope))
					continue;
				else map_curr.put(slope,true);
				
				if(map.containsKey(slope))
				{
					int freq=map.get(slope);
					map.put(slope,freq+1);
					count=Math.max(count,freq+1);
				}
				else
				{
					map.put(slope,1);
					count=Math.max(count, 1);
				}
			}
		}
		
		return count+1;
	}
}
