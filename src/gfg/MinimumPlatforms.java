package gfg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Time{
	int time;
	boolean type;//true for arrival //false for departure
	
	public Time(int time,boolean type) {
		this.time=time;
		this.type=type;
	}
}

class TimeComp implements Comparator<Time>{
	 
    @Override
    public int compare(Time t1,Time t2) {
        if(t1.time < t2.time){
            return -1;
        } 
        else if(t1.time > t2.time) {
            return 1;
        }
        else{
            if(t1.type) return 1;
            else return -1;
        }
    }
}
public class MinimumPlatforms {

	public static int platforms(int[]a,int[]b)
	{
		
		ArrayList<Time> list=new ArrayList<Time>();
		
		for(int i=0;i<a.length;i++)
		list.add(new Time(a[i], true));
		
		for (int i = 0; i < b.length; i++)
			list.add(new Time(b[i],false));
	
		Collections.sort(list, new TimeComp());

//		for(Time t:list)
//		{
//			System.out.println(t.time+" "+t.type);
//		}
		
		int count=0;
		int max=0;
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).type) count++;			//arrival
			else count--;							//departure
			max=Math.max(count, max);
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(;t>0;t--){
		int n=s.nextInt();
		int [] a=new int[n];
		int[]b=new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			b[i]=s.nextInt();
		}
		
		System.out.println(platforms(a,b));
	
		}
	}
/*
	6
	940 950 900 1100 1800 1500
	1200 1120 910 2030 2000 1900
*/
}
