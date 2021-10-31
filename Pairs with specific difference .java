class Solution { 
    public static int maxSumPairWithDifferenceLessThanK(int arr[], int N, int K) 
    {
        int i,sum;
        Arrays.sort(arr);
        i=N-1;
        sum=0;
        while(i>0){
            if(arr[i]-arr[i-1]<K){
                sum+=arr[i];
                i--;
                sum+=arr[i];
            }
            i--;
        }
        return sum;
    }
}
