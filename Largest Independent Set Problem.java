/*
Structure of node class is as follows:
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    //table to store max subset with selecting the node
    Map<Node,Integer> dp;
    public int LISS(Node node){
        dp=new HashMap<>();
        return maxSubset(node);
    }
    public int maxSubset(Node temp){
        if(temp==null){
            return 0;
        }
        if(!dp.containsKey(temp)){
            int t;
            t=1;
            if(temp.left!=null){
                t+=maxSubset(temp.left.left);
                t+=maxSubset(temp.left.right);
            }
            if(temp.right!=null){
                t+=maxSubset(temp.right.left);
                t+=maxSubset(temp.right.right);
            }
            dp.put(temp,t);
        }
        return Math.max(dp.get(temp),(maxSubset(temp.left)+maxSubset(temp.right)));
    }
}
