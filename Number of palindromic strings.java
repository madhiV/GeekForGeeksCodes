class Solution {
    int palindromicStrings(int N, int K) {
        boolean flag;
        long count,c=0,mod=1000000007,temp,j,charCount;
        for(int i=1;i<=N;i++){
            if(i==1 || i==2){
                c+=K;
                continue;
            }
            flag=true;
            charCount=K;
            j=i;
            temp=K;
            count=1;
            if(i%2==1){
                j--;
                count=(count*temp)%mod;
                temp--;
                charCount--;
            }
            while(j!=0){
                if(charCount<=0){
                    flag=false;
                    break;
                }
                count=(count*temp)%mod;
                j-=2;
                temp--;
                charCount--;
            }
            if(flag){
                c=(count+c)%mod;
            }
        }
        return (int)c;
    }
}
