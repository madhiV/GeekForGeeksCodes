class Solution{
    public static Integer[][] dp=null;
    public static int countShakes(int lb,int ub){
        if(ub-lb==1 || lb>ub){
            return 1;
        }
        if(dp[lb][ub]!=null){
            return dp[lb][ub];
        }
        if(ub-lb%2==0){
            return 0;
        }
        int count=0,temp,t;
        for(int i=lb+1;i<=ub;i++){
            if(i==lb+1){
                temp=countShakes(lb+2,ub);
                count+=temp;
            }
            else if(i==ub){
                temp=countShakes(lb+1,ub-1);
                count+=temp;
            }
            else{
                temp=countShakes(lb+1,i-1);
                t=temp;
                temp=countShakes(i+1,ub);
                count=count+(t*temp);
            }
        }
        dp[lb][ub]=count;
        return count;
    }
    static int count(int N) 
    { 
        dp=new Integer[N+1][N+1];
        return countShakes(1,N);
    }
}
