class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        if(a.length()!=b.length()){
            return false;
        }
        int[] arr1=new int[26],arr2=new int[26];
        for(int i=0;i<a.length();i++){
            arr1[a.charAt(i)-97]++;
        }
        for(int i=0;i<b.length();i++){
            arr2[b.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
