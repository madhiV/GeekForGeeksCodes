class Solution
{
    public static long count;
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    public static void mergeSort(long[] arr){
        if(arr.length!=1){
            int mid=(arr.length+1)/2;
            long[] a=new long[mid];
            long[] b=new long[arr.length-mid];
            for(int i=0,j=0;i<mid;i++,j++){
                a[i]=arr[j];
            }
            for(int i=0,k=mid;k<arr.length;k++,i++){
                b[i]=arr[k];
            }
            mergeSort(a);
            mergeSort(b);
            merge(a,b,arr);
        }
    }
    public static void merge(long[] a,long[] b,long[] arr){
        int i,j,k;
        i=j=k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                arr[k]=a[i];
                i++;
            }
            else{
                count+=a.length-i;
                arr[k]=b[j];
                j++;
            }
            k++;
        }
        while(i<a.length){
            arr[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            arr[k]=b[j];
            j++;
            k++;
        }
    }
    static long inversionCount(long arr[], long N)
    {
        count=0;
        mergeSort(arr);
        return count;
    }
}
