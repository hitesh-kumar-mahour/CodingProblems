package assignment9LinkedList;

import lec13_LinkedList.LinkedListUse;
import lec13_LinkedList.Node;

public class LLreversealRecursively {

	public static Node<Integer> listReverse(Node<Integer>head)
	{
		if(head.next==null)
			return head;
		
		Node<Integer>headR=listReverse(head.next);
		
		head.next.next=head;
		head.next=null;
		
		return headR;
	}
	
	public static void main(String[] args) {
		
		Node<Integer> head=LinkedListUse.InputList();
		LinkedListUse.printList(head);
		head=listReverse(head);
		LinkedListUse.printList(head);
	}
}
