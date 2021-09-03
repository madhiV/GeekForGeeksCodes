class Solution
{
    Long[][][] dp=null;
    int[][] matrix=new int[][]{{1,2,3},{4,5,6},{7,8,9},{-1,0,-1}};
    int n;
    long count;
	public long getCount(int N)
	{
	    dp=new Long[4][3][N+1];
		count=0;
		n=N;
		for(int i=0;i<4;i++){
		    for(int j=0;j<3;j++){
                if(matrix[i][j]==-1){
                    continue;
                }
                count+=computeCount(i,j,1);
		    }
		}
		return count;
	}
	public long computeCount(int i,int j,int count){
	    if(count==n){
	        return 1;
	    }
	    int x,y;
	    long sum=0;
	    int[][] dir=new int[][]{{1,0},{-1,0},{0,0},{0,1},{0,-1}};
	    for(int[] k:dir){
	        x=k[0]+i;
	        y=k[1]+j;
	        if(x==4 || y==3 || x==-1 || y==-1 || matrix[x][y]==-1){
	            continue;
	        }
	        if(dp[x][y][count+1]==null){
	            dp[x][y][count+1]=computeCount(x,y,count+1);
	        }
	        sum+=dp[x][y][count+1];
	    }
	    return sum;
	}
}
