class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        Queue<Long> q=new LinkedList<>();
        long curr,temp;
        int index=K;
        long[] ans=new long[N-K+1];
        for(int i=0;i<K;i++){
            if(A[i]>=0){
                q.add((long)0);
            }
            else{
                q.add(A[i]);
            }
        }
        for(int i=0;i<N-K+1;i++){
            if(q.size()==K){
                temp=q.poll();
            }
            else{
                temp=0;
            }
            if(temp==0){
                while(!q.isEmpty()){
                    if(q.peek()<0){
                        temp=q.peek();
                        break;
                    }
                    else{
                        q.poll();
                    }
                }
            }
            ans[i]=temp;
            if(index==N){
                break;
            }
            if(A[index]<0){
                q.add(A[index]);
            }
            else{
                q.add((long)0);
            }
            index++;
        }
        return ans;
    }
}
