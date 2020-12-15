package othello;

import java.util.Timer;

import javax.swing.SwingUtilities;

public class random {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

		int t=(int)(100*Math.random());
		if(t%2==0)
			System.out.println(4);
		else if(t%2==1)
			System.out.println(2);
		
	for(int i=0;i<10;i++)
	{
		Thread.sleep(1000);
		System.out.println("done");
	}
		
		
	}

}
