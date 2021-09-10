class Solution
{
    //Function to find the minimum indexed character.
    public static int minIndexChar(String str, String patt)
    {
        int index=-1;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<patt.length();i++){
            set.add(patt.charAt(i));
        }
        for(int i=0;i<str.length();i++){
            if(set.contains(str.charAt(i))){
                index=i;
                break;
            }
        }
        return index;
    }
}
