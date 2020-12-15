package lec14_doublyLL;

import lec13_LinkedList.LinkedListUse;
import lec13_LinkedList.Node;

public class delete_alternativeNodes {

	public static void del_alt(Node<Integer>head)
	{
		Node<Integer>currentNode=head;
		while(currentNode.next!=null&&currentNode.next.next!=null)
		{
			currentNode.next=currentNode.next.next;
			currentNode=currentNode.next;
		}
		currentNode.next=null;	
	}
	
	public static void main(String[] args) {
	
		Node<Integer>head=LinkedListUse.InputList();
		del_alt(head);
		LinkedListUse.printList(head);
	}	
}
