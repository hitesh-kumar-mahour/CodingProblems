package gfg;

import java.util.*;
import java.lang.*;
import java.io.*;

// same code sometimes give TLE and sometimes got accepted. Strange!!!

public class KthSmallest {
    
    public static int singleRead(BufferedReader reader) throws Exception {
        String str = reader.readLine();
        str = str.trim();
        return Integer.parseInt(str);
    }
    
    public static int[] multiRead(BufferedReader reader) throws Exception {
        String str = reader.readLine();
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        String[] x = str.split(" ");
        int N = x.length;
        int[] arr = new int[N];
        for (int i=0;i<N;i++) {
            arr[i] = Integer.parseInt(x[i]);
        }
        return arr;
    }
 
	public static int partition(int[]input,int beg,int end)
	{
		int pivotpos=beg;
		for(int i=beg+1;i<=end;i++)
		{
			if(input[i]<=input[beg])
			{
				pivotpos++;
				continue;
			}
		}
		
		int temp=input[pivotpos];
			input[pivotpos]=input[beg];
			input[beg]=temp;
		
		for(int i=beg,j=end;i<pivotpos&&j>pivotpos;)
		{
			if(input[i]<=input[pivotpos])
			{
				i++;
				continue;
			}
			if(input[j]>input[pivotpos])
			{
				j--;
				continue;
			}
			else
			{
			temp=input[i];
			input[i]=input[j];
			input[j]=temp;
			}
		}		

		return pivotpos;
	}
    
    public static int kSmallestUsingQuickSort(int[]a,int beg,int end, int k) {
    	// Time avg O(n), worst(already sorted) O(n^2)
    	int pivot = partition(a, beg, end);
    	if(pivot==k-1)
    		return a[pivot];
    	if(pivot>k-1)
    		return kSmallestUsingQuickSort(a, beg, pivot-1, k);
    	else
    		return kSmallestUsingQuickSort(a, pivot+1, end, k);
    }
    
    public static int kSmallestUsingHeap(int[] a,int k){
        //Using max heap Time O(nlogk) Space O(k)
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
                
        for(int i=0;i<a.length;i++)
        {
            if(pq.size()<k) 
                pq.add(a[i]);
            else{
                if(pq.peek()>a[i])
                {
                    pq.remove();
                    pq.add(a[i]);
                }
            }
        }
        
        return pq.peek();
    }
    
	public static void main (String[] args) throws Exception
	 {
	    BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer =
                   new BufferedWriter(new OutputStreamWriter(System.out));
	    int T = singleRead(reader);
	    for(int t=0;t<T;t++) {
	        int n = singleRead(reader);
	        int[] a = multiRead(reader);
	        int k = singleRead(reader);
	        writer.write(kSmallestUsingHeap(a, k)+"\n"); 
//	        writer.write(kSmallestUsingQuickSort(a, 0, n-1, k) + "\n");
	        
	    }
	    writer.flush();
	    writer.close();
	 }
}