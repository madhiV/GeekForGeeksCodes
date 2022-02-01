class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        int temp;
        int[] ans=new int[V],visited=new int[V],p;
        PriorityQueue<int[]> pq=new PriorityQueue<int[]>(
            new Comparator<int[]>(){
                @Override
                public int compare(int[] a,int[] b){
                    if(a[1]>b[1]){
                        return 1;
                    }
                    return -1;
                }
            }
        );
        visited[S]=0;
        pq.add(new int[]{S,0});
        while(!pq.isEmpty()){
            p=pq.poll();
            if(visited[p[0]]==1){
                continue;
            }
            visited[p[0]]=1;
            ans[p[0]]=p[1];
            for(List<Integer> k:adj.get(p[0])){
                temp=k.get(0);
                if(visited[temp]==0){
                    pq.add(new int[]{temp,p[1]+k.get(1)});
                }
            }
        }
        return ans;
    }
}
