class Solution
{
    static Node temp,temp1,temp2;
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        int count=0;
        temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        mergeSort(head,count);
        return head;
    }
    static void mergeSort(Node head,int n){
        if(n>1){
            Node a=null,b=null;
            temp1=a;
            temp2=b;
            temp=head;
            int mid=(n+1)/2,count=1,n1=mid,n2=n-mid;
            while(count<=mid){
                if(temp1==null){
                    temp1=new Node(temp.data);
                    a=temp1;
                }
                else{
                    temp1.next=new Node(temp.data);
                    temp1=temp1.next;
                }
                temp=temp.next;
                count++;
            }
            while(count<=n){
                if(temp2==null){
                    b=temp2=new Node(temp.data);
                }
                else{
                    temp2.next=new Node(temp.data);
                    temp2=temp2.next;
                }
                temp=temp.next;
                count++;
            }
            //printLL(a);
            //printLL(b);
            mergeSort(a,n1);
            mergeSort(b,n2);
            merge(a,b,head);
        }
    }
    static void merge(Node a,Node b,Node head){
        temp=head;
        temp1=a;
        temp2=b;
        while(temp1!=null && temp2!=null){
            if(temp1.data<=temp2.data){
                temp.data=temp1.data;
                temp1=temp1.next;
            }
            else{
                temp.data=temp2.data;
                temp2=temp2.next;
            }
            temp=temp.next;
        }
        while(temp1!=null){
            temp.data=temp1.data;
            temp1=temp1.next;
            temp=temp.next;
        }
        while(temp2!=null){
            temp.data=temp2.data;
            temp2=temp2.next;
            temp=temp.next;
        }
    }
    static void printLL(Node head){
        Node temp4=head;
        while(temp4!=null){
            System.out.print(temp4.data+" ");
            temp4=temp4.next;
        }
        System.out.println();
    }
}
