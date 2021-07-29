class Solution{
    static int[] arr1;
    static int key;
    static int searchInSorted(int arr[], int N, int K)
    {
        arr1=arr;
        key=K;
        return binSearch(0,arr.length-1);
    }
    static int binSearch(int l,int r){
        if(l<=r){
            int mid=(l+1+r)/2;
            if(arr1[mid]==key){
                return 1;
            }
            if(arr1[mid]<key){
                return binSearch(mid+1,r);
            }
            else{
                return binSearch(l,mid-1);
            }
        }
        return -1;
    }
}
