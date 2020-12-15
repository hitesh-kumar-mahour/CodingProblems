package assignment12BinaryTrees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import lec15_stacksNqueues.QueueEmptyException;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;

class Pair{
	
	BinaryTreeNode<Integer> node;
	int dist;//horizontal distance from root
	
	public Pair(BinaryTreeNode<Integer> node,int dist) {
		this.node=node;
		this.dist=dist;
	}
}

public class VerticalTraversalOfTree {

	private static void printVerticaly(BinaryTreeNode<Integer> root) {

		if(root==null)
			return;
		
		Queue<Pair> q=new LinkedList<>();
		HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
		
		q.add(new Pair(root,0));

		ArrayList<Integer> temp=new ArrayList<>();
		temp.add(root.data);
		map.put(0,temp);
		
		while (!q.isEmpty())
		{
			Pair currPair=q.remove();
					
			if(currPair.node.left!=null)
			{
				q.add(new Pair(currPair.node.left, currPair.dist-1));
				
				if(map.containsKey(currPair.dist-1))
				{
					temp=map.get(currPair.dist-1);
					temp.add(currPair.node.left.data);
					map.put(currPair.dist-1, temp);
				}
				else
				{
					temp=new ArrayList<>();
					temp.add(currPair.node.left.data);
					map.put(currPair.dist-1,temp);
				}	
			}
			
			if(currPair.node.right!=null)
			{
				q.add(new Pair(currPair.node.right, currPair.dist+1));
				
				if(map.containsKey(currPair.dist+1))
				{
					temp=map.get(currPair.dist+1);
					temp.add(currPair.node.right.data);
					map.put(currPair.dist+1, temp);
				}
				else
				{
					temp=new ArrayList<>();
					temp.add(currPair.node.right.data);
					map.put(currPair.dist+1,temp);
				}
				
			}
		}
	
		int min_hdist=0,max_hdist=0;//minimum and maximum horizontal distance in map
		
		for(int dist:map.keySet())
		{
			min_hdist=Math.min(dist,min_hdist);
			max_hdist=Math.max(dist,max_hdist);
		}
		
		for( int dist=min_hdist;dist<=max_hdist;dist++)
		{
			temp=map.get(dist);
			System.out.print(dist+"\t");
			for (int i:temp)
				System.out.print(i+" ");

			System.out.println();
			
		}
		
	}
	
	public static void main(String[] args) throws QueueEmptyException {
		
		BinaryTreeNode<Integer> root =BinaryTreeUse.InputBinaryTree();
		printVerticaly(root);
		
	}


}
