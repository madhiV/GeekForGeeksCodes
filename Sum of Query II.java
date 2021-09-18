class Solution{
    List<Integer> querySum(int n, int arr[], int q, int queries[])
    {
        int l,r,sum;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        for(int i=0;i<q;i++){
            l=queries[2*i]-1;
            r=queries[2*i+1]-1;
            sum=arr[r];
            if(l!=0){
                sum-=arr[l-1];
            }
            al.add(sum);
        }
        return al;
    }
}
