package assignment14_hashing;

import java.util.HashMap;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
	 Scanner s= new Scanner(System.in);
	System.out.println("enter string ending with $");	
	 String a=s.nextLine();		
	 HashMap<String,Integer> map=new HashMap<>();
	 int j=0,i;
	 while(j<a.length())
	 {
		  i=j;
		 while(a.charAt(i)!=' '&&a.charAt(i)!='$')
		 {
			 i++;
		 }
		 String temp=a.substring(j,i);
		 if(!map.containsKey(temp))
			 map.put(temp, 1);
		 else
		 {
			 int freq=map.get(temp);
			 map.put(temp, freq+1);
		 }
		 
		 j=i+1;
	 }
	 
	  for(String st:map.keySet())
	  {
		  System.out.println(st+" "+map.get(st));
	  }
	 
	}
}
//hello baby hello how is you is my name baby are you my baby$