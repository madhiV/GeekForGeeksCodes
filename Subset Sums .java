class Solution{
    ArrayList<Integer> al,arr;
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        this.arr=arr;
        al=new ArrayList<>();
        computePerm(0,0);
        Collections.sort(al);
        return al;
    }
    public void computePerm(int index,int sum){
        if(index==arr.size()){
            al.add(sum);
            return;
        }
        //Without
        computePerm(index+1,sum);
        //With
        computePerm(index+1,sum+arr.get(index));
    }
}
