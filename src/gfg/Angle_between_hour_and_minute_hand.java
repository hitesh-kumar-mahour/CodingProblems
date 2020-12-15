package gfg;

import java.util.Scanner;

public class Angle_between_hour_and_minute_hand {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		float h=s.nextFloat();
		float m=s.nextFloat();
		
		float h_deg=(h%12)*30+(m%60)*15/30;
		float m_deg=(m%60)*6;
		System.out.println((int) Math.min( 360-Math.abs((h_deg-m_deg)), Math.abs((h_deg-m_deg))));
		
	}
}
