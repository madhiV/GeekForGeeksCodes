// { Driver Code Starts
// Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                // adj.get(v).add(u);
            }
            String[] S1 = br.readLine().trim().split(" ");
            int source = Integer.parseInt(S1[0]);
            int destination = Integer.parseInt(S1[1]);
            Solution obj = new Solution();
            System.out.println(obj.countPaths(V, adj, source, destination));
        }
    }
}
// } Driver Code Ends


class Solution {
    public int count;
    // Function to count paths between two vertices in a directed graph.
    public int countPaths(int V, ArrayList<ArrayList<Integer>> adj, int source,
                   int destination) {
        count=0;
        ArrayList<Integer> l;
        int[] visited=new int[V];
        int s,d;
        dfs(adj,visited,source,destination);
        return count;
    }
    public void dfs(ArrayList<ArrayList<Integer>> adj,int[] visited,int v,int dest){
        if(v==dest){
            count++;
            return;
        }
        visited[v]=1;
        ArrayList<Integer> l=adj.get(v);
        for(int k:l){
            if(visited[k]==0){
                visited[k]=1;
                dfs(adj,visited,k,dest);
                visited[k]=0;
            }
        }
        visited[v]=0;
    }
}
