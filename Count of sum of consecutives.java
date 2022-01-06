class Solution {
    static int getCount(int N) {
        int sum,start,i,count;
        count=0;
        sum=N;
        start=N;
        i=N-1;
        while(i>=1){
            sum+=i;
            while(sum>=N){
                if(sum==N){
                    count++;
                }
                sum-=start;
                start--;
            }
            i--;
        }
        return count;
    }
};
