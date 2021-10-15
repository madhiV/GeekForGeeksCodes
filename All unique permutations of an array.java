class Solution {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        int[] a=new int[n];
        int i=0;
        for(int k:arr){
            a[i]=k;
            i++;
        }
        computePerm(al,0,n,new boolean[n],new int[n],a,new HashSet<>());
        Collections.sort(al,new Comparator<ArrayList<Integer>>(){
                public int compare(ArrayList<Integer> a,ArrayList<Integer> b){
                    for(int i=0;i<a.size();i++){
                        if(a.get(i)<b.get(i)){
                            return -1;
                        }
                        else if(a.get(i)>b.get(i)){
                            return 1;
                        }
                    }
                    return 1;
                }
            });
        return al;
    }
    static void computePerm(ArrayList<ArrayList<Integer>> al,int pos,int n,boolean[] included,int[] ele,int[] arr,Set<ArrayList<Integer>> set){
        if(pos==n){
            ArrayList<Integer> l=new ArrayList<>();
            for(int k:ele){
                l.add(k);
            }
            if(!set.contains(l)){
                set.add(l);
                al.add(l);
            }
            return;
        }
        for(int i=0;i<n;i++){
            if(!included[i]){
                included[i]=true;
                ele[pos]=arr[i];
                computePerm(al,pos+1,n,included,ele,arr,set);
                included[i]=false;
            }
        }
    }
};
