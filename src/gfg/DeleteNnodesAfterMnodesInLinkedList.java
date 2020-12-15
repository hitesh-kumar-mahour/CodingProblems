package gfg;


import java.util.Scanner;

import lec13_LinkedList.LinkedListUse;
import lec13_LinkedList.Node;

public class DeleteNnodesAfterMnodesInLinkedList {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Node<Integer> head=LinkedListUse.InputList();
//		LinkedListUse.printList(head);
		SkipMdeleteN(head, 3, 3);
		LinkedListUse.printList(head);
	}

	private static void SkipMdeleteN(Node<Integer> head,int m,int n) {

		Node temp=head;
		while(temp!=null)
		{
			int i=1;
			while(i!=m&& temp!=null)
			{
				i++;
				temp=temp.next;
			}
			if(temp==null)
				return;
			Node del_beg=temp;
			
			 i=0;
			while(i!=n && temp!=null)
			{
				i++;
				temp=temp.next;
			}
			if(temp==null)
				{
				del_beg.next=temp;
				return;
				}
			
			del_beg.next=temp.next;
			temp=temp.next;
		}
	}
}
