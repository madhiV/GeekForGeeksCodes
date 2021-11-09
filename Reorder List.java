class gfg {
    Node h1,prev,ans;
    Node reorderlist(Node head) {
        if(head.next==null){
            return head;
        }
        int count=0,temp;
        Node p=head;
        h1=ans=head;
        prev=null;
        while(p!=null){
            count++;
            p=p.next;
        }
        count=count/2+1+count%2;
        temp=1;
        p=head;
        while(temp!=count){
            temp++;
            p=p.next;
        }
        reOrder(p);
        if(h1!=prev){
            prev.next=h1;
            h1.next=null;
        }
        return ans;
    }
    public void reOrder(Node p){
        if(p.next!=null){
            reOrder(p.next);
        }
        Node temp;
        temp=h1.next;
        h1.next=p;
        p.next=null;
        if(prev!=null){
            prev.next=h1;
        }
        prev=p;
        h1=temp;
    }
}
