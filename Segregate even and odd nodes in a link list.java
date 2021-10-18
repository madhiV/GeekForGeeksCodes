//User function Template for Java

/* 
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution{
    Node divide(int N, Node head){
        Node odd,even,oddPrev,evenPrev,p;
        p=head;
        odd=even=oddPrev=evenPrev=null;
        while(p!=null){
            if(p.data%2==0){
                if(even==null){
                    even=p;
                    evenPrev=p;
                }
                else{
                    evenPrev.next=p;
                    evenPrev=p;
                }
            }
            else{
                if(odd==null){
                    odd=p;
                    oddPrev=p;
                }
                else{
                    oddPrev.next=p;
                    oddPrev=p;
                }
            }
            p=p.next;
        }
        if(even==null){
            return odd;
        }
        evenPrev.next=odd;
        if(oddPrev==null){
            return even;
        }
        oddPrev.next=null;
        return even;
    }
}
