class GfG
{
    int maxLen(int arr[], int n)
    {
        Map<Integer,Integer> map=new HashMap<>();
        int max=0,prevIndex;
        map.put(arr[0],0);
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
            prevIndex=map.getOrDefault(arr[i],-1);
            if(arr[i]==0){
                max=Math.max(max,i+1);
            }
            if(prevIndex!=-1){
                max=Math.max(max,i-prevIndex);
            }
            else{
                map.put(arr[i],i);
            }
        }
        return max;
    }
