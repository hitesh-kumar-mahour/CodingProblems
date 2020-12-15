package lec10complexity_analysis;

import java.util.Scanner;

public class rotatePoint {
	public static int rotated_point(int []arr)
	{
		int currentPos,nextPos,prevPos;
		
		for(currentPos=0;currentPos<arr.length;currentPos++)
		{
			if(currentPos==0)
			{
				prevPos=arr.length-1;
				nextPos=currentPos+1;
			}
			else if(currentPos==arr.length-1)
			{
				prevPos=currentPos-1;
				nextPos=0;
			}
			else
			{
				prevPos=currentPos-1;
				nextPos=currentPos+1;
			}
			
			if(arr[currentPos]<arr[nextPos]&&arr[currentPos]<arr[prevPos])
				return currentPos;
		}
		return -1;// without this statement program wont work in java
	}
	
	public static  int[]  takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("enter size ");
		int size = s.nextInt();
		int input[] = new int[size];
		for(int i = 0; i < size; i++){
			System.out.println("Enter "+i+" element");
			input[i] = s.nextInt();
		}
		return input;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[20];
		arr=takeInput();
		int point=rotated_point(arr);
		System.out.print("rotated point: "+point);
		
	}
}
