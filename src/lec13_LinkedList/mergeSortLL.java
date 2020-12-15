package lec13_LinkedList;


public class mergeSortLL {
	
	public static Node<Integer> merge(Node <Integer>temp1,Node <Integer>temp2)
	{
		Node<Integer>head=null;
		Node<Integer> tail=null;
		if(temp2.data>temp1.data)
		{
			head = temp1;
			tail = temp1;
			temp1=temp1.next;
		}
		else
		{
			head=temp2;
			temp2=temp2.next;
		}
		
	tail=head;
	
		while(temp1!=null&&temp2!=null)
		{
			if(temp2.data>temp1.data)
			{
				tail.next= temp1;
				temp1=temp1.next;
				tail=tail.next;
			}
			else
			{
				tail.next=temp2;
				temp2=temp2.next;
				tail=tail.next;
			}
			
		}
		if(temp1!=null)
		tail.next = temp1;
		
		if(temp2!=null)
		tail.next=temp2;
		
	return head;
	}
	
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
	
	public static Node<Integer> mergeSortList(Node<Integer>head)
	{
		if(head==null||head.next==null)
			return head;
	
		Node<Integer> mid=mid(head);
	
		Node<Integer>head2=mid.next;
	    mid.next=null;
	    Node<Integer>head1=head;
	    
		head1= mergeSortList(head1);
		head2= mergeSortList(head2);
		
		head=merge(head1,head2);
		
		return head;
	}

	public static void main(String[] args) {
		Node<Integer>head=LinkedListUse.InputList();
		head=mergeSortList(head);
		LinkedListUse.printList(head);
		
	}
	
}
