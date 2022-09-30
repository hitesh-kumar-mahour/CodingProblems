package gfg;

//    https://practice.geeksforgeeks.org/problems/burning-tree/1

public class TimeToBurnNodesInBinaryTree {

    class Node{
        int data;
        Node left;
        Node right;
    }

    private static int ans;

    public static int minTime(Node root, int target){
        ans=-1;
        minTimeUtil(root,target);
        return ans;
    }

    private static int minTimeUtil(Node root, int target)
    {
        if(root==null)
            return -1;

        if(root.data == target){
            ans=depth(root)-1;
            return 0;
        }

        int l = minTimeUtil(root.left, target);
        if(l>=0){
            ans=Math.max(ans, depth(root.right)+l+1);
            return l+1;
        }

        int r = minTimeUtil(root.right, target);
        if(r>=0){
            ans=Math.max(ans, depth(root.left)+r+1);
            return r+1;
        }
        return -1;
    }

    private static int depth(Node root){
        if(root==null)
            return 0;
        return Math.max(depth(root.left),depth(root.right))+1;
    }
}
