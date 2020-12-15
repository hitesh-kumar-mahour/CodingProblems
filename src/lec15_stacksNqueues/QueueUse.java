package lec15_stacksNqueues;

public class QueueUse {
	
	public static void main(String[] args) throws QueueEmptyException {
		QueueUsingLL<Integer> q=new QueueUsingLL<Integer>();
		for(int i=0;i<10;i++)
			q.enqueue(i);
		q.dequeue();
		q.dequeue();
		q.enqueue(12);
		System.out.println(q.size());
		
		
	}

}
