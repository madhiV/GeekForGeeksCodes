class Solution
{
    static Integer[][] dp=null;
    //Function to find total number of unique paths.
    public static int NumberOfPath(int a, int b) 
    {
        dp=new Integer[a][b];
        return computeCount(0,0,a-1,b-1);
    }
    public static int computeCount(int i,int j,int m,int n){
        if(i==m && j==n){
            return 1;
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        dp[i][j]=0;
        if(i!=m){
            dp[i][j]+=computeCount(i+1,j,m,n);
        }
        if(j!=n){
            dp[i][j]+=computeCount(i,j+1,m,n);
        }
        return dp[i][j];
    }
}
