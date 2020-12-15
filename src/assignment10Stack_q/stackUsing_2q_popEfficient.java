package assignment10Stack_q;

import lec15_stacksNqueues.QueueEmptyException;
import lec15_stacksNqueues.QueueUsingLL;

public class stackUsing_2q_popEfficient<T> {

	private QueueUsingLL<T> mainQ;
	private QueueUsingLL<T> helperQ;
	private int size;
	
	public stackUsing_2q_popEfficient()
	{
		mainQ=new QueueUsingLL<>();
		helperQ=new QueueUsingLL<>();
		size=0;
	}
	
	public int size()
	{
		return size;
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	public void enqueue(T element) throws QueueEmptyException
	{
		while(!mainQ.isEmpty())
		helperQ.enqueue(mainQ.dequeue());
		
		mainQ.enqueue(element);
		while(!helperQ.isEmpty())
		mainQ.enqueue(helperQ.dequeue());
		
		size++;
	}
	public T dequeue() throws QueueEmptyException
	{
		size--;
		return mainQ.dequeue();
	}
}
