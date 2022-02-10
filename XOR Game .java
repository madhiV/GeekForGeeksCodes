class Solution{
    static int xorCal(int k){
        if(k==1){
            return 2;
        }
        int[] arr=new int[]{1,3,7,15,31,63,127,255,511};
        for(int i=1;i<arr.length;i++){
            if(k==arr[i]){
                return arr[i-1];
            }
        }
        return -1;
    }
}
