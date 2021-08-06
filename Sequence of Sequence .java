class Solution{
    static int ans,N,M;
    static int numberSequence(int m, int n)
    {
        N=n;
        M=m;
        ans=0;
        computeAns(0,0);
        return ans;
    }
    public static void computeAns(int index,int prev){
        if(index==N){
            ans++;
            return;
        }
        if(prev==0){
            for(int i=1;i<=M;i++){
                computeAns(index+1,i);
            }
            return;
        }
        for(int i=prev*2;i<=M;i++){
            computeAns(index+1,i);
        }
    }
}
