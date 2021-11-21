class Solution {
    public int[] longestCommonPrefix(String s1, String s2){
        int start=-1,end=-1,length=0,i,j;
        for(j=0;j<s1.length();j++){//String 2->j  String 1 -> i
            i=0;
            while(j<s2.length()){
                if(s1.charAt(i)!=s2.charAt(j)){
                    break;
                }
                j++;
                i++;
            }
            if(length<i){
                length=i;
                end=i-1;
                start=0;
            }
        }
        return new int[]{start,end};
    }
}
