/*
Node defined as
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution
{
    Set<Node> set;
    int max;
    //Function to return maximum path sum from any node in a tree.
    int findMaxSum(Node node)
    {
        max=Integer.MIN_VALUE;
        set=new HashSet<>();
        computeMax(node);
        return Math.max(max,computeMax(node));
    }
    private int computeMax(Node root){
        if(root==null){
            return 0;
        }
        if(!set.contains(root)){
            int leftSum,rightSum;
            leftSum=computeMax(root.left);
            rightSum=computeMax(root.right);
            max=Math.max(root.data+leftSum+rightSum,max);    
            root.data=Math.max(root.data,Math.max(root.data+rightSum,root.data+leftSum));
            max=Math.max(root.data,max);
            set.add(root);
        }
        return root.data;
    }
}
