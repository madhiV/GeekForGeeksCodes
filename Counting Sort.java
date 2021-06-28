class Solution
{
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    public static String countSort(String arr)
    {
        int[] count=new int[27];
        char[] ans=new char[arr.length()+1];
        StringBuilder s=new StringBuilder("");
        for(int i=0;i<arr.length();i++){
            count[arr.charAt(i)-96]+=1;
            s.append('a');
        }
        for(int i=1;i<27;i++){
            count[i]+=count[i-1];
        }
        for(int i=0;i<arr.length();i++){
            ans[count[arr.charAt(i)-96]]=arr.charAt(i);
            count[arr.charAt(i)-96]-=1;
        }
        for(int i=1;i<arr.length()+1;i++){
            s.setCharAt(i-1,ans[i]);
        }
        return s.toString();
    }
}
