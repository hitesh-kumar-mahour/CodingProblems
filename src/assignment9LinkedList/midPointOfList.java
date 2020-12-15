package assignment9LinkedList;

import lec13_LinkedList.LinkedListUse;
import lec13_LinkedList.Node;

public class midPointOfList {

	public static Node<Integer> mid(Node<Integer> head){
		if(head == null){
			return null;
		}
		Node<Integer> slow = head, fast = head;
		while(fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head=LinkedListUse.InputList();
		Node<Integer> mid=mid(head);
		System.out.println(mid.data);
	}

}
