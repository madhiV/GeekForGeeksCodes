class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        ArrayList<Integer> al=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int i=0,j=0;
        while(j<K && i<K){
            pq.add(arr[i][j]);
            j++;
            if(j==K){
                j=0;
                i++;
            }
        }
        while(!pq.isEmpty()){
            al.add(pq.poll());
        }
        return al;
    }
}
