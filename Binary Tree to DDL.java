
//User function Template for Java

/* class Node
class Node
{
	Node left, right;
	int data;
	
	Node(int d)
	{
		data = d;
		left = right = null;
	}
	
}*/

//This function should return head to the DLL

class Solution
{
    Node head,leftMost;
    //Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root)
    {
        leftMost=null;
    	head=null;
    	leftMost(root);
    	constructDLL(root);
    	return head;
    }
    public void leftMost(Node root){
        if(root.left==null){
            leftMost=root;
            return;
        }
        leftMost(root.left);
    }
    public Node constructDLL(Node root){
        Node p=new Node(root.data),temp,l=null;
        if(root==leftMost){
            head=p;
        }
        if(root.left!=null){
            l=temp=constructDLL(root.left);
            while(temp.right!=null){
                temp=temp.right;
            }
            p.left=temp;
            temp.right=p;
        }
        if(root.right!=null){
            temp=constructDLL(root.right);
            while(temp.left!=null){
                temp=temp.left;
            }
            p.right=temp;
            temp.left=p;
        }
        if(l==null){
            return p;
        }
        return l;
    }
}
