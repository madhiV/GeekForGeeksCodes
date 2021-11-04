class Compute
{
    boolean find4Numbers(int A[], int n, int X) 
    {
        int l,h,req,sum;
        Arrays.sort(A);
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                req=X-(A[i]+A[j]);
                l=j+1;
                h=n-1;
                while(l<h){
                    sum=A[l]+A[h];
                    if(sum==req){
                        return true;
                    }
                    if(sum<req){
                        l++;
                    }
                    else{
                        h--;
                    }
                }
            }
        }
        return false;
    }
}
