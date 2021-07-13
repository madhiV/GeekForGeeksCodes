class Solution{
    int longestUniqueSubsttr(String S){
        Set<Character> set=new HashSet<>();
        int max=0,j=0;
        for(int i=0;i<S.length();i++){
            if(set.contains(S.charAt(i))){
                while(S.charAt(j)!=S.charAt(i)){
                    set.remove(S.charAt(j));
                    j++;
                }
                j++;
            }
            else{
                set.add(S.charAt(i));
                max=Math.max(max,i-j+1);
            }
        } 
        return max;
    }
}
