package lec21_PriorityQ;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueUtility {

	public static void main(String[] args) {

		PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
		for(int i=10;i>=1;i--)
			p.add(i);

		p.add(55);
		p.add(0);
		
		System.out.println(p);
		while(!p.isEmpty())
		System.out.println(p.remove());
		
			
		}
}
