class TrieNode{
    char data;
    TrieNode[] children;
    boolean end;
    TrieNode(char data){
        children=new TrieNode[26];
        end=false;
    }
}
class StreamChecker {
    StringBuilder sb;
    TrieNode root;
    public StreamChecker(String[] words) {
        sb=new StringBuilder("");
        root=new TrieNode('.');
        for(String k:words){
            insert(root,k.length()-1,k);
        }
    }
    
    public boolean query(char letter) {
        sb.append(letter);
        if(search(sb.toString(),sb.length()-1,root)){
            return true;
        }
        return false;
    }
    public void insert(TrieNode root,int index,String s){
        TrieNode[] children=root.children;
        int temp=s.charAt(index)-97;
        if(children[temp]==null){
            children[temp]=new TrieNode(s.charAt(index));
            if(index==0){
                children[temp].end=true;
                return;
            }
            insert(children[temp],index-1,s);
        }
        else{
            if(index==0){
                children[temp].end=true;
                return;
            }
            insert(children[temp],index-1,s);
        }
    }
    public boolean search(String s,int index,TrieNode root){
        if(root.end==true){
            return true;
        }
        if(index==-1){
            return false;
        }
        TrieNode[] children=root.children;
        int temp=s.charAt(index)-97;
        if(children[temp]==null){
            return false;
        }
        else{
            return search(s,index-1,children[temp]);
        }
    }
}

/**
 * Your StreamChecker object will be instantiated and called as such:
 * StreamChecker obj = new StreamChecker(words);
 * boolean param_1 = obj.query(letter);
 */
