class Solution 
{ 
    ArrayList<ArrayList<Integer>> solve(int n, int p, ArrayList<Integer> a ,ArrayList<Integer> b ,ArrayList<Integer> d) 
    { 
        int source,dest,count=0,j,min;
        int[] outGoing=new int[n];
        int[] inComing=new int[n];
        int[] outGoingDist=new int[n];
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        ArrayList<Integer> l;
        Arrays.fill(outGoing,-1);
        Arrays.fill(inComing,-1);
        Arrays.fill(outGoingDist,-1);
        //Fill outGoing pipes and incoming pipes of each pipes...
        for(int i=0;i<p;i++){
            source=a.get(i)-1;
            dest=b.get(i)-1;
            outGoing[source]=dest;
            inComing[dest]=source;
            outGoingDist[source]=d.get(i);
        }
        for(int i=0;i<n;i++){
            if(inComing[i]==-1){
                if(outGoing[i]==-1){
                    continue;
                }
                min=outGoingDist[i];
                count++;
                l=new ArrayList<>();
                j=i;
                l.add(i+1);
                while(outGoing[j]!=-1){
                    j=outGoing[j];
                    if(outGoing[j]!=-1){
                        min=Math.min(min,outGoingDist[j]);
                    }
                }
                l.add(j+1);
                l.add(min);
                al.add(l);
            }
        }
        return al;
    }
} 
