package assignment10Stack_q;

import lec15_stacksNqueues.QueueEmptyException;
import lec15_stacksNqueues.QueueUsingLL;

public class reversingQ {

public static QueueUsingLL<Integer> reverseQrecur(QueueUsingLL<Integer> q) throws QueueEmptyException {
		
		if(q.size()<=1)
			return q;
		int data=q.dequeue();
		reverseQrecur(q).enqueue(data);
	return q;
	}
	
	public static void main(String[] args) throws QueueEmptyException {
	QueueUsingLL<Integer> Q=new QueueUsingLL<>();
	for(int i=0;i<5;i++)
		Q.enqueue(i);
	
//	while(!Q.isEmpty())
//		System.out.println(Q.dequeue());
	
	Q=reverseQrecur(Q);	
	while(!Q.isEmpty())
		System.out.println(Q.dequeue());
	}	
}
