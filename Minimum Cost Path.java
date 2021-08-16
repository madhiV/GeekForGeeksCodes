class Solution
{
    //Function to return the minimum cost to react at bottom
	//right cell from top left cell.
    public int minimumCostPath(int[][] grid)
    {
        int[][] cost=new int[grid.length][grid.length];
        int[] p;
        int[][] dir=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
        int x=0,y;
        PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>(){
            @Override
            public int compare(int[] a,int[] b){
                if(a[2]>b[2]){
                    return 1;
                }
                return -1;
            }
        });
        pq.add(new int[]{0,0,grid[0][0]});
        cost[0][0]=grid[0][0];
        while(!pq.isEmpty()){
            p=pq.poll();
            if(p[0]==grid.length-1 && p[1]==grid.length-1){
                return p[2];
            }
            for(int[] k:dir){
                x=p[0]+k[0];
                y=p[1]+k[1];
                if(x==-1 || y==-1 || x==grid.length || y==grid.length || cost[x][y]!=0){
                    continue;
                }
                cost[x][y]=grid[x][y]+p[2];
                pq.add(new int[]{x,y,cost[x][y]});
            }
        }
        return 0;
    }
}
