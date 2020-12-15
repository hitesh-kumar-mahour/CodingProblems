package assignment9LinkedList;

import java.util.Scanner;

import lec13_LinkedList.LinkedListUse;
import lec13_LinkedList.Node;

public class Q13 {
	
	private static Node<Integer> append(Node<Integer> head, int k) {
		// TODO Auto-generated method stub
		Node<Integer>tail=head;
		int size=1;
		while(tail.next!=null)
		{
			size++;
			tail=tail.next;
		}
		tail.next=head;
		
		int n=size-k;
		Node<Integer>temp=head;
		for(int i=1;i<n;i++)
		{
			temp=temp.next;
		}
		head=temp.next;
		temp.next=null;
		
		return head;
	}

	
	public static void main(String[] args) {
	
	Node<Integer> head=LinkedListUse.InputList();
	LinkedListUse.printList(head);
	Scanner s=new Scanner(System.in);
	System.out.println("input elements to append");
	int k=s.nextInt();
	head=append(head,k);
	LinkedListUse.printList(head);
}


}
