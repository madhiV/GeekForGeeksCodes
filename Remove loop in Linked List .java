class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        int n=0;
        Node fast,slow;
        slow=fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                break;
            }
        }
        if(fast==null || fast.next==null){
            return;
        }
        fast=fast.next.next;
        slow=slow.next;
        while(fast!=slow){
            slow=slow.next;
            fast=fast.next.next;
            n++;
        }
        n++;
        fast=head;
        slow=head;
        while(n!=0){
            fast=fast.next;
            n--;
        }
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        while(slow.next!=fast){
            slow=slow.next;
        }
        slow.next=null;
    }
}
