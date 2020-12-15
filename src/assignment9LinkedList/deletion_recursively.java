package assignment9LinkedList;

import java.util.Scanner;

import lec13_LinkedList.Node;

public class deletion_recursively {
	
	public static Node<Integer> deleteNode(Node <Integer>temp,int pos)
	{
		if(pos==0)
		{
			temp=temp.next;
			return temp;
		}
		if(pos==1)
		{
			temp.next=temp.next.next;
			return temp;
		}
		deleteNode(temp.next, pos-1);
		return temp;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head=lec13_LinkedList.LinkedListUse.InputList();
		lec13_LinkedList.LinkedListUse.printList(head);
		Scanner s=new Scanner(System.in);
		System.out.println("input node to delete");
		int pos= s.nextInt();
		head=deleteNode(head,pos);
		lec13_LinkedList.LinkedListUse.printList(head);

	}

}
