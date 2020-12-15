package codemonk;

import java.util.ArrayList;
import java.util.Scanner;

class Pair{
	int start;
	int end;
	
	Pair(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
}
public class BennyAndSegments {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int x=0;x<t;x++)
		{
			int n=s.nextInt();
			int l=s.nextInt();
			
			ArrayList<Pair> list=new ArrayList<>();
			for(int i=0;i<n;i++)
			{
				int start=s.nextInt();
				int end=s.nextInt();
				Pair p=new Pair(start,end);
				list.add(p);
			}
			
			sort_list(list);
			Pair empty=null;
			boolean ans=road(list,0,empty,l);
			if(ans)
			System.out.println("Yes");
			else
				System.out.println("No");
	
		}
		
	}

	private static void sort_list(ArrayList<Pair> list) {
		
		for(int i=0;i<list.size()-1;i++)
		{
			for(int j=0;j<list.size()-i-1;j++)
				if(list.get(j+1).start<list.get(j).start) /* for making decending use a[i]< a[j]  */
	            {
	                int x=list.get(j+1).start;
	                int y=list.get(j+1).end;
	                list.get(j+1).start=list.get(j).start;
	                list.get(j+1).end=list.get(j).end;
	                list.get(j).start=x;
	                list.get(j).end=y;
	            }
		}
	}

	private static boolean road(ArrayList<Pair> list,int list_beg, Pair p, int length) {
		
		Pair temp;
		if(p==null){
			 temp=null;}
		else{
			 temp=new Pair(p.start, p.end);}
		if(p!=null)
		{
			int diff=(temp.end - temp.start);
			if(diff==length)
				return true;
			
			if(diff>length)
			 return false;
		}
			if(list_beg>=list.size())
				return false;
			
			Pair pr=list.get(list_beg);
			
		if(p!=null)	
		{	
			if(temp.end<pr.start)//discontinuous road
				return false;
		}	
		
			boolean ans1=road(list, list_beg+1,temp, length);
			if(ans1)
				return true;
		if(p!=null){	
			temp.start=Math.min(temp.start, pr.start);
			temp.end=Math.max(temp.end,pr.end);
		}
		else 
			temp=new Pair(pr.start, pr.end);
			
			boolean ans2=road(list, list_beg+1,temp, length);
			return ans2;
			
	}
	
	
}
