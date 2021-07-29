//User function Template for Java

/*
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
*/

class Solution {
    long[] arr;
    int left,right,flag;
    long key;
    public pair indexes(long v[], long x)
    {
        key=x;
        arr=v;
        left=right=flag=0;
        computeLeft(0,v.length-1);
        computeRight(0,v.length-1);
        if(right==0 && v[v.length-1]==x){
            if(left==0 && v[v.length-1]==x){
                return new pair(left,right);
            }
            return new pair(left+1,v.length-1);
        }
        if(left==0 && v[0]==x){
            return new pair(left,right-1);
        }
        if(flag==0){
            return new pair(-1,-1);
        }
        return new pair(left+1,right-1);
    }
    public void computeLeft(int l,int r){
        if(l<=r){
            int mid=(l+r+1)/2;
            if(arr[mid]==key){
                flag=1;
            }
            if(arr[mid]>=key){
                computeLeft(l,mid-1);
            }
            else{
                left=mid;
                computeLeft(mid+1,r);
            }
        }
    }
    public void computeRight(int l,int r){
        if(l<=r){
            int mid=(l+r+1)/2;
            if(arr[mid]==key){
                flag=1;
            }
            if(arr[mid]<=key){
                computeRight(mid+1,r);
            }
            else{
                right=mid;
                computeRight(l,mid-1);
            }
        }
    }
}
