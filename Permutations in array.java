class Solution {
    public boolean isPossible(long a[], long b[], long n, long k) {
        PriorityQueue<Long> pq1=new PriorityQueue<>();
        PriorityQueue<Long> pq2=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            pq1.add(a[i]);
        }
        for(int i=0;i<n;i++){
            pq2.add(b[i]);
        }
        while(!pq1.isEmpty()){
            if(pq1.poll()+pq2.poll()<k){
                return false;
            }
        }
        return true;
    }
}
