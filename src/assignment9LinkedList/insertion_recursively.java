package assignment9LinkedList;

import java.util.Scanner;

import lec13_LinkedList.Node;
import lec6_recursion.integer_to_word;

public class insertion_recursively {

	public static Node<Integer> insertNode(Node<Integer> temp,int pos,int val)
	{
		if(pos==0)
		{
			Node<Integer> newNode=new Node<>(val);
			newNode.next=temp;
			return newNode;
		}
		if(pos==1)	
		{
			Node<Integer> newNode=new Node<>(val);
			newNode.next=temp.next;
			temp.next=newNode;
			return temp;
		}
		else
		 insertNode(temp.next, pos-1, val);
		 
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head=lec13_LinkedList.LinkedListUse.InputList();
		lec13_LinkedList.LinkedListUse.printList(head);
		Scanner s=new Scanner(System.in);
		System.out.println("input pos and val");
		int pos= s.nextInt();
		int val=s.nextInt();
		head=insertNode(head,pos,val);
		lec13_LinkedList.LinkedListUse.printList(head);

	}

}
