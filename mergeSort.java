class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
    }
    void mergeSort(int arr[], int l, int r)
    {
        int mid;
        if(arr.length>1){
            mid=arr.length/2;
            int[] a=new int[mid];
            int[] b=new int[arr.length-mid];
            for(int i=0;i<mid;i++){
                a[i]=arr[i];
            }
            for(int j=0,k=mid;k<arr.length;j++,k++){
                b[j]=arr[k];
            }
            mergeSort(a,0,0);
            mergeSort(b,0,0);
            merge(a,b,arr);
        }
    }
    void merge(int[] a,int[] b,int[] arr){
        int i,j,k,n1,n2;
        i=j=k=0;
        n1=a.length;
        n2=b.length;
        while(i<n1 && j<n2){
            if(a[i]<=b[j]){
                arr[k]=a[i];
                i++;
            }
            else {
                arr[k]=b[j];
                j++;
            }
            k++;
        }
        for(;i<n1;i++,k++){
            arr[k]=a[i];
        }
        for(;j<n2;j++,k++){
            arr[k]=b[j];
        }
    }
}
