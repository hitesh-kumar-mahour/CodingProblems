package lec15_stacksNqueues;

import lec13_LinkedList.Node;

public class QueueUsingLL<T> {
	
	private Node<T> front;
	private Node<T> rear;
	private int size=0;

	public boolean isEmpty()
	{
		return size==0;
	}
	public int size()
	{
		return size;
	}
	public T front() throws QueueEmptyException
	{
		if(size==0)
			throw new QueueEmptyException();
		return front.data;
	}
	
	public void enqueue(T element)
	{
		Node<T>newNode=new Node<>(element);
		if(size==0)
		{
			front=newNode;
			rear=newNode;
		}
		else
		{
			rear.next=newNode;
			rear=newNode;	
		}
		size++;
	}
	
	public T dequeue() throws QueueEmptyException
	{
		if(size==0)
		{
			QueueEmptyException e=new QueueEmptyException();
			throw e;
		}
		Node<T>temp=front;
		front=front.next;
		size--;
		return temp.data;
	}
	
}
