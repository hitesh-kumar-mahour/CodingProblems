package assignment10Stack_q;

import lec15_stacksNqueues.StackEmptyException;
import lec15_stacksNqueues.StackUsingLL;

public class q_using_2stacks_enqueueEfficient<T> {

	private StackUsingLL<T>	stack;
	private StackUsingLL<T> helperStack;
	private int size;

	public int size()
	{
		return size;
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	public q_using_2stacks_enqueueEfficient()
	{
		stack=new StackUsingLL<>();
		helperStack=new StackUsingLL<>();
		size=0;
	}
	public void enqueue(T element)
	{
		stack.push(element);
		size++;
	}
	public T dequeue() throws StackEmptyException
	{
		while(stack.size()!=0)
			helperStack.push(stack.pop());
			
		T data=helperStack.pop();
		
		while(helperStack.size()!=0)
			stack.push(helperStack.pop());
		size--;
	return data;
	}
}