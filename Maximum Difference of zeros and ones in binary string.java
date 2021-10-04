class Solution {
    int maxSubstring(String S) {
        int prev=-1,max=-1;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='1'){
                prev=Math.max(-1,prev-1);
            }
            else{
                prev=Math.max(prev+1,1);
                max=Math.max(max,prev);
            }
        }
        return max;
    }
}
