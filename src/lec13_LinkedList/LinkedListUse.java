package lec13_LinkedList;

import java.util.Scanner;

public class LinkedListUse {
	
	public static int LLSum(Node<Integer>head)
	{
		int sum=0;
		Node<Integer>temp=head;
		while(temp!=null)
		{
			sum+=temp.data;
			temp=temp.next;
		}
		return sum;
		
	}
	
	public static int countList(Node<Integer>head)
	{
		int count=0;
		Node<Integer>temp=head;
		while(temp!=null)
		{
			temp=temp.next;
			count++;
		}
		return count;
	}
	
	public static Node<Integer> deleteNode(Node<Integer>head,int pos)
	{
		if(pos==1){
		head=head.next;
		return head;
		}
		
		Node<Integer>temp=head;
		for(int i=2;i<pos;i++)
		{
			temp=temp.next;
		}
		temp.next=temp.next.next;
		
		return head;
	}

	public static Node<Integer> insertNode(Node<Integer>head ,int val,int pos)
	{
		Node<Integer>newNode=new Node<Integer>(val);
		
		if(pos==1){
			newNode.next=head;
			head=newNode;
			return head;
		}
		
		Node<Integer>temp=head;
		for(int i=2;i<pos;i++)
		{
			temp=temp.next;
		}
		
		newNode.next=temp.next;
		temp.next=newNode;
		
		return head;
	}
	
	public static void printNode(Node<Integer>head,int n)
	{
		Node<Integer>temp= head;
		for(int i=1;i<n;i++)
		{
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	
	public static Node<Integer> InputList()
	{
		Scanner s=new Scanner(System.in);
		Node<Integer>head=null;
		Node<Integer>tail=null;
		System.out.println("enter data, -1 to end");
		int data=s.nextInt();
		while(data!=-1)
		{
			Node<Integer>temp=new Node<Integer>(data);
			if(head==null)
			{
				head=temp;
				tail=temp;
			}
			else
			{
				tail.next=temp;
				tail=temp;
			}
			data=s.nextInt();
		}
		return head;
	}
	
	public static void printList(Node<Integer>head)
	{
		Node<Integer>temp=head;
		while(temp!=null)
		{	
			System.out.println(temp.data);
			temp=temp.next;
		}
//		System.out.println("-1");
	}
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		Node<Integer>head=InputList();
		System.out.println("enter 1 to print List");
		System.out.println("enter 2 to print Node");
		System.out.println("enter 3 to insert Node");
		System.out.println("enter 4 to delete Node");
		int option=s.nextInt();
		switch(option)
		{
		case 1:
			printList(head);
			break;
		case 2:
			System.out.print("enter node to print: ");
			int n=s.nextInt();
			printNode(head,n);
			break;
		case 3:
			System.out.print("enter data and pos:");
			int val=s.nextInt();
			int pos =s.nextInt();
			head=insertNode(head, val,pos);
			break;
	//		printList(head);
		case 4:
			System.out.println("enter node position to be deleted");
			head=deleteNode(head, s.nextInt());
			break;
			//		printList(head);
			
		default:
			return;
		
		}
		//main(new String[0]);
	}
}

