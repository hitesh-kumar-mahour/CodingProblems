package assignment9LinkedList;

import java.util.HashMap;

import lec13_LinkedList.LinkedListUse;
import lec13_LinkedList.Node;

public class Q14_KReverse {

	public static Node<Integer> kReverse(Node<Integer> head,int k) {
		
		if(head==null || head.next==null || k<=1)
			return head;
		
        if(head==null || head.next==null || k<=1) return head;
        
        Node<Integer> prev=head, curr=head.next, next=null ;
        head.next=null;
        
        int n=k;
        while(n>1 && curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            n--;
        }

        head.next = kReverse(curr,k);
        return prev;
		
	}
	
	
	public static void main(String[] args) {
			Node<Integer> head=LinkedListUse.InputList();
			LinkedListUse.printList(head);
			head=kReverse(head,3);
			LinkedListUse.printList(head);
		}
}
