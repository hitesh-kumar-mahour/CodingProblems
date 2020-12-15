package gfg;

import lec13_LinkedList.Node;

public class ReverseLLGroupK {

	
    public static Node<Integer> reverse(Node<Integer> head, int k)
    {
        if(head==null || head.next==null || k<=1)
            return head;
        
        Node<Integer> prev=head,curr=head.next;
        head.next=null;
        int n=k;
        
        while(n>1 && curr!=null){
        	Node<Integer> next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            n--;
        }

        head.next = reverse(curr,k);
        return prev;
        
    }
    
}
