class Solution{
    int i;
    int[] pre;
    char[] preLN;
    Node constructTree(int n, int pre[], char preLN[]){
	    i=0;
	    this.pre=pre;
	    this.preLN=preLN;
	    return construct();
    }
    public Node construct(){
        if(i==pre.length){
            return null;
        }
        int index=i;
        Node p=new Node(pre[i]);
        i++;
        if(preLN[i-1]=='L'){
            return p;
        }
        p.left=construct();
        p.right=construct();
        return p;
    }
}
