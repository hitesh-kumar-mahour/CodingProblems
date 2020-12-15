package assignment10Stack_q;

import lec15_stacksNqueues.StackEmptyException;

public class q_use {

	public static void main(String[] args) throws StackEmptyException {
		q_using_2stacks_dequeueEfficient<Integer> q=new q_using_2stacks_dequeueEfficient<>();
		for(int i=0;i<5;i++)
			q.enqueue(i);
		for(int i=0;i<5;i++)
			System.out.println(q.dequeue());
	}
}
