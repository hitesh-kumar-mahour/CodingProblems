package assignment10Stack_q;

import lec15_stacksNqueues.StackEmptyException;
import lec15_stacksNqueues.StackUsingLL;

public class q_using_2stacks_dequeueEfficient<T> {

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
		public q_using_2stacks_dequeueEfficient()
		{
			stack=new StackUsingLL<>();
			helperStack=new StackUsingLL<>();
			size=0;
		}
		public void enqueue(T element)throws StackEmptyException
		{
			while(stack.size()!=0)
			helperStack.push(stack.pop());
		
			stack.push(element);
			size++;

			while(helperStack.size()!=0)
				stack.push(helperStack.pop());

		}
		public T dequeue() throws StackEmptyException 
		{
			size--;
		return stack.pop();
		}
}
