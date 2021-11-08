
//User function Template for Java


/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/

class Tree
{
    Set<Node> set;
    public int count;
    //Function to count number of subtrees having sum equal to given sum.
    int countSubtreesWithSumX(Node root, int X)
    {
        set=new HashSet<>();
    	count=0;
    	computeCount(root,X);
    	return count;
    }
    public int computeCount(Node root,int target){
        if(root==null){
            return 0;
        }
        if(set.contains(root)){
            return root.data;
        }
        root.data+=computeCount(root.left,target);
        root.data+=computeCount(root.right,target);
        if(root.data==target){
            count++;
        }
        set.add(root);
        return root.data;
    }
}
