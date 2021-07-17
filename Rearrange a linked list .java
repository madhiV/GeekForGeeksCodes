
/*

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
This is method only submission.
You only need to complete the below method.
*/
class Solution
{

   // Should rearrange given linked list such that all even
   // positioned Nodes are before odd positioned.
   // Returns nothing
    void rearrangeEvenOdd(Node head)
    {
        Node p,temp1,temp2,odd,even;
        odd=even=temp1=temp2=null;
        while(head!=null){
            p=head;
            head=head.next;
            p.next=null;
            if(odd==null){
                odd=p;
                temp1=odd;
            }
            else{
                temp1.next=p;
                temp1=p;
            }
            if(head==null){
                break;
            }
            p=head;
            head=head.next;
            p.next=null;
            if(even==null){
                even=p;
                temp2=even;
            }
            else{
                temp2.next=p;
                temp2=p;
            }
        }
        temp1.next=even;
        head=odd;
    }
}
