//User function Template for Java

/* class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */
class Solution
{
    public int max;
    int maxPathSum(Node root)
    { 
        max=Integer.MIN_VALUE;
        computeMax(root);
        if(root.left==null || root.right==null){
            max=Math.max(root.data,max);
        }
        return max;
    } 
    public int computeMax(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        if(root.right==null && root.left==null){
            return root.data;
        }
        int val=root.data,max=Integer.MIN_VALUE;
        computeMax(root.left);
        computeMax(root.right);
        if(root.right!=null){
            val+=root.right.data;
            max=Math.max(max,root.right.data);
        }
        if(root.left!=null){
            val+=root.left.data;
            max=Math.max(max,root.left.data);
        }
        if(root.left!=null && root.right!=null){
            this.max=Math.max(this.max,val);
        }
        root.data+=max;
        return root.data;
    }
}
