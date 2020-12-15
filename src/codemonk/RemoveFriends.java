package codemonk;

import java.util.Scanner;

class Node{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data=data;
	}
}
public class RemoveFriends {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int t=s.nextInt();
		for(int p=0;p<t;p++)
		{
			int size=s.nextInt();
			int n=s.nextInt();
			
			Node head=null;
			Node tail=null;
			for(int i=0;i<size;i++)
			{
				Node temp=new Node(s.nextInt());
				if(head==null){
					head=temp;
					tail=temp;
				}
				else{
					tail.next=temp;
					tail=temp;
				}
			}
			
		
			for(int j=0;j<n;j++)
			{
				head=del_node(head);
			}
			
			Node temp=head;
			while(temp!=null)
				{
				System.out.print(temp.data+" ");
				temp=temp.next;
				}
//			System.out.println();
		}
	
	}

	private static Node del_node(Node head) {

		if(head.data<head.next.data)
			return head.next;
		
		Node temp=head;
		while(temp.next.next!=null)
		{
			if(temp.next.data<temp.next.next.data)
			{
				temp.next=temp.next.next;
				return head;
			}
			temp=temp.next;
		}
		temp.next=null;
		return head;
	}
	
}
