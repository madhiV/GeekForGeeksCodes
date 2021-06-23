
class Solution {
    public int evalTree(Node root) {
        // Your code here.
        if(root.data.charAt(0)>=48){
            return Integer.parseInt(String.valueOf(root.data));
        }
        int temp;
        switch(root.data.charAt(0)){
            case '+':
                temp=evalTree(root.left);
                return temp+evalTree(root.right);
            case '-':
                temp=evalTree(root.left);
                return temp-evalTree(root.right);
            case '*':
                temp=evalTree(root.left);
                return temp*evalTree(root.right);
            case '/':
                temp=evalTree(root.left);
                return temp/evalTree(root.right);
        }
        return 0;
    }
}
