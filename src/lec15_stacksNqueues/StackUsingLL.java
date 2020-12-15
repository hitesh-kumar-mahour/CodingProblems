package lec15_stacksNqueues;

import lec13_LinkedList.Node;

public class StackUsingLL <T>{

	private Node<T> top;
	private int size=0;
	 
public int size()
{
	return size;
}

public T top() throws StackEmptyException
{
	if(top==null)
	{
		StackEmptyException e= new StackEmptyException();
		throw e;
	}
	return top.data;
}
public void push(T element)
{
	Node<T>newNode=new Node<>(element);
	newNode.next=top;
	top=newNode;
	size++;
}

public T pop() throws StackEmptyException
{
	if(top==null)
	{
		StackEmptyException e= new StackEmptyException();
		throw e;
	}
	Node<T>temp=top;
	top=top.next;
	size--;
	return temp.data;
}



}
