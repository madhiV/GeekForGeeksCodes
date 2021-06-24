import java.util.*;
class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int count =0;
        HashMap<Character,ArrayList<String>> dic=new HashMap<>();
        for(char i='a';i<='z';i++){
            dic.put(i,new ArrayList<>());
        }
        for(int i=0;i<words.length;i++){
            dic.get(words[i].charAt(0)).add(words[i]);
        }
        String temp;
        ArrayList<String> al,l;
        for(int i=0;i<s.length();i++){
            al=dic.get(s.charAt(i));
            l=new ArrayList<String>();
            l.addAll(al);
            al.removeAll(al);
            for(int j=0;j<l.size();j++){
                if(l.get(j).length()==1){
                    count++;
                    continue;
                }
                temp=l.get(j);
                dic.get(temp.charAt(1)).add(temp.substring(1,temp.length()));
            }
        }
        return count;
    }
}
