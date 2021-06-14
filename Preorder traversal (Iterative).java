
//User function Template for Java

/* A Binary Tree node 

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class Tree
{
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> preOrder(Node root)
    {
        ArrayList<Integer> al=new ArrayList<>();
        Stack<Node> s=new Stack<>();
        s.add(root);
        Node p;
        while(s.size()>0){
            p=s.pop();
            al.add(p.data);
            if(p.right!=null){
                s.push(p.right);
            }
            if(p.left!=null){
                s.push(p.left);
            }
        }
        return al;
    }
}
