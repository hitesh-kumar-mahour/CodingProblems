package lec3;

import java.util.Scanner;

public class function_calling {

	
	public static void table(int min,int max,int step)
	{

		int value=min;

		while( value <= max ){
			int celsiusValue = (int) ((5.0/9)*(value - 32));
			System.out.println(value + "\t"+ celsiusValue);
			value = value+step;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("input min value");
		Scanner s= new Scanner(System.in);
		int min=s.nextInt();
		
		System.out.print("input max value");
		int max=s.nextInt();
		
		System.out.print("input step size");
		int step=s.nextInt();
		
		table(min,max,step);
	}

}
