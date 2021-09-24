
class Node{
    int data;
    Node right,left;
    Node(int data){
        this.data=data;
    }
}
class Solution
{
    public static Map<Integer,Integer> pre,in,post;
    public static int preIndex;
    public static int[] preOrder,inOrder,postOrder;
    static boolean checktree(int preorder[], int inorder[], int postorder[], int N)
    {
        ArrayList<Integer> al=new ArrayList<>();
        Node root1,root2;
        pre=new HashMap<>();
        in=new HashMap<>();
        post=new HashMap<>();
        preOrder=preorder;
        inOrder=inorder;
        postOrder=postorder;
        
        //Storing element,index pair of each array to map
        for(int i=0;i<N;i++){
            pre.put(preorder[i],i);
        }
        for(int i=0;i<N;i++){
            post.put(postorder[i],i);
        }
        for(int i=0;i<N;i++){
            in.put(inorder[i],i);
        }
        
        //Checking if all node values are same in 3 arrays...
        for(int i=0;i<N;i++){
            if(!in.containsKey(preOrder[i]) || !post.containsKey(preOrder[i])){
                return false;
            }
        }
        preIndex=0;
        root1=constructPreIn(in.get(preorder[0]),0,N-1);
        //root2=constructPostIn(in.get(postorder[N-1]),0,N-1);
        
        traverse(root1,al);
        
        return isArrayEqual(al,postorder);
    }
    
    public static Node constructPreIn(int index,int l,int r){
        if(l==r){
            preIndex++;
            return new Node(inOrder[index]);
        }
        preIndex++;
        Node root=new Node(inOrder[index]);
        
        if(index!=l){
            //Left
            for(int i=l;i<index;i++){
                if(preOrder[preIndex]==inOrder[i]){
                    root.left=constructPreIn(i,l,index-1);
                    break;
                }
            }
        }
        
        if(index!=r){
            //Right
            for(int i=index+1;i<=r;i++){
                if(preOrder[preIndex]==inOrder[i]){
                    root.right=constructPreIn(i,index+1,r);
                    break;
                }
            }
        }
        
        return root;
    }
    public static boolean isArrayEqual(ArrayList<Integer> al,int[] a){
        if(al.size()!=a.length){
            return false;
        }
        for(int i=0;i<a.length;i++){
            if(al.get(i)!=a[i]){
                return false;
            }
        }
        return true;
    }
    // public static Node constructPostIn(int index,int l,int r){
    //     //System.out.println(index+" "+l+" "+r);
    //     if(l==r){
    //         return new Node(inOrder[index]);
    //     }
        
    //     Node root=new Node(inOrder[index]);
    //     int nearest=-1;
    //     if(l!=index){
    //         for(int i=l;i<index;i++){
    //             if(post.get(inOrder[i])<post.get(inOrder[index]) && (nearest==-1 || post.get(inOrder[i])>post.get(inOrder[nearest]))){
    //                 nearest=i;
    //             }
    //         }
    //         if(nearest!=-1){
    //             root.left=constructPostIn(nearest,l,index-1);
    //         }
    //     }
        
    //     if(r!=index){
    //         nearest=-1;
    //         for(int i=index+1;i<=r;i++){
    //             if(post.get(inOrder[i])<post.get(inOrder[index])  && (nearest==-1 || post.get(inOrder[i])>post.get(inOrder[nearest]))){
    //                 nearest=i;
    //             }
    //         }
    //         if(nearest!=-1){
    //             root.right=constructPostIn(nearest,index+1,r);
    //         }
    //     }
        
    //     return root;
    // }
    
    // public static boolean isTreeEqual(Node root1,Node root2){
    //     if(root1==null && root2==null){
    //         return true;
    //     }
        
    //     if(root1==null || root2==null || (root1.data!=root2.data)){
    //         return false;
    //     }
        
    //     return isTreeEqual(root1.right,root2.right) && isTreeEqual(root1.left,root2.left);
    // }
    
    public static void traverse(Node root,ArrayList<Integer> al){
        if(root==null){
            return;
        }
        traverse(root.left,al);
        traverse(root.right,al);
        al.add(root.data);
    }
}
