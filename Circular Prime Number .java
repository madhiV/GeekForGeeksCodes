class Solution
{
    public int isCircularPrime(int n)
    {
        if(n==1){
            return 0;
        }
        int temp,digits=0;
        temp=n;
        while(temp!=0){
            digits++;
            temp/=10;
        }
        for(int i=0;i<digits;i++){
            if(!isPrime(n)){
                return 0;
            }
            temp=n%10;
            n/=10;
            n+=temp*mul10(digits-1);
        }
        return 1;
    }
    public int mul10(int n){
        if(n==0){
            return 1;
        }
        int ans=1;
        for(int i=0;i<n;i++){
            ans*=10;
        }
        return ans;
    }
    public boolean isPrime(int n){
        for(int i=2;i<(int)(Math.sqrt(n))+1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
