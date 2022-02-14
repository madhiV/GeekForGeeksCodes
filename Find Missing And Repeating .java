class Solve {
    int[] findTwoElement(int arr[], int n) {
        int k,r=0,temp;
        long sum=0,diff;
        //Finding diff between original sum and given sum...
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        diff=n+1;
        diff*=n;
        diff/=2;
        diff-=sum;
        //Finding repeating number...
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                continue;
            }
            k=arr[i];
            temp=arr[k-1];
            while(k-1!=i){
                if(arr[k-1]!=0){
                    temp=arr[k-1];
                    arr[k-1]=0;
                    k=temp;
                }
                else{
                    r=k;
                    break;
                }
            }
            if(r!=0){
                break;
            }
            if(arr[i]==0){
                r=k;
                break;
            }
            else{
                arr[k-1]=0;
            }
        }
        return new int[]{r,(int)(r+diff)};
    }
}
