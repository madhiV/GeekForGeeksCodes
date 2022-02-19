class Solution{
    public static int count;
    public static int supplyVaccine(Node root){
        count=0;
        supply(null,root);
        return count;
    }
    public static boolean supply(Node par,Node root){
        //Returns true if parent must have vaccine or not..
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            return true;
        }
        boolean flag;
        if(supply(root,root.left)){
            root.data=0;
            count++;
        }
        flag=supply(root,root.right);
        if(root.data!=0 && flag){
            root.data=0;
            count++;
        }
        if(root.data!=0){
            if(root.left!=null && root.left.data==0){
                return false;
            }
            if(root.right!=null && root.right.data==0){
                return false;
            }
            if(par==null){
                count++;
            }
            return true;
        }
        return false;
    }
}
