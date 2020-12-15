package gfg;

import java.io.*;
import java.util.HashMap;

class DLLNode{
    int key;
    int val;
    DLLNode prev;
    DLLNode next;
    
    public DLLNode(int key,int val){
        this.key=key;
        this.val=val;
        this.prev=null;
        this.next=null;
    }
}

public class LRUCache{
	
    HashMap<Integer,DLLNode> m;
    DLLNode head,tail;
    int size;
    int cap;
    
    LRUCache(int cap)
    {
     this.m = new HashMap<>();
     this.size = 0;
     this.head = null;
     this.tail = null;
     this.cap = cap;
    }

    // This method works in O(1)
    public int get(int key)
    {
        if(!m.containsKey(key))
        	return -1;
        
        DLLNode curr = m.get(key);
        int val = curr.val;
        remove(curr);
        curr = new DLLNode(key,val);
        add(curr);
        m.put(key,curr);
        
        return val;        

    }

    // This method works in O(1)
    public void set(int key, int val)
    {
        if(m.containsKey(key)){
            DLLNode curr = m.get(key);
            remove(curr);
            curr = new DLLNode(key,val);
            add(curr);
            m.put(key,curr);
            return;
        }
    	
    	if(size==cap) {
    		m.remove(head.key);
    		remove(head);
    	}
    	else {
    		size++;
    	}
    	
    	DLLNode curr = new DLLNode(key, val);
    	add(curr);
    	m.put(key,curr);
    	
    }
    
    private void add(DLLNode curr){
     
    	if(head==null) {
    		head=curr;
    		tail=curr;
    	}
    	else {
    		tail.next=curr;
    		curr.prev=tail;
    		tail=curr;
    	}
    }
    
    private void remove(DLLNode curr){

        if(size==1) {
        	head=null;
        	tail=null;
        	return;
        }
        if(curr == head){
            curr.next.prev = null;
            head = curr.next;
            return;
        }
        if(curr == tail) {
        	curr.prev.next=null;
        	tail = curr.prev;
        	return;
        }
        
        curr.next.prev = curr.prev;
        curr.prev.next = curr.next;
        
    }
    
    
    
    public static void main(String[] args) throws IOException {
    	BufferedReader read =
    	new BufferedReader(new InputStreamReader(System.in));
    	int t = Integer.parseInt(read.readLine());
    	while (t-- > 0) {
    	int capacity = Integer.parseInt(read.readLine());
    	int queries = Integer.parseInt(read.readLine());
    	LRUCache cache = new LRUCache(capacity);
    	String str[] = read.readLine().trim().split(" ");
    	int len = str.length;
    	int itr = 0;
    	for (int i = 0; (i < queries) && (itr < len); i++) {
    	String queryType = str[itr++];
    	if (queryType.equals("SET")) {
    	int key = Integer.parseInt(str[itr++]);
    	int value = Integer.parseInt(str[itr++]);
    	cache.set(key, value);
    	}
    	if (queryType.equals("GET")) {
    	int key = Integer.parseInt(str[itr++]);
    	System.out.print(cache.get(key) + " ");
    	}
    	}
    	System.out.println();
    	}
    	}

//    1
//    4
//    87
//    SET 94 16 SET 93 87 SET 63 22 SET 60 91 SET 41 27 GET 73 GET 12 GET 68 SET 31 83 GET 24 SET 30 36 GET 23 GET 70 SET 57 94 SET 30 43 SET 20 22 GET 38 GET 25 SET 14 71 GET 92 GET 57 SET 71 63 GET 82 SET 85 26 SET 6 37 GET 30 SET 25 58 SET 46 83 GET 68 GET 65 SET 88 51 GET 77 GET 89 GET 4 SET 100 55 GET 61 GET 69 SET 27 13 GET 95 SET 71 96 GET 79 SET 98 2 GET 18 GET 53 GET 2 GET 87 SET 90 66 GET 20 GET 30 SET 98 18 SET 76 82 SET 68 28 GET 98 SET 66 87 GET 84 SET 29 25 SET 30 33 SET 71 20 GET 9 SET 50 41 GET 24 GET 46 GET 52 SET 80 56 GET 65 GET 42 GET 94 GET 35 GET 25 GET 88 GET 44 SET 66 28 SET 33 37 SET 29 38 SET 75 8 SET 96 59 SET 36 38 SET 29 19 SET 29 12 SET 5 77 SET 14 64 GET 7 GET 5 GET 29 GET 70 SET 97 18 GET 44
// o/p -1 -1 -1 -1 -1 -1 -1 -1 -1 94 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 18 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 77 12 -1 -1

}
