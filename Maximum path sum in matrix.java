class Solution{
    static int maximumPath(int N, int Matrix[][])
    {
        int max;
        for(int i=N-2;i>=0;i--){
            for(int j=0;j<N;j++){
                max=Matrix[i+1][j];
                if(j!=0){
                    max=Math.max(max,Matrix[1+i][j-1]);
                }
                if(j!=N-1){
                    max=Math.max(max,Matrix[1+i][j+1]);
                }
                Matrix[i][j]+=max;
            }
        }
        max=Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            max=Math.max(max,Matrix[0][i]);
        }
        return max;
    }
}
