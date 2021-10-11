class Solution
{
    public int[][] overlappedInterval(int[][] Intervals)
    {
        PriorityQueue<int[]> pq=new PriorityQueue<>(
            new Comparator<int[]>(){
                @Override
                public int compare(int[] a,int[] b){
                    if(a[0]<b[0]){
                        return -1;
                    }
                    else if(a[0]==b[0]){
                        if(a[1]>b[1]){
                            return 1;
                        }
                        return -1;
                    }
                    else{
                        return 1;
                    }
                }
            });
        int x,y;
        int[] k;
        List<Integer> l;
        ArrayList<List<Integer>> al=new ArrayList<>();
        for(int i=0;i<Intervals.length;i++){
            pq.add(new int[]{Intervals[i][0],Intervals[i][1]});
        }
        k=pq.poll();
        x=k[0];
        y=k[1];
        while(!pq.isEmpty()){
            k=pq.poll();
            if(k[0]<=y){
                y=Math.max(y,k[1]);
            }
            else{
                l=new LinkedList<>();
                l.add(x);
                l.add(y);
                al.add(l);
                x=k[0];
                y=k[1];
            }
        }
        l=new LinkedList<>();
        l.add(x);
        l.add(y);
        al.add(l);
        int[][] arr=new int[al.size()][2];
        for(int i=0;i<al.size();i++){
            l=al.get(i);
            arr[i][0]=l.get(0);
            arr[i][1]=l.get(1);
        }
        return arr;
    }
}
