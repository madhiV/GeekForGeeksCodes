class Solution {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {
        // Your code here
        if(node == null){
            return;
        }
        Node p;
        p=node.left;
        node.left=node.right;
        node.right=p;
        mirror(node.left);
        mirror(node.right);
    }
}
