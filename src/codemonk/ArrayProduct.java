package codemonk;

import java.util.Scanner;

public class ArrayProduct {
	
	
	
	public static  int[]  takeInput(){
		Scanner s = new Scanner(System.in);
//		System.out.println("enter size ");
		int size = s.nextInt();
		int input[] = new int[size];
		for(int i = 0; i < size; i++){
//			System.out.println("Enter "+i+" element");
			input[i] = s.nextInt();
		}
		return input;
	}
	
	
	public static void main(String[] args) {
		
		int a[]=takeInput();
		long p=find_product(a);
		System.out.println(p);
		
	}


	public static long find_product(int []a) {

		if(a.length==0)
			return 0;
	
		long p=1;
	
		for(int i=0;i<a.length;i++)
		{
			p=p*a[i]%(1000000007);
		}
		
		return p;
	}

}
