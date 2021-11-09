class Solution {
    List<String> l;
    public List<String> AllParenthesis(int n) 
    {
        l=new LinkedList<>();
        computeStrings(new StringBuilder(""),0,n,n);
        return l;
    }
    public void computeStrings(StringBuilder sb,int st,int o,int c){
        if(o==0 && c==0){
            if(st==0){
                l.add(sb.toString());
            }
            return;
        }
        if(st>0){
            sb.append(')');
            computeStrings(sb,st-1,o,c-1);
            sb.setLength(sb.length()-1);
        }
        if(o>0){
            sb.append('(');
            computeStrings(sb,st+1,o-1,c);
            sb.setLength(sb.length()-1);
        }
    }
}
