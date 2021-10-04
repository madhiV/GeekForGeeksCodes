class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
            if(hasCycle(-1,i,visited,adj)){
                return true;
            }
        }
        return false;
    }
    public boolean hasCycle(int par,int curr,boolean[] visited,ArrayList<ArrayList<Integer>> adj){
        visited[curr]=true;
        for(int k:adj.get(curr)){
            if(visited[k]){
                if(k!=par){
                    return true;
                }
                continue;
            }
            if(k==curr){
                return true;
            }
            if(hasCycle(curr,k,visited,adj)){
                return true;
            }
        }
        visited[curr]=false;
        return false;
    }
}
