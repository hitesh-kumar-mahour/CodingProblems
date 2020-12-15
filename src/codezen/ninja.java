package codezen;

import java.util.Scanner;

public class ninja {

	public static int subArray(int arr[], int n)
	{
		int finalsum=0;
	    // Pick starting point
	    for (int i=0; i <n; i++)
	    {
	        // Pick ending point
	        for (int j=i; j<n; j++)
	        {
	        	int sum=0;
	            // Print subarray between current starting
	            // and ending points
	            for (int k=i; k<=j; k++)
	                {
	            		sum+=arr[k];
	                }
	            finalsum+=T(sum);
	        }
	    }
	    return finalsum;
	}
	

	
	public static int T(int n)
	{
		if(n<3)
			return n;
		
		return (2*T(n-1)+3*T(n-3));
	}
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
//		System.out.println(T(s.nextInt()));
		int size=s.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
			a[i]=s.nextInt();
		
		
		System.out.println(subArray(a, size));
	}
}
