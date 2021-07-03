class Solution {
    Set<String> s;
    public List<String> find_permutation(String S) {
        s=new TreeSet<>();
        Set<Integer> included=new HashSet<>();
        ArrayList<String> al=new ArrayList<>();
        StringBuilder s=new StringBuilder("");
        find(S,s,included);
        al.addAll(this.s);
        return al;
    }
    void find(String S,StringBuilder t,Set<Integer> included){
        if(included.size()==S.length()){
            s.add(t.toString());
            return;
        }
        for(int i=0;i<S.length();i++){
            if(!included.contains(i)){
                included.add(i);
                t.append(S.charAt(i));
                find(S,t,included);
                t.deleteCharAt(t.length()-1);
                included.remove(i);
            }
        }
    }
}
