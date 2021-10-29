class Solution {
    public int find_min(int[] a, int n, int k) {
        int socks,p,temp,oneCount;
        p=oneCount=socks=0;
        
        //Drawing one sock from each color...
        for(int i=0;i<n;i++){
            if(a[i]>0){
                socks++;
            }
            a[i]--;
        }
        
        for(int i=0;i<n;i++){
            temp=a[i];
            a[i]%=2;
            if(a[i]==1){
                oneCount++;
            }
            if(p+(temp/2)>=k){
                return (k-p)*2+socks-1;
            }
            else{
                socks+=2*(temp/2);
                p+=temp/2;
            }
        }
        
        if(k<=p+oneCount){
            return socks+(k-p);
        }
        return -1;
    }
}
