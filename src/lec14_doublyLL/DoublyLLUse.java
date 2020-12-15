package lec14_doublyLL;

import java.awt.im.spi.InputMethodDescriptor;
import java.util.Scanner;

import lec13_LinkedList.Node;

public class DoublyLLUse {

	public static DoublyLLNode<Integer>insertDoublyNode(DoublyLLNode<Integer>head,int data,int pos)
	{
		if(pos==0)
		{
			DoublyLLNode<Integer> newNode=new DoublyLLNode<Integer>(data);
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
			return head;
		}
		if(pos==1)
		{
			DoublyLLNode<Integer> newNode=new DoublyLLNode<Integer>(data);
			newNode.next=head.next;
			newNode.prev=head;
			head.next.prev=newNode;
			head.next=newNode;
			return head;
		}
		
		return insertDoublyNode(head.next, data, pos-1);
	}
	
	public static DoublyLLNode<Integer> InputDoblyLL()
	{
		Scanner s=new Scanner(System.in);
		DoublyLLNode<Integer>head=null;
		DoublyLLNode<Integer>tail=null;
		System.out.println("enter data, -1 to end");
		int data=s.nextInt();
		while(data!=-1)
		{
			DoublyLLNode<Integer>temp=new DoublyLLNode<Integer>(data);
			if(head==null)
			{
				head=temp;
				tail=temp;
			}
			else
			{
				tail.next=temp;
				temp.prev=tail;
				tail=temp;	
			}
			data=s.nextInt();
		}
		return head;
	
	}

	public static void printList(DoublyLLNode<Integer> head)
	{
		DoublyLLNode<Integer>temp=head;
		while(temp!=null)
		{	
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println("-1");
	}
	public static void main(String[] args) {
		DoublyLLNode<Integer>head=InputDoblyLL();
		printList(head);
		insertDoublyNode(head, 5, 3);
		printList(head);
		
	}
}
