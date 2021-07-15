
//User function Template for Java


/*
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/
class Solution{
    Set<Node> set;
    int sum;
    public int tiltTree(Node root){
        set=new HashSet<>();
        sum=0;
        findTilt(root);
        return sum;
    }
    public void findTilt(Node temp){
        if(temp==null){
            return;
        }
        int right,left;
        left=0;
        right=0;
        if(temp.left!=null){
            if(!set.contains(temp.left)){
                findTilt(temp.left);
            }
            left=temp.left.data;
        }
        if(temp.right!=null){
            if(!set.contains(temp.right)){
                findTilt(temp.right);
            }
            right=temp.right.data;
        }
        set.add(temp);
        temp.data+=left+right;
        sum+=Math.abs(left-right);
    }
}
