package gfg;

import java.util.Stack;

class Node{
	int data;
	Node left,right;
}

public class InorderIterative {

	public static void fun(Node root) {
		
		if(root==null) 
			return;
		
		Stack<Node> s =new Stack<>();
		s.push(root);
		root=root.left;
		
		while(!s.isEmpty()) {
			
			if(root!=null) {
				root = root.left;
				if(root!=null)
					s.push(root);
			}
			else {
				
				root = s.pop();
				System.out.println(root.data);
				root=root.right;
			}
		}		
		
	}
}
