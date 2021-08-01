class Solve {
    // m is maximum of number zeroes allowed to flip
    int findZeroes(int arr[], int n, int m) {
        int start=0,max=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=1){
                if(m==0){
                    while(start<=i && arr[start]!=0){
                        start++;
                    }
                    start++;
                }
                else{
                    m--;
                    max=Math.max(max,i-start+1);
                }
            }
            else{
                max=Math.max(max,i-start+1);
            }
        }
        return max;
    }
}
