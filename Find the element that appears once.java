class Sol
{
    static int[] arr;
    public static int search(int A[], int N)
    {
        if(A.length==1){
            return A[0];
        }
        if(A[0]!=A[1]){
            return A[0];
        }
        if(A[N-1]!=A[N-2]){
            return A[N-1];
        }
        arr=A;
        return binSearch(0,N-1);
    }
    public static int binSearch(int l,int r){
        if(l==r && l!=arr.length-1 && l!=0){
            if(arr[l]!=arr[l+1] && arr[l]!=arr[l-1]){
                return arr[l];
            }
            return -1;
        }
        if(l<r){
            int mid=(l+r)/2;
            if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]){
                return arr[mid];
            }
            return Math.max(binSearch(l,mid-1),binSearch(mid+1,r));
        }
        return -1;
    }
}
