package assignment9LinkedList;

import javax.print.event.PrintJobAttributeListener;

import lec13_LinkedList.LinkedListUse;
import lec13_LinkedList.Node;

public class merge2SortedList {
	public static Node<Integer> merge(Node <Integer>temp1,Node <Integer>temp2)
	{
		Node<Integer>head=null;
		Node<Integer> tail=null;
		if(temp2.data>temp1.data)
		{
			head = temp1;
			tail = temp1;
			temp1=temp1.next;
		}
		else
		{
			head=temp2;
			temp2=temp2.next;

		}
		
	tail=head;
	
		while(temp1!=null&&temp2!=null)
		{
			if(temp2.data>temp1.data)
			{
				tail.next= temp1;
				temp1=temp1.next;
				tail=tail.next;
			}
			else
			{
				tail.next=temp2;
				temp2=temp2.next;
				tail=tail.next;
			}
			
		}
		if(temp1!=null)
		tail.next = temp1;
		
		if(temp2!=null)
		tail.next=temp2;
		
	return head;
	}
	public static void main(String[] args) {
		System.out.println("input list 1");
		Node<Integer>head1=LinkedListUse.InputList();
		System.out.println("input list 2");
		Node<Integer>head2=LinkedListUse.InputList();
		Node<Integer>headM=merge(head1,head2);
		LinkedListUse.printList(headM);
	}

}
