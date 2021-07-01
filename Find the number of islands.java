class Solution
{
    //Function to find the number of islands.
    public int numIslands(char[][] grid)
    {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    makeZero(grid,i,j);
                }
            }
        }
        return count;
    }
    public void makeZero(char[][] grid,int i,int j){
        grid[i][j]=0;
        //Up
        if(i-1>=0 && grid[i-1][j]=='1'){
            makeZero(grid,i-1,j);
        }
        //Down
        if(i+1<grid.length && grid[i+1][j]=='1'){
            makeZero(grid,i+1,j);
        }
        //Left
        if(j-1>=0 && grid[i][j-1]=='1'){
            makeZero(grid,i,j-1);
        }
        //Right
        if(j+1<grid[0].length && grid[i][j+1]=='1'){
            makeZero(grid,i,j+1);
        }
        //Up-Left
        if(i-1>=0 && j-1>=0 && grid[i-1][j-1]=='1'){
            makeZero(grid,i-1,j-1);
        }
        //Up-Right
        if(i-1>=0 && j+1<grid[0].length && grid[i-1][j+1]=='1'){
            makeZero(grid,i-1,j+1);
        }
        //Down-Left
        if(i+1<grid.length && j-1>=0 && grid[i+1][j-1]=='1'){
            makeZero(grid,i+1,j-1);
        }
        //Down-right
        if(i+1<grid.length && j+1<grid[0].length && grid[i+1][j+1]=='1'){
            makeZero(grid,i+1,j+1);
        }
    }
}
