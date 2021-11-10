/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        Node list2,p;
        int count=0,temp=1;
        p=head;
        while(p!=null){
            count++;
            p=p.next;
        }
        count=(count/2)+1+count%2;
        p=head;
        while(temp!=count){
            p=p.next;
            temp++;
        }
        list2=reverse(p);
        if(isEqual(head,list2)){
            return true;
        }
        return false;
    }    
    public Node reverse(Node head){
        Node prev=null,p,temp=null;
        p=head;
        while(p!=null){
            temp=p;
            p=p.next;
            temp.next=prev;
            prev=temp;
        }
        return temp;
    }
    public boolean isEqual(Node l1,Node l2){
        while(l2!=null){
            if(l1.data!=l2.data){
                return false;
            }
            l1=l1.next;
            l2=l2.next;
        }
        return true;
    }
}
