class Solution
{   
    public static int lb,ub;
    public static ArrayList<Integer> al;
    //Function to return a list of BST elements in a given range.
	public static ArrayList<Integer> printNearNodes(Node root,int low,int high) {
	    al=new ArrayList<>();
        lb=low;
        ub=high;
        computeNos(root);
        return al;
    }
    public static void computeNos(Node root){
        if(root==null){
            return;
        }
        computeNos(root.left);
        if(root.data<=ub && root.data>=lb){
            al.add(root.data);
        }
        computeNos(root.right);
    }
}
