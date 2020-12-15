package codezen;

import java.util.Scanner;

class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data=data;
	}
}
public class PushZerostoend {

	public static void pushZerosAtEnd(int[] arr){
		int[]b=new int[arr.length];
		for(int i=0,j=0;i<arr.length;i++)
		{
		    if(arr[i]==0)
		        continue;
		    
		    b[j]=arr[i];
		    j++;
		}
		for(int i=0;i<arr.length;i++)
		    arr[i]=b[i];
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size=s.nextInt();
		int zeros=0;
		Node head=null;
		Node tail=null;
		for(int i=0;i<size;i++)
		{
			int data=s.nextInt();
			if(data==0)
			{
				zeros++;
				continue;
			}
			Node temp=new Node(data);
			
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
		}
		
		for(int i=0;i<zeros;i++)
		{
			Node temp=new Node(0);
			tail.next=temp;
			tail=temp;
		}
		Node temp=head;
		while(temp!=null)
			{
			System.out.println(temp.data);
			temp=temp.next;
			}
	}
}
