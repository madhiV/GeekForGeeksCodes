class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        Node p,n,temp;
        int carry=0,sum;
        temp=first;
        first=reverse(first);
        second=reverse(second);
        p=null;
        while(first!=null || second!=null){
            sum=carry;
            if(first!=null){
                sum+=first.data;
                first=first.next;
            }
            if(second!=null){
                sum+=second.data;
                second=second.next;
            }
            n=new Node(sum%10);
            n.next=p;
            p=n;
            carry=sum/10;
        }
        if(carry!=0){
            n=new Node(carry);
            n.next=p;
            p=n;
        }
        return p;
    }
    static Node reverse(Node p){
        Node temp,n=null;
        temp=p;
        while(p!=null){
            temp=p;
            p=p.next;
            temp.next=n;
            n=temp;
        }
        return n;
    }
}
