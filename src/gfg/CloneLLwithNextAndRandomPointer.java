package gfg;

import java.util.HashMap;

class Node{
	
	int data;
	Node next;
	Node random;
	
	Node(int data)
	{
		this.data=data;
	}
}

 class CloneLLwithNextAndRandomPointer {

	
	public static Node clone(Node head_org)
	{
		//map contains original node as key clone node as value
		HashMap<Node, Node>map=new HashMap<>();
		Node curr=head_org;
		
		while(curr!=null)
		{
			Node temp=new Node(curr.data);
			map.put(curr, temp);
			curr=curr.next;
		}
		
		Node head_clone=map.get(head_org);
		curr=head_org;
		while(curr!=null)
		{
			map.get(curr).next=map.get(curr.next);
			map.get(curr).random=map.get(curr.random);
			curr=curr.next;
		}
		
		return head_clone;
	}

}

