package gfg;

// { Driver Code Starts
import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class BT_Node{
    int data;
    BT_Node left;
    BT_Node right;
    BT_Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GfG {
    
    static BT_Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        BT_Node root = new BT_Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<BT_Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
                
            // Get and remove the front of the queue
            BT_Node currBT_Node = queue.peek();
            queue.remove();
                
            // Get the current BT_Node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current BT_Node
                currBT_Node.left = new BT_Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currBT_Node.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current BT_Node
                currBT_Node.right = new BT_Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currBT_Node.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(BT_Node root){
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
}

public class SerializeDeserializeBTree {
	public static void serialize(BT_Node root, ArrayList<Integer> a) {
	    
	    if(root==null)
	        return;
	    
	    Queue<BT_Node> q = new LinkedList<>();
	    q.add(root);
	    
	    while(!q.isEmpty()){
	        
	        BT_Node curr =q.remove();
	        
	        if(curr==null){
	            a.add(-1);
	        }
	        else{
	            a.add(curr.data);
	            q.add(curr.left);
	            q.add(curr.right);
	        }
	    }
	    
	}
	
    public static BT_Node deSerialize(ArrayList<Integer> a){
        
        if(a==null||a.size()==0)
            return null;
        
        BT_Node root = new BT_Node(a.get(0));
        
        Queue<BT_Node> q = new LinkedList<>();
        q.add(root);
        
        int i=1;
        while(!q.isEmpty()){
            
            BT_Node curr = q.remove();
            
            if(curr==null) 
                continue;
            
            if(a.get(i)==-1)
                curr.left=null;
            else
                curr.left=new BT_Node(a.get(i));
            
            i++;
            
            if(a.get(i)==-1)
                curr.right=null;
            else
                curr.right=new BT_Node(a.get(i));
        
            i++;
            
            q.add(curr.left);
            q.add(curr.right);
            
        }
        
        return root;
    }
    
	public static void main (String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        int t=Integer.parseInt(br.readLine());
        while(t-- > 0){
            String s= br.readLine();
            BT_Node root = GfG.buildTree(s);
            
            ArrayList<Integer> A=new ArrayList<Integer>();
            serialize(root, A);
            
            BT_Node getRoot=deSerialize(A);
            GfG.printInorder(getRoot);
            System.out.println();
        }
}
}

//https://practice.geeksforgeeks.org/problems/serialize-and-deserialize-a-binary-tree/1
// 1 2 3 N N 4 6 N 5 N N 7 N
