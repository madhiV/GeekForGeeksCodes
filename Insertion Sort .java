class Solution
{
  static void insert(int arr[],int i)
  {
       int e=arr[i];
       while(i>0 && e<arr[i-1]){
           arr[i]=arr[i-1];
           i--;
       }
       arr[i]=e;
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      for(int i=1;i<n;i++){
           insert(arr,i);
       }
  }
}
