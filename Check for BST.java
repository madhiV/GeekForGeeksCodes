public class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)
    {
        return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public boolean isBST(Node root,int lb,int ub){
        if(root==null){
            return true;
        }
        if(root.data<ub && root.data>lb){
            return isBST(root.left,lb,root.data) && isBST(root.right,root.data,ub);
        }
        return false;
    }
}
