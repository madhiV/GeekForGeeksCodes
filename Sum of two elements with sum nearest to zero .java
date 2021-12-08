class Sol
{
    public static int closestToZero (int arr[], int n)
    {
        Arrays.sort(arr);
        int i,j,sum,min,ans;
        i=0;
        j=n-1;
        min=Integer.MAX_VALUE;
        ans=-1;
        while(i<j){
            sum=arr[i]+arr[j];
            if(Math.abs(sum)<min){
                min=Math.abs(sum);
                ans=sum;
            }
            else if(Math.abs(sum)==min){
                ans=Math.max(ans,sum);
            }
            if(Math.abs(arr[i])<Math.abs(arr[j])){
                j--;
            }
            else{
                i++;
            }
        }
        return ans;
    }
}
