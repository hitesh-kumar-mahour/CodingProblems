package gfg;

import java.util.Comparator;
import java.util.PriorityQueue;
import lec13_LinkedList.Node;

class cmp3 implements Comparator<Node<Integer>>{
    public int compare(Node<Integer> a, Node<Integer> b){
        if(a.data > b.data)
            return 1;
        return -1;
        
    }
}


//a is an array of Node<Integer>s of the heads of linked lists
//and N is size of array a
public class MergeKSortedLinkedList
{
    Node<Integer> mergeKList(Node<Integer>[]a,int N)
    {
        Node<Integer> s_head = null;
        Node<Integer> s_tail = null;
        
        PriorityQueue<Node<Integer>> pq = new PriorityQueue<>(new cmp3());
        
        for(int i=0;i<N;i++)
            pq.add(a[i]);
        
        while(!pq.isEmpty()){
            
            Node<Integer> curr = pq.remove();
            
            if(s_head==null){
                s_head = curr;
                s_tail = curr;
            }
            else{
                s_tail.next = curr;
                s_tail = s_tail.next;
            }
            
            if(curr.next!=null)
                pq.add(curr.next);
            
        }
        
        return s_head;
         
    }
}