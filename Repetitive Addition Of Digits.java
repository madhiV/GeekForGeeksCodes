class Solution{
    public static int evenSum(long n){
        long temp,sum=0;
        while(n>0){
            temp=n%10;
            sum+=temp;
            n/=10;
        }
        if(sum<10){
            return (int)sum;
        }
        return (int)evenSum(sum);
    }
    static int singleDigit(long N){
        return evenSum(N);
    }
}
