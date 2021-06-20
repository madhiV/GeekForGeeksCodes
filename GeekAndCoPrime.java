class Solution{
    long sum(long N, long M){
        long gcd=1,r,n=N,m=M;
        while(m!=0){
            r=n%m;
            n=m;
            m=r;
        }
        return M/n+N/n;
    }
}
