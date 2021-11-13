class Solution
{
    public static Node reverseBetween(Node head, int m, int n)
    {
        int count=1;
        Node p=head,prev=null;
        while(count!=m){
            prev=p;
            p=p.next;
            count++;
        }
        if(prev==null){
            return reverse(head,m,n);
        }
        prev.next=reverse(p,m,n);
        return head;
    }
    public static Node reverse(Node head,int m,int n){
        Node p,prev,top;
        if(m==n){
            return head;
        }
        p=top=head;
        prev=null;
        while(m!=n){
            p=head;
            head=head.next;
            p.next=prev;
            prev=p;
            m++;
        }
        p=head;
        head=head.next;
        p.next=prev;
        prev=p;
        top.next=head;
        return prev;
    }
}
