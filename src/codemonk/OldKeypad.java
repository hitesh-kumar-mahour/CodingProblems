package codemonk;

import java.util.Scanner;

public class OldKeypad {

	public static void selection_sort(int input[])
	{
		for(int i=0;i<input.length-1;i++)
		{
			for(int j=i+1;j<input.length;j++)
			{
				if(input[i]<input[j]) /* for making decending use input[i]< input[j]  */
	            {
	               int k=input[i];
	                input[i]=input[j];
	                input[j]=k;
	            }
			}
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int[] foreign_letters_freq=new int[size];

		for (int i = 0; i < size; i++) {
			foreign_letters_freq[i]=s.nextInt();
		}
		
		selection_sort(foreign_letters_freq);
		
		int[][] keypad=new int[s.nextInt()][];
		for (int i = 0; i < keypad.length; i++) {
			keypad[i]=new int[s.nextInt()];
		}
		
		System.out.println(strokes(foreign_letters_freq,keypad));
		
	}
	private static int strokes(int[] foreign_letters_freq, int[][] keypad) {
		
		int sum=0;
		for (int i = 0; i < keypad.length; i++) {
			sum+=keypad[i].length;
		}
		if(sum<foreign_letters_freq.length)
			return -1;
		
		
		int count=0;
		
		int i,j=0,k=0;
		while(k<foreign_letters_freq.length)
		{
			for( i=0;i<keypad.length;i++)
			{
				if(j<keypad[i].length&&k<foreign_letters_freq.length)
				{
					keypad[i][j]=foreign_letters_freq[k];
					count+=(j+1)*(keypad[i][j]);
//					System.out.println(keypad[i][j]);
					k++;
				}
			}
			j++;
		}
		return count;
	
		
	}
}
