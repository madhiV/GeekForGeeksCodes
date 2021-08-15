class Solution {
    static Long[] distributeCandies(int N, int K) {
        Long[] arr=new Long[K];
        for(int i=0;i<K;i++){
            arr[i]=(long)0;
        }
        int sum,round=0;
        while(N!=0){
            for(int i=0;i<K;i++){
                sum=(i+1)+(round*K);
                if(N>sum){
                    arr[i]+=sum;
                    N-=sum;
                }
                else{
                    arr[i]+=(long)N;
                    N=0;
                    break;
                }
            }
            round++;
        }
        return arr;
    }
}
