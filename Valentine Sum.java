/*
// node structure:

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

*/

class Solution{
    public static int sum,max;
    public static Stack<Object[]> st;
    static int sum_at_distK(Node root, int target, int k){
        int dist;
        Node p;
        Object[] obj;
        char c;
        sum=0;
        max=k;
        st=new Stack<>();
        dfs(root,target);
        dist=st.size()-1;
        while(!st.isEmpty()){
            obj=st.pop();
            p=(Node)obj[0];
            c=(char)(obj[1]);
            if(dist<=k){
                sum+=p.data;
                if(c=='L'){
                    sumUp(p.right,dist+1);
                }
                else if(c=='R') {
                    sumUp(p.left,dist+1);
                }
                else{
                    sumUp(p.right,1);
                    sumUp(p.left,1);
                }
            }
            dist--;
        }
        return sum;
    }
    public static boolean dfs(Node root,int target){
        if(root==null){
            return false;
        }
        if(root.data==target){
            st.push(new Object[]{root,'S'});
            return true;
        }
        if(dfs(root.left,target)){
            st.push(new Object[]{root,'L'});
            return true;
        }
        else if(dfs(root.right,target)){
            st.push(new Object[]{root,'R'});
            return true;
        }
        return false;
    }
    public static void sumUp(Node root,int distance){
        if(root==null){
            return;
        }
        if(distance>max){
            return;
        }
        sum+=root.data;
        sumUp(root.left,distance+1);
        sumUp(root.right,distance+1);
    }
}
