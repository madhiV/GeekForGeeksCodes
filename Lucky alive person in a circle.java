class Solution{
    static int find(int N){
        double l=Math.log(N)/Math.log(2),temp,i;
        int ans;
        if(l%1==0){
            return 1;
        }
        l=Math.floor(l);
        temp=Math.pow(2,l+1)-1;
        i=temp;
        while(i!=N){
            i--;
            temp-=2;
        }
        return (int)temp;
    }
}
