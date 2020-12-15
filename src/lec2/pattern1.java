package lec2;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("input no.");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
			int i,j,val;
			
			for(i=1;i<=n;i++)
			{
				for(j=n;j>i;j--)
					System.out.print(" ");
				
				for( j=1,val=i;j<=i;val++,j++)
					System.out.print(val);
				
				for(j=1,val=val-2;j<i;val--,j++)
					System.out.print(val);
				
				System.out.print("\n");
			}
			
	}

}
