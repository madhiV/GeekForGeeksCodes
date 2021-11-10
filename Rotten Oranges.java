class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
        int time=0,size,x,y,temp=0,count=0;
        boolean freshOrange;
        int[][] dir=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
        int[] p;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    count++;
                }
            }
        }
        while(!q.isEmpty()){
            temp++;
            size=q.size();
            while(size-->0){
                p=q.poll();
                for(int[] k:dir){
                    x=k[0]+p[0];
                    y=k[1]+p[1];
                    if(x==-1 || y==-1 || x==grid.length || y==grid[0].length || grid[x][y]==0){
                        continue;
                    }
                    if(grid[x][y]==1){
                        time=temp;
                        count--;
                    }
                    grid[x][y]=0;
                    q.add(new int[]{x,y});
                }
            }
        }
        if(count>0){
            return -1;
        }
        return time;
    }
}
