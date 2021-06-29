class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> ans=new ArrayList<>();
        StringBuilder s=new StringBuilder("");
        if(m[0][0]==0){
            return ans;
        }
        findPaths(0,0,m,s,ans);
        return ans;
    }
    static void findPaths(int i,int j,int[][] m,StringBuilder s,ArrayList<String> ans){
        if(i==m.length-1 && j==m.length-1){
            ans.add(s.toString());
            return;
        }
        m[i][j]=0;
        //Down
        if(i+1!=m.length && m[i+1][j]!=0){
            s.append("D");
            findPaths(i+1,j,m,s,ans);
            s.deleteCharAt(s.length()-1);
        }
        //Left
        if(j-1!=-1 && m[i][j-1]!=0){
            s.append("L");
            findPaths(i,j-1,m,s,ans);
            s.deleteCharAt(s.length()-1);
        }
        //Right
        if(j+1!=m.length && m[i][j+1]!=0){
            s.append("R");
            findPaths(i,j+1,m,s,ans);
            s.deleteCharAt(s.length()-1);
        }
        //Up
        if(i-1!=-1 && m[i-1][j]!=0){
            s.append("U");
            findPaths(i-1,j,m,s,ans);
            s.deleteCharAt(s.length()-1);
        }
        m[i][j]=1;
    }
}
