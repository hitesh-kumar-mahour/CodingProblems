package lec14_doublyLL;

import lec13_LinkedList.LinkedListUse;
import lec13_LinkedList.Node;

public class LLtoDoublyLL {


	public static DoublyLLNode<Integer> covertLLtoDoubleLL(Node<Integer> head) {
		if(head==null)
		return null;
		
		DoublyLLNode<Integer>Dhead=new DoublyLLNode<Integer>(head.data);
		
		DoublyLLNode<Integer> Dprev=Dhead;
		Node<Integer> current=head.next;
		while(current!=null)
		{
			DoublyLLNode<Integer> DnewNode=new DoublyLLNode<Integer>(current.data);
			Dprev.next=DnewNode;
			DnewNode.prev=Dprev;
			current=current.next;
			Dprev=Dprev.next;
		}
		return Dhead;
		
		
	}
	public static void main(String[] args) {

		Node<Integer>head=LinkedListUse.InputList();
		DoublyLLNode<Integer>Dhead=covertLLtoDoubleLL(head);
		DoublyLLUse.printList(Dhead);
		
	}


}
