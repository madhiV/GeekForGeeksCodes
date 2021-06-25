class Solution{
    static int minimumNumberOfSwaps(String S){
        Queue<Character> q=new LinkedList<>();
        int swaps=0,st=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)==91){
                if(st<0){
                    swaps+=q.size();
                    q.remove();
                }
                st++;
            }
            else{
                if(st<=0){
                    q.add(']');
                }
                st--;
            }
        }
        return swaps;
    }
}
