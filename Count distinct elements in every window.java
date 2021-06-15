class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        Queue<Integer> q=new LinkedList<>();
        ArrayList<Integer> al=new ArrayList<>();
        HashMap<Integer,Integer> dic=new HashMap<>();
        int i=0,count=0,temp;
        while(i!=n){
            q.add(A[i]);
            if(dic.containsKey(A[i])){
                dic.put(A[i],dic.get(A[i])+1);
            }
            else{
                dic.put(A[i],1);
                count++;
            }
            if(q.size()==k){
                temp=q.peek();
                al.add(count);
                if(dic.get(temp)==1){
                    dic.remove(temp);
                    count--;
                }
                else{
                    dic.put(temp,dic.get(temp)-1);
                }
                q.remove();
            }
            i++;
        }
        return al;
    }
}
