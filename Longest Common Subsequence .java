class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
        int l1=s1.length(),l2=s2.length();
        int[][] table=new int[l1+1][l2+1];
        for(int i=1;i<l1+1;i++){
            for(int j=1;j<l2+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    table[i][j]=table[i-1][j-1]+1;
                }
                else{
                    table[i][j]=Math.max(table[i-1][j],table[i][j-1]);
                }
            }
        }
        return table[l1][l2];
    }
    
}
