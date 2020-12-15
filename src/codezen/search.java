package codezen;

import java.util.ArrayList;

public class search {
public static ArrayList<Integer> nextGreaterElement(ArrayList<Integer> input) {
		
	ArrayList<Integer>output=new ArrayList<>();
		for(int i=0;i<input.size();i++)
		{
			int j;
			for( j=i+1;j<input.size();j++)
			{
				if(input.get(j)>input.get(i))
					output.add(input.get(j));
			}
			if(output.size()!=i+1)
				output.add(-1);
		}
		
		return output;
	}

	public static int binary_search(int []input,int start,int end,int val)
	{
	
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(input[mid]==val)
				return(mid);
			else if(input[mid]>val)
				end=mid-1;
			else
				start=mid+1;
		}
		return -1;
	}
	public static int searchInSortedRotatedArray(int[] input, int d, int element){
		
		int beg;
		int end;
		if(element<input[0])
		{
			 beg=input.length-d;
			 end=input.length-1;
		}
		else
		{
		beg=0;
		end=input.length-d-1;
		}
		int p=binary_search(input,beg,end,element);
		return p;
	}
}
