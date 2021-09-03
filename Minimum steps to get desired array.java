class Solution {
    int countMinOperations(int[] arr, int n) {
        int count=0,ans=0;
        boolean flag;
        for(int k=0;k<Integer.MAX_VALUE;k++){
            flag=true;
            for(int i=0;i<n;i++){
                if(arr[i]%2==1){
                    count++;
                    arr[i]--;
                }
                if(arr[i]!=0){
                    flag=false;
                }
            }
            if(flag){
                break;
            }
            for(int i=0;i<n;i++){
                arr[i]/=2;
            }
            count++;
        }
        return count;
    }
}
