class Solution{
    
    int bellNumber(int N){
        int mod=1000000007;
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        ArrayList<Integer> temp,l;
        l=new ArrayList<>();
        l.add(1);
        al.add(l);
        for(int i=1;i<N;i++){
            temp=al.get(al.size()-1);
            l=new ArrayList<>();
            l.add(temp.get(temp.size()-1));
            for(int j=1;j<=i;j++){
                l.add((temp.get(j-1)+l.get(j-1))%mod);
             }
             al.add(l);
        }
        l=al.get(al.size()-1);
        return l.get(l.size()-1);
    }
}
