class Solution
{
    public void  MakeZeros(int[][] matrix)
    {
        int[][] ans=new int[matrix.length][matrix[0].length];
        int[][] dir=new int[][]{{1,0},{-1,0},{0,-1},{0,1}};
        int x=0,y=0,sum;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                ans[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    sum=0;
                    for(int[] k:dir){
                        x=i+k[0];
                        y=j+k[1];
                        if(x==-1 || y==-1 || x==matrix.length || y==matrix[0].length){
                            continue;
                        }
                        ans[x][y]=0;
                        sum+=matrix[x][y];
                    }
                    ans[i][j]=sum;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=ans[i][j];
            }
        }
    }
}
