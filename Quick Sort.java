class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        if(low<high){
            int j=partition(arr,low,high+1);
            quickSort(arr,low,j-1);
            quickSort(arr,j+1,high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        int i=low,j=high;
        int pivot=arr[low],temp;
        while(i<j){
            do{
                i++;
            }while(i<j && arr[i]<=pivot);
            do{
                j--;
            }while(j>0 && arr[j]>pivot);
            if(i<j){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        arr[low]=arr[j];
        arr[j]=pivot;
        return j;
    } 
}
