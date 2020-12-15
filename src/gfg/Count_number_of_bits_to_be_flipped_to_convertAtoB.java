package gfg;

import java.util.BitSet;
import java.util.Scanner;


public class Count_number_of_bits_to_be_flipped_to_convertAtoB {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		
		System.out.println(Integer.bitCount(a^b));
//		System.out.println(Integer.toBinaryString(10));
//		System.out.println(Integer.toHexString(10));
	}
}
