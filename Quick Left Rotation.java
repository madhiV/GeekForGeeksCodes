class Solution
{
    static void leftRotate(long arr[], int k,int n)
    {
        k=k%n;
        Queue<Long> q=new LinkedList<>();
        for(int i=0;i<k;i++){
            q.add(arr[i]);
        }
        int i=0;
        for(int j=k;j<n;j++){
            arr[i]=arr[j];
            i++;
        }
        while(!q.isEmpty()){
            arr[i]=q.poll();
            i++;
        }
