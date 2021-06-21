class Solution
{
    static void leftRotate(long arr[], int k,int n)
    {
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
    }
    static void reverse(long[] arr,int l,int r){
        long temp;
        while(l<r){
            temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
