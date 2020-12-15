package assignment9LinkedList;

import lec13_LinkedList.LinkedListUse;
import lec13_LinkedList.Node;

public class reversePrint {
	
public static void reversePrint(Node<Integer> head) {

	if(head.next==null)
	{
		System.out.println(head.data);
		return;
	}
	reversePrint(head.next);
	System.out.println(head.data);
	}

public static void main(String[] args) {
		
		Node<Integer> head=LinkedListUse.InputList();
		//LinkedListUse.printList(head);
		reversePrint(head);
	}


	
}
