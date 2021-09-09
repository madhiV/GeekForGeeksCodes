class Solution
{
    public static Stack<Integer> s;
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        s=new Stack<Integer>();
        int[] visited=new int[V];
        for(int i=0;i<V;i++){
            dfs(i,visited,adj);
        }
        for(int i=0;i<V;i++){
            visited[i]=s.pop();
        }
        return visited;
    }
    public static void dfs(int index,int[] visited,ArrayList<ArrayList<Integer>> al){
        if(visited[index]==1){
            return;
        }
        for(int i=0;i<al.get(index).size();i++){
            dfs(al.get(index).get(i),visited,al);
        }
        visited[index]=1;
        s.push(index);
    }
}
