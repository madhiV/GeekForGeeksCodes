class Solution
{
    int calc(ArrayList<Integer> l){
        int temp=0;
        int j=15;
        while(j>=0){
            temp+=l.get(j)*Math.pow(2,16-j-1);
            j--;
        }
        return temp;
    }
    ArrayList<Integer> rotate(int N, int D)
    {
        ArrayList<Integer> l=new ArrayList<>();
        ArrayList<Integer> al=new ArrayList<>();
        //Find binary rep
        int temp;
        while(N!=0){
            al.add(0,N%2);
            N/=2;
        }
        while(al.size()!=16){
            al.add(0,0);
        }
        ArrayList<Integer> al2=new ArrayList<>();
        al2.addAll(al);
        
        //left rotate
        for(int i=0;i<D;i++){
            temp=al.get(al.size()-1);
            al.remove(al.size()-1);
            al.add(0,temp);
        }
        l.add(calc(al));
        //Right rotate
        for(int i=0;i<D;i++){
            temp=al2.get(0);
            al2.remove(0);
            al2.add(temp);
        }
        l.add(0,calc(al2));
        return l;
    }
}
