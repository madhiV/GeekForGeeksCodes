class Solution
{   
    // arr[] : the input array 
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int N)
	{
	    int count=1,max=1;
	   Arrays.sort(arr);
	   for(int i=0;i<N-1;i++){
	       if(arr[i+1]-1==arr[i]){
	           count++;
	           max=Math.max(count,max);
	       }
	       else if(arr[i+1]==arr[i]){
	           continue;
	       }
	       else{
	           count=1;
	       }
	   }
	   return max;
	}
}
