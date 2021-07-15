class Solution {
    // Function to get the maximum width of a binary tree.
    int getMaxWidth(Node root) {
        int max=0,size;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        Node p;
        while(!q.isEmpty()){
            size=q.size();
            max=Math.max(max,size);
            for(int i=0;i<size;i++){
                p=q.poll();
                if(p.left!=null){
                    q.add(p.left);
                }
                if(p.right!=null){
                    q.add(p.right);
                }
            }
        }
        return max;
    }
}
