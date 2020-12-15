package assignment9LinkedList;

import lec13_LinkedList.LinkedListUse;
import lec13_LinkedList.Node;

public class LLreversIteratively {

	public static Node<Integer> listReverse(Node<Integer>head)
	{
		Node<Integer>temp,p,q;
		temp=head;
		p=head.next;
		temp.next=null;
		
		while(p!=null)
		{
			q=p.next;
			p.next=temp;
			temp=p;
			p=q;
		}
		return temp;
	}
	
public static void main(String[] args) {
		
		Node<Integer> head=LinkedListUse.InputList();
		LinkedListUse.printList(head);
		head=listReverse(head);
		LinkedListUse.printList(head);
	}
}
