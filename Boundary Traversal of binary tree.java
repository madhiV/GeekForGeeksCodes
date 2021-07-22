//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }

class Solution
{
	ArrayList <Integer> printBoundary(Node node)
	{
	    Node p;
	    Stack<Node> s;
	    Set<Node> set;
	    ArrayList<Integer> al,right;
	    set=new HashSet<>();
	    s=new Stack<>();
	    al=new ArrayList<>();
	    right=new ArrayList<>();
	    set.add(node);
	    al.add(node.data);
	    if(node.left!=null){
	        s.push(node.left);
	    }
	    //Left
	    while(!s.isEmpty()){
	        p=s.pop();
	        set.add(p);
	        if(p.left!=null){
	            s.push(p.left);
	        }
	        else{
	            if(p.right!=null){
	                s.push(p.right);
	            }
	        }
	        al.add(p.data);
	    }
	    //Right
	    if(node.right!=null){
	        s.push(node.right);
	    }
	    while(!s.isEmpty()){
	        p=s.pop();
	        set.add(p);
	        right.add(0,p.data);
	        if(p.right!=null){
	            s.push(p.right);
	        }
	        else{
	            if(p.left!=null){
	                s.push(p.left);
	            }
	        }
	    }
	    //Leaf
	    s.push(node);
	    while(!s.isEmpty()){
	        p=s.pop();
	        if(p.right==null && p.left==null && !set.contains(p)){
	            set.add(p);
	            al.add(p.data);
	        }
	        if(p.right!=null){
	            s.push(p.right);
	        }
	        if(p.left!=null){
	            s.push(p.left);
	        }
	    }
	    for(int k:right){
	        al.add(k);
	    }
	    return al;
	}
}
