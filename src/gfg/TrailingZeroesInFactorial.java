package gfg;

public class TrailingZeroesInFactorial {

	private static int countZeroesFactorial(int n) {

		int count = 0 ;
		
		for(int i=5;n/i!=0 ;i*=5)
			count += n/i;
		
		return count;
	}
	
	public static void main(String[] args) {
		
	}
}
