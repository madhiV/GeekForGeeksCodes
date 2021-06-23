class Solution {
    
    static int maxDiamonds(int[] A, int N, int K) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<N;i++){
            pq.add(A[i]);
        }
        int temp,sum=0;
        while(K!=0){
            temp=pq.poll();
            sum+=temp;
            pq.add(temp/2);
            K--;
        }
        return sum;
    }
}
