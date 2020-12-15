package lec18_bst;

import java.util.ArrayList;
import lec15_stacksNqueues.QueueEmptyException;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;

public class PrintPath {

	public static ArrayList<BinaryTreeNode<Integer>> findPath(BinaryTreeNode<Integer>root,int val)
	{
		if(root==null)
			return null;
		if(root.data==val)
		{
			ArrayList<BinaryTreeNode<Integer>>ans=new ArrayList<>();
			ans.add(root);
			return ans;
		}
		ArrayList<BinaryTreeNode<Integer>>list= findPath(root.left, val);
		if(list==null)
			list= findPath(root.right, val);
		if(list != null)	
			list.add(root);
		return list;

	}
	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer>root=BinaryTreeUse.InputBinaryTree();
		ArrayList<BinaryTreeNode<Integer>>ans=findPath(root,13);
		for(int i=0;i<ans.size();i++)
			System.out.println(ans.get(i).data);
	}

}
