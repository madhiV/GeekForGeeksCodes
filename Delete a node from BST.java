class Tree {
    public static Node rt;
    // Function to delete a node from BST.
    public static Node deleteNode(Node root, int X) {
        rt=root;
        searchNode(root,null,X);
        return rt;
    }
    public static void searchNode(Node root,Node par,int val){
        if(root==null){
            return;
        }
        if(root.data==val){
            delete(root,par);
            return;
        }
        if(root.data>val){
            searchNode(root.left,root,val);
        }
        else{
            searchNode(root.right,root,val);
        }
    }
    public static void delete(Node root,Node parent){
        Node p,succ;
        //Leaf
        if(root.right==null && root.left==null){
            if(parent==null){
                rt=null;
            }
            else{
                if(parent.right==root){
                    parent.right=null;
                }
                else{
                    parent.left=null;
                }
            }
        }
        //Node with only right child null 
        else if(root.right==null && root.left!=null){
            if(parent==null){
                rt=root.left;
            }
            else if(parent.right==root){
                parent.right=root.left;
            }
            else{
                parent.left=root.left;
            }
        }
        //Node with only left child null
        else if(root.right!=null && root.left==null){
            if(parent==null){
                rt=root.right;
            }
            else if(parent.right==root){
                parent.right=root.right;
            }
            else{
                parent.left=root.right;
            }
        }
        //Node with both child
        else {
            p=root;
            succ=root.right;
            while(succ.left!=null){
                p=succ;
                succ=succ.left;
            }
            p.data=succ.data;
            p.right=succ.right;
        }
    }
}
