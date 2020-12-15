package assignment10Stack_q;

import java.util.Stack;

public class MinStack {

	private Stack<Integer> mainStack;
	private Stack<Integer> minStack;
	private int size;
	
	public MinStack() {
		mainStack=new Stack<>();
		minStack=new Stack<>();
		size=0;
	}
	public int size() {
		return size;
	}
	
	public void push(int data) {
		mainStack.push(data);
		
		if(minStack.isEmpty())
			minStack.push(data);
		else{
			int min=minStack.peek();
			if(data<min)
				minStack.push(data);
			else
				minStack.push(min);
		}
		size++;
	}
	public int pop(){
		size--;
		minStack.pop();
		return  mainStack.pop();
	}
	public int min(){
		return minStack.peek();
	}
	
}
